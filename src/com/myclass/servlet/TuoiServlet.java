package com.myclass.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TuoiServlet extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doGet(req, resp);
        //tinh tuoi
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        
        //lay thong tin
//        String hoTen = req.getParameter("fullname");
//        String tuoi = req.getParameter("year");
//        
//        System.err.println("Họ Tên :" + hoTen);
//        System.err.println("Tuổi :" + tuoi);
//        PrintWriter writer = resp.getWriter();
        
        RequestDispatcher dispatcher = req.getRequestDispatcher("/WEB-INF/age/index.jsp");
        dispatcher.forward(req,resp);
        //nhanh hơn
        //req.getRequestDispatcher("/WEB-INF/age/index.jsp").forward(req,resp);

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //super.doPost(req, resp);
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        req.setCharacterEncoding("UTF-8");
        
        //lay thong tin
        String hoTen = req.getParameter("fullname");
        int namSinh = Integer.valueOf(req.getParameter("year"));
        int namHienTai = Calendar.getInstance().get(Calendar.YEAR);
        
        int kqTuoi = namHienTai- namSinh;
        
        
        System.err.println("Họ Tên :" + hoTen);
        System.err.println("Tuổi :" + namSinh);
        System.err.println("kqTuoi: " + kqTuoi);
        
        //thêm thông tin tuổi vào request
        req.setAttribute("hoTen", hoTen);
        req.setAttribute("namSinh", namSinh);
        req.setAttribute("tuoiNguoiDung", kqTuoi);
        req.getRequestDispatcher("/WEB-INF/age/index.jsp").forward(req,resp);
//        
//        PrintWriter writer = resp.getWriter();
//        writer.print("<from>");
//        writer.print("<h2>Trang Tính Tuổi POST</h2>");
//        
//        writer.print("<h4>Họ tên: "+ hoTen+ "</h4>");
//        writer.print("<h4>Năm sinh: " + namSinh + "</h4>");
//        writer.print("<h5>Tuổi: " + kqTuoi + "</h5></br>");
    }
}
