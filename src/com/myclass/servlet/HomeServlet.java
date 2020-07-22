package com.myclass.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns= {"/home","/home/blank","/home/404"})
public class HomeServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);
        
        String action = req.getServletPath();
        System.out.println(action);
        switch(action) {
        case "/home":
            req.getRequestDispatcher("WEB-INF/home/index.jsp").forward(req, resp);
            break;
        case "/home/blank":
            req.getRequestDispatcher("/WEB-INF/home/blank.jsp").forward(req, resp);
            break;
        case "/home/404":
            req.getRequestDispatcher("/WEB-INF/home/404.jsp").forward(req, resp);
            break;
        default:
            break;
        }
    }
}
