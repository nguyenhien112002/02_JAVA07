package com.cybersoft.quanlynhansu.main;

import java.util.ArrayList;
import java.util.List;

import com.cybersoft.quanlynhansu.object.*;
import com.cybersoft.quanlynhansu.quanly.*;
public class MAIN {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// tao data nhan vien
		QuanLyNhanVien qlNhanVien = new QuanLyNhanVien();
		NhanVien nhanvien;
		nhanvien = new NhanVien(111, "NguyenHien","0968148",100,21,0);
		qlNhanVien.themNhanVien(nhanvien);
		nhanvien = new NhanVien(112, "NguyenHien1","0968148",100,21,0);
		qlNhanVien.themNhanVien(nhanvien);
		nhanvien.xuatThongTinNhanVien();
		//thêm nhan vien
		
		//QuanLyNhanVien qlNhanVien = new QuanLyNhanVien();
//		qlNhanVien.themNhanVien(nhanvien);
//		qlNhanVien.themNhanVien(nhanvien1);
//		qlNhanVien.xuatTatCaNhanVien();
		
		
	}
}

/*
 * 
 * NhanVien nhanvien = new NhanVien(111, "NguyenHien","0968148",100,21,0);
 * 
 * */
