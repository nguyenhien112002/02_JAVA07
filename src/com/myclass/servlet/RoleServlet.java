package com.myclass.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/role","/role/add","/role/table"})
public class RoleServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        
        switch(action) {
        case "/role":
            req.getRequestDispatcher("/WEB-INF/role/index.jsp").forward(req, resp);
            break;
        case "/role/add":
            req.getRequestDispatcher("/WEB-INF/role/add.jsp").forward(req, resp);
            break;
        case "/role/table":
            req.getRequestDispatcher("/WEB-INF/role/table.jsp").forward(req, resp);
            break;
        default:
            break;
        }
    }
}
