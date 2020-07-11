<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <!-- nhớ import objiect -->>
<%@ page import="com.myclass.entity.Product" %>
<%@ page import="java.util.List" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>DANH SÁCH SẢN PHẨM</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css">
</head>
<body>
     <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
      <a class="navbar-brand" href="#">PRODUCT CRM</a>
      <ul class="navbar-nav">
        <li class="nav-item">
          <a class="nav-link" href="#">Trang chủ</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="#">Sản phẩm</a>
        </li>
      </ul>
    </nav>
    <div class="container">
        <div class="row mt-3">
            <div class="col-12">
                <h1>DANH SÁCH SẢN PHẨM</h1>
                <table class="table table-bordered mt-3">
                    <thead>
                      <tr>
                        <th>Id</th>
                        <th>Tên sản phẩm</th>
                        <th>Số lượng</th>
                        <th>Giá bán</th>
                        <th>#</th>
                      </tr>
                    </thead>
                    <tbody>
                      <tr>
                        <td>1</td>
                        <td>Nokia 1200</td>
                        <td>1000</td>
                        <td>280.000 đ</td>
                        <td>
                            <a href = <%= request.getContextPath()+"/product/edit" %> class="btn btn-sm btn-info">Sửa</a>
                            <a class="btn btn-sm btn-danger">Xóa</a>
                        </td>
                      </tr>
                      <!--  lặp lấy data hiển thị trên table tr -->
                      <% List<Product> list = (List<Product>)request.getAttribute("listProduct");%>
                      <% for(Product product : list){ %>
                        <tr>
	                        <td><%= product.getId() %></td>
	                        <td><%= product.getName() %></td>
	                        <td><%= product.getQuantity() %></td>
	                        <td><%= product.getPrice() %> đ</td>
	                        <td>
	                            <a href = <%= request.getContextPath()+"/product/edit?id="+ product.getId() %> class="btn btn-sm btn-info">Sửa</a>
	                            <a class="btn btn-sm btn-danger">Xóa</a>
                            </td>
                        </tr>
                      <%}%>
                      
                    </tbody>
                  </table>
            </div>
        </div>
    </div>
</body>
</html>