package com.myclass.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.myclass.connection.JDBCConnection;
import com.myclass.entity.Job;
import com.myclass.entity.Role;

public class JobDao {
    
 // Phương thức lấy danh sách
    public List<Job> findAll() {
        List<Job> jobs = new ArrayList<Job>();
        // Connection conn = null;
        try (Connection conn = JDBCConnection.getConnection()) {

            String query = "Select * From jobs";
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);

            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                Job job = new Job();
                job.setId(resultset.getInt("id"));
                job.setName(resultset.getString("name"));
                job.setStartDate(resultset.getDate("start_date"));
                job.setEndDate(resultset.getDate("end_date"));
                // Thêm vào danh sách
                jobs.add(job);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return jobs;

    }
    
    public int add(Job job) {
        //sql data
        String query = "INSERT INTO jobs (name, startDate, endDate) VALUES (?,?,?);";
        try (Connection conn = JDBCConnection.getConnection()) {
            // System.out.println("Kết nối thành công");
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, job.getName());
            statement.setDate(2, job.getStartDate());
            statement.setDate(3, job.getEndDate());
            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }
    public int edit(Job job) {
        //sql data
        String query = "INSERT INTO jobs (name, startDate, endDate) VALUES (?,?,?);";
        try (Connection conn = JDBCConnection.getConnection()) {
            // System.out.println("Kết nối thành công");
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, job.getName());
            statement.setDate(2, job.getStartDate());
            statement.setDate(3, job.getEndDate());
            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
            return -1;
        }
        return 0;
    }
 // Phương thức lấy ra đối tượng role theo id
    public Job findById(int id) {
        Job job = new Job();
        String query = "Select * From jobs Where id =?";
        try (Connection conn = JDBCConnection.getConnection()) {
            // System.out.println("Kết nối thành công");
            // Tạo câu lệnh truy vấn sử dụng đối tượng PreparedStatemetn
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            // Thực thi câu lệnh truy vấn =>tạo đối tượng ResultSet lưu trữ tạm thời dữ liệu
            // lấy ra từ database
            ResultSet resultset = statement.executeQuery();

            while (resultset.next()) {
                job.setId(resultset.getInt("id"));
                job.setName(resultset.getString("name"));
                job.setStartDate(resultset.getDate("start_date"));
                job.setEndDate(resultset.getDate("end_date"));
                // Thêm vào danh sách
                break;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return job;
    }

}
