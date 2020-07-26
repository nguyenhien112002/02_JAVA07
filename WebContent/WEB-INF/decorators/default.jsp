<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="dec" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
    <link rel="icon" type="image/png" sizes="16x16" href="plugins/images/favicon.png">
    <dec:title></dec:title>
    <!-- Bootstrap Core CSS -->
    <jsp:include page="/WEB-INF/layout/header.jsp"></jsp:include>
</head>

<body>
    <!-- Preloader -->
    <div class="preloader">
        <div class="cssload-speeding-wheel"></div>
    </div>
    <div id="wrapper">
        <!-- Navigation -->
        <jsp:include page="/WEB-INF/layout/navbar.jsp"></jsp:include>
        <!-- Left navbar-header -->
        <jsp:include page="/WEB-INF/layout/sidebar.jsp"></jsp:include>
        <!-- CONTENT  -->
        <dec:body></dec:body>
    </div>
    <!-- /#wrapper -->
    <jsp:include page="/WEB-INF/layout/footer.jsp"></jsp:include>
    <dec:getProperty property="page.scripts1"></dec:getProperty>
    <dec:getProperty property="page.scripts2"></dec:getProperty>
    <dec:getProperty property="page.scripts3"></dec:getProperty>
</body>

</html>