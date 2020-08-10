package com.myclass.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

import org.mindrot.jbcrypt.BCrypt;

import com.myclass.dao.RoleDao;
import com.myclass.dao.UserDao;
import com.myclass.dto.LoginDto;
import com.myclass.dto.UserDto;
import com.myclass.entity.Role;
import com.myclass.entity.User;

@WebServlet(name = "UserServlet", urlPatterns = { "/user", "/user/add", "/user/edit", "/user/delete", "/user/details",
        "/user/password" })
@MultipartConfig(fileSizeThreshold = 1024 * 1024 * 2, maxFileSize = 1024 * 1024 * 50, maxRequestSize = 1024 * 1024 * 50)
public class UserController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private RoleDao roleDao = null;
    private UserDao userDao = null;

    public UserController() {
        roleDao = new RoleDao();
        userDao = new UserDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        switch (action) {
        case "/user":
            List<UserDto> listuUsers = userDao.findAllWithRole();
            req.setAttribute("users", listuUsers);
            req.getRequestDispatcher("/WEB-INF/views/user/index.jsp").forward(req, resp);
            break;
        case "/user/add":
            req.setAttribute("roles", roleDao.findAll());
            req.getRequestDispatcher("/WEB-INF/views/user/add.jsp").forward(req, resp);
            break;
        case "/user/edit":
            int id = Integer.valueOf(req.getParameter("id"));
            User user = userDao.findById(id);
            req.setAttribute("user", user);
            req.setAttribute("roles", roleDao.findAll());
            req.getRequestDispatcher("/WEB-INF/views/user/edit.jsp").forward(req, resp);
            break;
        case "/user/password":
            req.getRequestDispatcher("/WEB-INF/views/user/password.jsp").forward(req, resp);
            break;
        case "/user/details":
            req.getRequestDispatcher("/WEB-INF/views/user/details.jsp").forward(req, resp);
            break;
        case "/user/delete":
            int idDel = Integer.valueOf(req.getParameter("id"));
            userDao.deleteById(idDel);
            resp.sendRedirect(req.getContextPath() + "/user");
            break;
        default:
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        String action = req.getServletPath();

        // int id = Integer.valueOf(req.getParameter("id"));
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String fullname = req.getParameter("fullname");
        int roleId = Integer.valueOf(req.getParameter("roleId"));
        String avatar = saveFile(req);

        User user;// = new User(email, password, fullname, avatar, roleId);

        switch (action) {
        case "/user/add":
            // mã hóa mật khẩu
            user = new User(email, password, fullname, avatar, roleId);
            String hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));
            user.setPassword(hashed);
            userDao.add(user);
            break;
        case "/user/edit":
            int id = Integer.valueOf(req.getParameter("id"));
            user = userDao.findById(id);
            user.setEmail(email);
            user.setFullname(fullname);
            user.setAvatar(avatar);
            user.setRoleId(roleId);

            userDao.update(user);
            break;
        case "/user/password":
            String confirm = req.getParameter("confirm");
            if(password.equals(confirm)) {
                HttpSession session = req.getSession();
                LoginDto loginDto = (LoginDto)session.getAttribute("LOGIN");
                
                user = userDao.findById(loginDto.getId());
                user.setPassword(BCrypt.hashpw(password, BCrypt.gensalt(12)));
                userDao.update(user);
                //bat dang nhap lai sau khi doi mat khau
                resp.sendRedirect(req.getContextPath()+"/logout");
            }
            break;
        default:
            break;
        }
        resp.sendRedirect(req.getContextPath() + "/user");
    }

    private String saveFile(HttpServletRequest req) {
        String avatar = "";

        try {
            // lay hinh anh
            for (Part part : req.getParts()) {
                String contentDisp = part.getHeader("content-disposition");
                // System.out.println(contentDisp);
                // chuyen contentDisp thanh mang
                System.out.println("----------------------------");
                String[] arrFormData = contentDisp.split(";");
                String fileName = "";
                for (String item : arrFormData) {
                    System.out.println(item);
                    if (item.trim().startsWith("filename")) {
                        fileName = item.substring(11, item.length() - 1);
                        System.out.println(fileName);
                    }
                }
                // lay duong dan toi thu muc webcontent
                if (!fileName.isEmpty()) {
                    String appPath = req.getServletContext().getRealPath("");
                    // tao duong dan thu muc chua hinh upload
                    // String savePath = appPath + File.separator + "assets/uploads";
                    String savePath = appPath + "assets/uploads";
                    System.out.println(savePath);
                    // tao thu muc moi
                    File fileSaveDir = new File(savePath);
                    if (!fileSaveDir.exists()) {
                        fileSaveDir.mkdir();
                    }
                    part.write(savePath + File.separator + fileName);
                    avatar = "assets/uploads/" + fileName;
                }
            }

        } catch (Exception e) {

        }
        return avatar;
    }
}
