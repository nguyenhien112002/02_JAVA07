package com.cybersoft.quanlynhansu.object;

public class NhanSu {
	
	//properties
		protected static int maSo = 0;
		protected String hoTen;
		protected String soDienThoai;
		protected float ngayLamViec;
		protected float luongMotNgay;
		
		//getter and setter
		public int getMaSo() {
			return maSo;
		}
		public void setMaSo(int maSo) {
			NhanSu.maSo = maSo;
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
		
		//construtors
		public NhanSu(String hoTen) {
			this.hoTen = "A";
		}
		
		public NhanSu() {
			this.hoTen = "nguyen";
			this.soDienThoai = "0908";
			this.ngayLamViec = 21;
			this.luongMotNgay = 100;		}
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
		
		public static int getMaSoTuTang() {
			return ++maSo;
		}
		



}
