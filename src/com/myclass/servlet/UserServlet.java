package com.myclass.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/user", "/user/add" })
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doGet(req, resp);

        String action = req.getServletPath();
        System.out.println(action);

        switch (action) {
        case "/user":
            req.getRequestDispatcher("/WEB-INF/user/index.jsp").forward(req, resp);
            break;
        case "/user/add":
            req.getRequestDispatcher("/WEB-INF/user/add.jsp").forward(req, resp);
            break;
        default:
            break;
        }
    }
}
