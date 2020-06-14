package com.cybersoft.quanlynhansu.object;
import  com.cybersoft.quanlynhansu.quanly.*;

public class CongTy {
	private String tenCongTy;
	private String maSoThue;
	private double doanhThu;
	
	QuanLyNhanVien qlyNhanVien;
	

	//getter and setter
	
	public String getTenCongTy() {
		return tenCongTy;
	}
	public void setTenCongTy(String tenCongTy) {
		this.tenCongTy = tenCongTy;
	}
	public String getMaSoThue() {
		return maSoThue;
	}
	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}
	
	//methods
}
