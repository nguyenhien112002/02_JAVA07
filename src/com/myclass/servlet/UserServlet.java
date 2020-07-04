package com.myclass.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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

        PrintWriter writer = resp.getWriter();
        writer.print("<form action = '/BaiTap/age' method = 'POST'>");
        writer.print("<h2>Nhập Thông Tin</h2>");
        writer.print("<label >Họ tên: </label></br>");
        writer.print("<input type = 'text' name = 'fullname'></br></br>");

        writer.print("<label >Năm sinh: </label></br>");
        writer.print("<input type = 'text' name = 'year'></br></br>");

        writer.print("<button type = 'submit'>Tính Tuổi</button></br></br>");

        //writer.print("<label>Tuổi: </label></br>");
        writer.print("</form>");

        writer.close();

    }
    
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        // TODO Auto-generated method stub
//        //super.doPost(req, resp);
//        resp.setContentType("text/html");
//        resp.setCharacterEncoding("UTF-8");
//
//        PrintWriter writer = resp.getWriter();
//        writer.print("<form action = '/BaiTap/age' method = 'POST'>");
//        writer.print("<h2>Nhập Thông Tin</h2>");
//        writer.print("<label >Họ tên: </label></br>");
//        writer.print("<input type = 'text' name = 'fullname'></br></br>");
//
//        writer.print("<label >Năm sinh: </label></br>");
//        writer.print("<input type = 'text' name = 'year'></br></br>");
//
//        writer.print("<button type = 'submit'>Tính Tuổi</button></br></br>");
//
//        //writer.print("<label>Tuổi: </label></br>");
//        writer.print("</form>");
//
//        writer.close();
//    }

}
