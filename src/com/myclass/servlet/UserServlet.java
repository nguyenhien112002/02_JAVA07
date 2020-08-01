package com.myclass.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.mindrot.jbcrypt.BCrypt;

import com.myclass.dao.RoleDao;
import com.myclass.dao.UserDao;
import com.myclass.dto.UserDto;
import com.myclass.entity.Role;
import com.myclass.entity.User;

@WebServlet(name = "UserServlet", urlPatterns = { "/user", "/user/add", "/user/edit", "/user/delete", "/user/details" })
public class UserServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private RoleDao roleDao = null;
    private UserDao userDao = null;

    public UserServlet() {
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

        //int id = Integer.valueOf(req.getParameter("id"));
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String fullname = req.getParameter("fullname");
        String avatar = req.getParameter("avatar");
        int roleId = Integer.valueOf(req.getParameter("role_id"));

        User user = new User(email, password, fullname, avatar, roleId);
        
        switch (action) {
        case "/user/add":
            //mã hóa mật khẩu
            String hashed = BCrypt.hashpw(password, BCrypt.gensalt(12));
            user.setPassword(hashed);
            userDao.add(user);
            break;
        case "/user/edit":
            userDao.update(user);
            break;
        default:
            break;
        }
        resp.sendRedirect(req.getContextPath() + "/user");
    }
}
