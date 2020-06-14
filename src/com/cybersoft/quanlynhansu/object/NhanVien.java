package com.cybersoft.quanlynhansu.object;

public class NhanVien extends NhanSu {
	//constructor
	//cú pháp [access modifier] [tên Class] ([tham số]){}
	private int maQuanLy;
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


}
