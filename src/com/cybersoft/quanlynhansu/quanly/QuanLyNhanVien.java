package com.cybersoft.quanlynhansu.quanly;

import java.util.ArrayList;
import java.util.List;
import com.cybersoft.quanlynhansu.object.NhanVien;

public class QuanLyNhanVien {
	private List<NhanVien> dsNhanVien;
	
	public QuanLyNhanVien() {
		this.dsNhanVien = new ArrayList<NhanVien>();
		
	}
	
	public void themNhanVien(NhanVien sv) {
		this.dsNhanVien.add(sv);
	}
	public void xuatTatCaNhanVien() {
		for (NhanVien nv: this.dsNhanVien) {
			nv.xuatThongTinNhanVien();
		}
	}
}
