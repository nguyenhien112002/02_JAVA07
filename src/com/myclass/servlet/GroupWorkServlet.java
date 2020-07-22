package com.myclass.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/groupwork","/groupwork/add","/groupwork/table","/groupwork/details"})
public class GroupWorkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getServletPath();
        
        switch(action) {
        case "/groupwork":
            req.getRequestDispatcher("WEB-INF/groupwork/index.jsp").forward(req, resp);
            break;
        case "/groupwork/add":
            req.getRequestDispatcher("/WEB-INF/groupwork/add.jsp").forward(req, resp);
            break;
        case "/groupwork/table":
            req.getRequestDispatcher("/WEB-INF/groupwork/table.jsp").forward(req, resp);
            break;
        case "/groupwork/details":
            req.getRequestDispatcher("/WEB-INF/groupwork/details.jsp").forward(req, resp);
            break;
        default:
            break;
        }
    }
}
