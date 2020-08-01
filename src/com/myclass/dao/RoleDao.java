package com.myclass.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myclass.connection.JDBCConnection;
import com.myclass.entity.Role;
import com.mysql.cj.xdevapi.PreparableStatement;
import com.opensymphony.module.sitemesh.html.tokenizer.Parser.ReusableToken;
import com.opensymphony.module.sitemesh.util.ClassLoaderUtil;

public class RoleDao {

    private List<Role> list = null;

    public RoleDao() {
        list = new ArrayList<Role>();
    }

    // Phương thức lấy danh sách
    public List<Role> findAll() {
        List<Role> roles = new ArrayList<Role>();
        // Connection conn = null;
        try (Connection conn = JDBCConnection.getConnection()) {

            String query = "Select * From roles";
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);

            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                Role role = new Role();
                role.setId(resultset.getInt("id"));
                role.setName(resultset.getString("name"));
                role.setDescription(resultset.getString("description"));
                // Thêm vào danh sách
                roles.add(role);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roles;

    }

    // Phương thức lấy ra đối tượng role theo id
    public Role findById(int id) {
        Role role = new Role();
        try (Connection conn = JDBCConnection.getConnection()) {
            // System.out.println("Kết nối thành công");
            String query = "Select * From roles Where id =?";
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                role.setId(resultset.getInt("id"));
                role.setName(resultset.getString("name"));
                role.setDescription(resultset.getString("description"));
                // Thêm vào danh sách
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return role;
    }

    // Phương thức thêm mới
    public void add(Role role) {
        list.add(role);
    }

    // Phương thức cập nhật
    public void update(Role role) {
        String query = "Update roles set name = ?, description = ? where id = ?";
        try (Connection conn = JDBCConnection.getConnection()) {
            // System.out.println("Kết nối thành công");
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, role.getName());
            statement.setString(2, role.getDescription());
            statement.setInt(3, role.getId());
            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Phương thức xóa đối tượng role theo id
    public void deleteById(int id) {
        String query = "Delete From roles where id = ?";
        try (Connection conn = JDBCConnection.getConnection()) {
            // System.out.println("Kết nối thành công");
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
