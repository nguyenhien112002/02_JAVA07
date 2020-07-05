package com.myclass.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding("UTF-8");
//        
//      //Chuyển tiếp request qua trang JSP
//        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/login/login.jsp");
//        dispatcher.forward(req,resp);
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doPost(req, resp);
        
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        
      //Chuyển tiếp request qua trang JSP
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/login/login.jsp");
        dispatcher.forward(req,resp);
        
        //lấy thông tin form
        //String email = 
        
        //check mật khẩu thông tin
        
        //redirect
        
        
       
    }

}
