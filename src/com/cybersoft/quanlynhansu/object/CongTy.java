package com.cybersoft.quanlynhansu.object;

import java.util.ArrayList;
import java.util.List;

public class CongTy {

 // properties
    String tenCongTy;
    String maSoThue;
    double doanhThu;
    List<NhanSu> danhSachNhanSu;
    
    //Getter and Setter
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
    //Contructor
    public CongTy() {
        danhSachNhanSu = new ArrayList<NhanSu>();
    }
    
    //thêm
    public void themNhanSu(NhanSu ns) {
        danhSachNhanSu.add(ns);
    }
    
    public NhanSu getNhanSu(int maso) {
        NhanSu ns = new NhanSu();
        
        
        return ns;
    }
    //Xóa 
    public void xoaNhanSu(int maso) {
        

    }
    //Sửa
    public void suaNhanSu(int maSo, NhanSu nhanSu) {
        for(NhanSu ns: danhSachNhanSu) {
            if(ns.getMaSo() == maSo) {
                ns.hoTen = nhanSu.getHoTen();
                ns.soDienThoai = nhanSu.getSoDienThoai();
                ns.ngayLamViec = nhanSu.getNgayLamViec();
                ns.setNgayLamViec(nhanSu.getNgayLamViec());// = nhanSu.getNgayLamViec();
            }
        }

    }
    
    //Xuất thông tin công ty
    public void xuatThongTinNhanSuCongTy() {
        System.out.println("======THÔNG TIN CÔNG TY======");
        for(NhanSu ns : danhSachNhanSu)
            ns.xuatThongTinNhanVien();
    }
    
    
    
}
