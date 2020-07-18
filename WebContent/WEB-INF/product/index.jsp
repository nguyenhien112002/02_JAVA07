<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- nhớ import objiect -->
>
<%@ page import="com.myclass.entity.Product"%>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DANH SÁCH SẢN PHẨM</title>
<link rel="stylesheet"
  href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
  <nav class="navbar navbar-expand-sm bg-dark navbar-dark"> <a
    class="navbar-brand" href="#">PRODUCT CRM</a>
  <ul class="navbar-nav">
    <li class="nav-item"><a class="nav-link" href="#">Trang chủ</a></li>
    <li class="nav-item"><a class="nav-link" href="#">Sản phẩm</a></li>
  </ul>
  </nav>
  <div class="container">
    <div class="row mt-3">
      <div class="col-12">
        <h1>DANH SÁCH SẢN PHẨM</h1>
        <a href="<%=request.getContextPath()%>/product/add"
          class="btn btn-primary">Thêm Mới</a>
        <table class="table table-bordered mt-3">
          <thead>
            <tr>
              <th>Id</th>
              <th>Loại sản phẩm</th>
              <th>Tên sản phẩm</th>
              <th>Số lượng</th>
              <th>Giá bán</th>
              <th>Chỉnh sửa</th>
            </tr>
          </thead>
          <tbody>
            <!--  lặp lấy data hiển thị trên table tr -->
            <c:forEach items="${listProduct}" var="product">
              <tr>
                <td>${product.id}</td>
                <td><c:forEach items="${listCategory}"
                    var="category">
                    <c:if test="${product.categoryId == category.id}">${category.name }</c:if>
                  </c:forEach></td>
                <td>${product.name}</td>
                <td>${product.quantity}</td>
                <td>${product.price}</td>
                <td><a
                  href="<%= request.getContextPath()%>/product/edit?id=${product.id}"
                  class="btn btn-sm btn-info">Sửa</a> <a
                  href="<%= request.getContextPath()%>/product/delete?id=${product.id}"
                  class="btn btn-sm btn-danger">Xóa</a></td>
              </tr>
            </c:forEach>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</body>
</html>