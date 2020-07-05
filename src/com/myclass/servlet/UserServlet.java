package com.myclass.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UserServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // super.doGet(req, resp);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");

        //Chuyển tiếp request qua trang JSP
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/user/index.jsp");
        dispatcher.forward(req,resp);

    }
   

}
