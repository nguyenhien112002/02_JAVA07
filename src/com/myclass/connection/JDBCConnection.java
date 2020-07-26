package com.myclass.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCConnection {
	public static Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/crm?serverTimezone=UTC", "root",
					"Nh@090886");
			return conn;
			
		} catch (ClassNotFoundException e) {
			System.out.println("Không tìm thấy Driver");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("Kết nối thất bại");
			e.printStackTrace();
		} 
		return null;
	}
	

}
