<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Danh sách thành viên</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <!-- Bootstrap CSS -->
    <jsp:include page="/WEB-INF/layout/head.jsp" />
</head>

<body>

    <div class="d-flex justify-content-between">
        <!-- SIDE BAR -->
        <jsp:include page="/WEB-INF/layout/sidebar.jsp" />
        <div id="admin-wrapper">
            <!-- HEADER -->
            <jsp:include page="/WEB-INF/layout/navbar.jsp" />
                    <!-- CONTENT -->
            <section id="admin-content" class="p-3">
                <h3 class="mb-3">Danh sách thành viên</h3>
                <div class="row">
                    <div class="col-md-8">
                        <a href="user-add.html" class="btn btn-primary">Thêm mới</a>
                    </div>
                    <div class="col-md-4">
                        <div class="input-group">
                            <input type="text" class="form-control" placeholder="Tìm kiếm...">
                            <div class="input-group-append">
                                <span class="input-group-text" id="basic-addon2"><i class="fa fa-search"></i></span>
                            </div>
                        </div>
                    </div>
                </div>
                <table class="table table-bordered table-hover mt-3">
                    <thead>
                        <tr>
                            <th>STT</th>
                            <th>Họ Tên</th>
                            <th>Email</th>
                            <th>Số ĐT</th>
                            <th>#</th>
                        </tr>
                    </thead>
                    <tbody>
                        <tr>
                            <td>1</td>
                            <td>Nguyễn Văn Tèo</td>
                            <td>teonguyen@gmail.com</td>
                            <td>098754636</td>
                            <td>
                                <a href="user-edit.html" class="btn btn-sm btn-info">
                                    <i class="fa fa-pencil-square-o"></i>
                                </a>
                                <a href="#" class="btn btn-sm btn-danger">
                                    <i class="fa fa-trash-o"></i>
                                </a>
                            </td>
                        </tr>
                        <tr>
                            <td>2</td>
                            <td>Nguyễn Thùy Linh</td>
                            <td>thuylinh@gmail.com</td>
                            <td>0919255678</td>
                            <td>
                                <a href="user-edit.html" class="btn btn-sm btn-info">
                                    <i class="fa fa-pencil-square-o"></i>
                                </a>
                                <a href="#" class="btn btn-sm btn-danger">
                                    <i class="fa fa-trash-o"></i>
                                </a>
                            </td>
                        </tr>
                    </tbody>
                </table>
            </section>
        </div>
    </div>
    <jsp:include page="/WEB-INF/layout/footer.jsp" />
</body>

</html>