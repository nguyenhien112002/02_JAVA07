<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- CONTENT -->
<!-- Page Content -->
<div id="page-wrapper">
  <div class="container-fluid">
    <div class="row bg-title">
      <div class="col-lg-3 col-md-4 col-sm-4 col-xs-12">
        <h4 class="page-title">Thêm mới quyền</h4>
      </div>
    </div>
    <!-- /.row -->
    <!-- .row -->
    <div class="row">
      <div class="col-md-2 col-12"></div>
      <div class="col-md-8 col-xs-12">
        <div class="white-box">
          <form class="form-horizontal form-material">
            <div class="form-group">
              <label class="col-md-12">Tên quyền</label>
              <div class="col-md-12">
                <input type="text" placeholder="Tên quyền"
                  class="form-control form-control-line" />
              </div>
            </div>
            <div class="form-group">
              <label class="col-md-12">Mô tả</label>
              <div class="col-md-12">
                <input type="text" placeholder="Mô tả"
                  class="form-control form-control-line" />
              </div>
            </div>
            <div class="form-group">
              <div class="col-sm-12">
                <button type="submit" class="btn btn-success">Add
                  Role</button>
                <a href="role-table.html" class="btn btn-primary">Quay
                  lại</a>
              </div>
            </div>
          </form>
        </div>
      </div>
      <div class="col-md-2 col-12"></div>
    </div>
    <!-- /.row -->
  </div>
  <!-- /.container-fluid -->
  <footer class="footer text-center"> 2018 &copy; myclass.com </footer>
</div>
<!-- /#page-wrapper -->

<!-- Custom Theme JavaScript -->
<content tag="scripts2">
<script src="<c:url value="/static/js/custom.min.js"></c:url>"></script>
</content>