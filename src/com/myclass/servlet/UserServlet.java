package com.myclass.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/user","/user/add","/user/table","/user/details"})
public class UserServlet extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        String action = req.getServletPath();
        
        switch(action) {
        case "/user":
            req.getRequestDispatcher("WEB-INF/user/index.jsp").forward(req, resp);
            break;
        case "/user/add":
            req.getRequestDispatcher("/WEB-INF/user/add.jsp").forward(req, resp);
            break;
        case "/user/table":
            req.getRequestDispatcher("/WEB-INF/user/table.jsp").forward(req, resp);
            break;
        case "/user/details":
            req.getRequestDispatcher("/WEB-INF/user/details.jsp").forward(req, resp);
            break;
        default:
            break;
        }
    }
}
