<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Tuổi Người Dùng</title>
</head>
<body>
        <from>
        <h2>Trang Tính Tuổi</h2>
        <%
           String hoTen = request.getParameter("fullname");
           String namSinh = request.getParameter("year");
        %>
        <label>Họ tên: <%= hoTen %></label></br>
        
        <label>Năm sinh:<%= namSinh%> </label></br>
        <%
        int tuoi = (Integer)request.getAttribute("tuoiNguoiDung");
        %>
        <label>Tuổi: <%= tuoi %></label></br>
</body>
</html>