package com.myclass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myclass.connection.JDBCConnection;
import com.myclass.dto.LoginDto;
import com.myclass.dto.UserDto;
import com.myclass.entity.Role;
import com.myclass.entity.User;

public class UserDao {
    private List<User> list = null;

    public UserDao() {
        list = new ArrayList<User>();
    }

 // Phương thức lấy danh sách
    public LoginDto checkLoginDto(String email) {
        LoginDto dto = null;
        String query = "SELECT u.id, u.email, u.password, u.fullname, u.avatar, r.name as roleName "
                + "FROM users u JOIN roles r ON u.role_id = r.id Where email=?";
        try (Connection conn = JDBCConnection.getConnection()) {
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, email);
            // lấy ra từ database
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                dto = new LoginDto();
                dto.setId(resultset.getInt("id"));
                dto.setFullname(resultset.getString("fullname"));
                dto.setEmail(resultset.getString("email"));
                dto.setPassword(resultset.getString("password"));
                dto.setAvatar(resultset.getString("avatar"));
                dto.setRoleName(resultset.getString("roleName"));
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dto;
    }
    
    // Phương thức lấy danh sách
    public List<UserDto> findAllWithRole() {
        List<UserDto> users = new ArrayList<UserDto>();
        String query = "SELECT u.id, u.email, u.password, u.fullname, u.avatar, u.role_id, r.description as roleDesc FROM users u JOIN roles r ON u.role_id = r.id;";
        try (Connection conn = JDBCConnection.getConnection()) {

            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            // lấy ra từ database
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                UserDto user = new UserDto();
                user.setId(resultset.getInt("id"));
                user.setFullname(resultset.getString("fullname"));
                user.setEmail(resultset.getString("email"));
                user.setPassword(resultset.getString("password"));
                user.setAvatar(resultset.getString("avatar"));
                user.setRoleId(resultset.getInt("role_id"));
                user.setRoleDesc(resultset.getString("roleDesc"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    
 // Phương thức lấy danh sách
    public List<User> findAll() {
        List<User> users = new ArrayList<User>();
        String query = "Select * From users";
        try (Connection conn = JDBCConnection.getConnection()) {

            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            // lấy ra từ database
            ResultSet resultset = statement.executeQuery();
            while (resultset.next()) {
                User user = new User();
                user.setId(resultset.getInt("id"));
                user.setFullname(resultset.getString("fullname"));
                user.setEmail(resultset.getString("email"));
                user.setPassword(resultset.getString("password"));
                user.setAvatar(resultset.getString("avatar"));
                user.setRoleId(resultset.getInt("role_id"));
                users.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

    
    // Phương thức lấy ra đối tượng role theo id
    public User findById(int id) {
        User user = new User();
        String query = "Select * From users Where id =?";
        try (Connection conn = JDBCConnection.getConnection()) {
            // System.out.println("Kết nối thành công");
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                user.setId(resultset.getInt("id"));
                user.setFullname(resultset.getString("fullname"));
                user.setEmail(resultset.getString("email"));
                user.setPassword(resultset.getString("password"));
                user.setAvatar(resultset.getString("avatar"));
                user.setRoleId(resultset.getInt("roleId"));
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    // Phương thức thêm mới
    public void add(User user) {
        String query = "INSERT INTO users (email, password, fullname,avatar, role_id) VALUES (?,?,?,?,?);";
        try (Connection conn = JDBCConnection.getConnection()) {
            // System.out.println("Kết nối thành công");
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getFullname());
            statement.setString(4, user.getAvatar());
            statement.setInt(5, user.getRoleId());
            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Phương thức cập nhật
    public void update(User user) {
        String query = "Update users set email=?, password=?, fullname=?,avatar=?, role_id=? where id = ? ;";
        try (Connection conn = JDBCConnection.getConnection()) {
            // System.out.println("Kết nối thành công");
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, user.getEmail());
            statement.setString(2, user.getPassword());
            statement.setString(3, user.getFullname());
            statement.setString(4, user.getAvatar());
            statement.setInt(5, user.getRoleId());
            statement.setInt(6, user.getId());
            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Phương thức xóa đối tượng role theo id
    public void deleteById(int id) {
        String query = "Delete From users where id = ?";
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
    /*
     * ham lay thong tin user bang email
     * tham so email(lay tu form dang nhap)
     * tra ve: 
     *        null neu khong tim thay
     *        Doi tuong user chua thong tin tu db neu tim thay
     */
    public User findByEmail(String email) {
        String query = "Select * FROM users WHERE email = ?;";
        User user = null;
        try (Connection conn = JDBCConnection.getConnection()) {
            // Tạo câu lệnh truy vấn sử dụng PreparedStatement
            PreparedStatement statement = conn.prepareStatement(query);
            // Thay thế dấu ? bằng dữ liệu lấy ra từ đối tượng role
            statement.setString(1, email);
            // Thực thi câu lệnh truy vấn
            ResultSet resultSet = statement.executeQuery();
            
            while (resultSet.next()) {
                user = new User();
                user.setId(resultSet.getInt("id"));
                user.setFullname(resultSet.getString("fullname"));
                user.setPassword(resultSet.getString("password"));
                user.setEmail(resultSet.getString("email"));
                user.setAvatar(resultSet.getString("avatar"));
                user.setRoleId(resultSet.getInt("role_id"));
                break;
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
        return user;
    }
}
