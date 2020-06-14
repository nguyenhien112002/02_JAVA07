package com.cybersoft.quanlynhansu.object;

public class NhanVien {
	int maSo;
	String hoTen;
	String soDienThoai;
	float ngayLamViec;
	float luongMotNgay;
	int maQuanLy;
	
	//constructor
	//cú pháp [access modifier] [tên Class] ([tham số]){}
	public NhanVien() {
		maSo = 333;
		hoTen = "nguyen";
		soDienThoai = "0908";
		ngayLamViec = 21;
		luongMotNgay = 100;
		maQuanLy = 0;
	}
	public NhanVien(int maSo, String hoTen,String soDienThoai,float luongMotNgay,float ngayLamViec, int maQuanLy ) {
		this.maSo = maSo;
		this.hoTen = hoTen;
		this.soDienThoai = soDienThoai;
		this.ngayLamViec = ngayLamViec;
		this.luongMotNgay = luongMotNgay;
		this.maQuanLy = maQuanLy;
	}
	//getter and setter
	public int getMaSo() {
		return maSo;
	}
	public void setMaSo(int maSo) {
		this.maSo = maSo;
	}
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public String getSoDienThoai() {
		return soDienThoai;
	}
	public void setSoDienThoai(String soDienThoai) {
		this.soDienThoai = soDienThoai;
	}
	public float getNgayLamViec() {
		return ngayLamViec;
	}
	public void setNgayLamViec(float ngayLamViec) {
		this.ngayLamViec = ngayLamViec;
	}
	public float getLuongMotNgay() {
		return luongMotNgay;
	}
	public void setLuongMotNgay(float luongMotNgay) {
		this.luongMotNgay = luongMotNgay;
	}
	public int getMaQuanLy() {
		return maQuanLy;
	}
	public void setMaQuanLy(int maQuanLy) {
		this.maQuanLy = maQuanLy;
	}
	
	//methods
	public float tinhLuong() {
		 return ngayLamViec*luongMotNgay;
	}
	
	public void xuatThongTinNhanVien() {
		System.out.println("Thông tin nhân viên: ");
		System.out.println("Mã số: " + maSo);
		System.out.println("Tên: " + hoTen);
		System.out.println("Số ĐT: " + soDienThoai);
	}
}
