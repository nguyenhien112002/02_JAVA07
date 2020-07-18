<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Thêm Sản Phẩm</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
    <h5>add</h5>
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <!-- Brand/logo -->
  <a class="navbar-brand" href="#">Logo</a>
  
  <!-- Links -->
  <ul class="navbar-nav">
    <li class="nav-item">
      <a class="nav-link" href="#">Link 1</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link 2</a>
    </li>
    <li class="nav-item">
      <a class="nav-link" href="#">Link 3</a>
    </li>
  </ul>
</nav>

<!-- nav end -->
<div class ="container">
    <div class="col- mx-auto">
        <h1 class="mt-3 mb-3 text-left">Thêm Sản Phẩm</h1>
        <div>
            <form action ="<%= request.getContextPath() %>/product/add"  method = "POST" >
                    <div class="form-group">
                        <label for="masp">Mã Sản Phẩm</label> <input type="number" name = "id"
                            class="form-control" placeholder="Nhập mã sản phẩm" id="masp">
                    </div>
                    <div class="form-group">
                        <label for="loaisp">Loại Sản Phẩm</label> 
                        <select class="form-control" placeholder="Loại sản phẩm" name="categoryid">
                            <c:forEach items="${listCategory}" var="category">
                                <option value="${category.id}">${category.name}</option>
                            </c:forEach>
                        </select>
                    </div>
                    <div class="form-group">
                        <label for="tensp">Tên Sản Phẩm</label> <input type="text" name = "name"
                            class="form-control" placeholder="Nhập tên sản phẩm" id="tensp">
                    </div>
                    <div class="form-group">
                        <label for="soluong">Số lượng</label> <input type="text" name = "quantity"
                            class="form-control" placeholder="Nhập số lượng" id="pwd">
                    </div>
                    <div class="form-group">
                        <label for="giaban">Giá bán</label> <input type="text" name = "price"
                            class="form-control" placeholder="Nhập giá bán" id="pwd">
                    </div>
                    <button type="submit" class="btn btn-primary">Lưu lại</button>
                </form>
        
        
        </div>
    </div>
</div>

    
</body>
</html>