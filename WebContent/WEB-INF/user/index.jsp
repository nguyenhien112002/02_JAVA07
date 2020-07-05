<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta charset="UTF-8">
	<title>Thông Tin User</title>
</head>
<body>
    <form action = '/BaiTap/age' method = 'POST'>
        <h2>Nhập Thông Tin</h2>
        <label >Họ tên: </label></br>
        <input type = 'text' name = 'fullname'></br></br>

        <label >Năm sinh: </label></br>
        <input type = 'text' name = 'year'></br></br>

        <button type = 'submit'>Tính Tuổi</button></br></br>

    </form>
</body>
</html>