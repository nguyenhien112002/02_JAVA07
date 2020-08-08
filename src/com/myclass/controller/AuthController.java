package com.myclass.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.mindrot.jbcrypt.BCrypt;

import com.myclass.dao.UserDao;
import com.myclass.dto.LoginDto;
import com.myclass.dto.UserDto;
import com.myclass.entity.User;

@WebServlet(name = "LoginServlet", urlPatterns = { "/login", "/logout" })
public class AuthController extends HttpServlet {

    private static final long serialVersionUID = 1L;
    UserDao userDao = null;

    public AuthController() {
        userDao = new UserDao();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        System.out.println(action);
        switch (action) {
        case "/login":
            req.getRequestDispatcher("/WEB-INF/views/auth/login.jsp").forward(req, resp);
            break;
        case "/logout":
            HttpSession session = req.getSession();
            session.removeAttribute("LOGIN");
            resp.sendRedirect(req.getContextPath() + "/login");
            // req.getRequestDispatcher("/WEB-INF/views/auth/login.jsp").forward(req, resp);
            break;
        default:
            break;
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // UserDao userDao = new UserDao();
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        // Buoc 1: goi ham findByEmail de check email
        // -TH1: findByEmail tra ve null=>xuat thong bao cho nguoi dung
        // -TH2: findByEmail tra ve khac null, sang buoc 2
        LoginDto loginDto = userDao.checkLoginDto(email);
        if (loginDto == null) {
            // thong bao sai email/pass
            req.setAttribute("message", "Sai email, password!");
            req.getRequestDispatcher("WEB-INF/view/auth/login.jsp").forward(req, resp);
        }
        // Buoc 2: kiem tra password
        // -TH1: khong dung pass, thong bao cho nguoi dung
        // -TH2: qua buoc 3
        if (!BCrypt.checkpw(password, loginDto.getPassword())) {
            // thong bao sai email/pass
            req.setAttribute("message", "Sai email, password!");
            req.getRequestDispatcher("WEB-INF/view/auth/login.jsp").forward(req, resp);
        }
        // Buoc 3: luu thong tin user vao session
        HttpSession session = req.getSession();
        session.setAttribute("LOGIN", loginDto);

        // Buoc 4: chuyen huong sang trang chu
        resp.sendRedirect(req.getContextPath() + "/home");
    }
}
