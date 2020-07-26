package com.myclass.dao;

import java.util.ArrayList;
import java.util.List;
import com.myclass.entity.User;

public class UserDao {
	private List<User> list = null;

	public UserDao() {
		list = new ArrayList<User>();
	}

	// Phương thức lấy danh sách
	public List<User> findAll() {
		return list;
	}

	// Phương thức lấy ra đối tượng role theo id
	public User findById(int id) {
		for (User user : list) {
			if (user.getId() == id) {
				return user;
			}
		}
		return null;
	}

	// Phương thức thêm mới
	public void add(User user) {
		list.add(user);
	}

	// Phương thức cập nhật
	public void update(User user) {
		for (User item : list) {
			if (item.getId() == user.getId()) {
				item.setEmail(user.getEmail());
				item.setPassword(user.getPassword());
				item.setFullname(user.getFullname());
				item.setAvatar(user.getAvatar());
				item.setRoleId(user.getRoleId());
			}
		}
	}

	// Phương thức xóa đối tượng role theo id
	public void deleteById(int id) {
		for (User user : list) {
			if (user.getId() == id) {
				list.remove(user);
				break;
			}
		}
	}
}
