package com.cybersoft.quanlynhansu.object;
import java.util.ArrayList;
import java.util.List;

import  com.cybersoft.quanlynhansu.quanly.*;

public class CongTy {
	private String tenCongTy;
	private String maSoThue;
	private double doanhThu;
	List<NhanSu> danhSachNhanSu;
	
	//constructor
	public CongTy() {
		danhSachNhanSu = new ArrayList<NhanSu>();
		
	}

	//getter and setter
	
	public String getTenCongTy() {
		return tenCongTy;
	}
	public String getMaSoThue() {
		return maSoThue;
	}
	public double getDoanhThu() {
		return doanhThu;
	}
	
	public List<NhanSu> getDanhSachNhanSu() {
		return danhSachNhanSu;
	}

	//methods
	public void themNhanSu(NhanSu ns) {
		danhSachNhanSu.add(ns);
	}
	
	public NhanSu getNhanSu(int maso) {
		for(int i = 0; i<danhSachNhanSu.size(); i++) {
			NhanSu ns = danhSachNhanSu.get(i);
			if(ns.getMaSo()== maso) {
				return ns;
			}
		}
		return null;
	}
	
	public void xoaNhanSu(int maso) {
		for(NhanSu ns:danhSachNhanSu) {
			if(ns.getMaSo()== maso) {
				danhSachNhanSu.remove(ns);
			}
		}
	}
	
	public void suaNhanSu(int maso, NhanSu nhanSu) {
		for(NhanSu ns: danhSachNhanSu) {
			if(ns.getMaSo()== maso) {
				ns.setHoTen(nhanSu.getHoTen());
				ns.setSoDienThoai(nhanSu.getSoDienThoai()); 
				ns.setNgayLamViec(nhanSu.getNgayLamViec());
			}
		}
	}
	
	public void xuatThongTinCongTy() {
		System.out.println("---Thông tin công ty---");
		for(NhanSu ns : danhSachNhanSu) {
			ns.xuatThongTinNhanVien();
		}
	}
	
	public double tongLuongCongTy() {
		double tongLuong = 0 ;
		for(NhanSu ns : danhSachNhanSu) {
			tongLuong += ns.tinhLuong();
		}
		return 0;
	}
	
	public NhanSu timTPLuongCaoNhat() {
		float maxLuong= 0;
		int maxLength = danhSachNhanSu.size();
		int viTriTPDauTien=1;
		
		for(int i= 0; i < maxLength; i++) {
			NhanSu ns = danhSachNhanSu.get(i);
			if(ns instanceof TruongPhong) {
				maxLuong = ns.tinhLuong();
				viTriTPDauTien = i;
				break;
			}
		}
		
		if(viTriTPDauTien == (maxLength -1)) {
			return danhSachNhanSu.get(viTriTPDauTien);
		}
		
		for(int i = viTriTPDauTien; i< maxLength; i++) {
			NhanSu ns = danhSachNhanSu.get(i);
			if(ns instanceof TruongPhong) {
				
				if (maxLuong < ns.tinhLuong()){
					maxLuong = ns.tinhLuong();
					viTriTPDauTien = i;
				}
			}
		}
		return danhSachNhanSu.get(viTriTPDauTien);
	}
				
	public NhanSu timTPCoNhieuNVNhat() {
		
		float maxLuong= 0;
		int maxLength = danhSachNhanSu.size();
		int viTriTPDauTien=1;
		
		for(int i= 0; i < maxLength; i++) {
			NhanSu ns = danhSachNhanSu.get(i);
			if(ns instanceof TruongPhong) {
				maxLuong = ns.tinhLuong();
				viTriTPDauTien = i;
				break;
			}
		}
		
		return danhSachNhanSu.get(viTriTPDauTien);
	}
	
	
}
