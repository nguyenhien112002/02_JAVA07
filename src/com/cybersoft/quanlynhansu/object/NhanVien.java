package com.cybersoft.quanlynhansu.object;

public class NhanVien extends NhanSu {
    
    private int maQuanLy;
    //private int maSoA = NhanSu.getMaSoTuTang();
    public NhanVien(String ten, String SoDienThoai, float soNgayLamViec, int maQuanLy) {
        this.hoTen = ten;
        this.maSo = getMaSoTuTang();;
        this.soDienThoai = SoDienThoai;
        this.ngayLamViec = soNgayLamViec;
        this.luongMotNgay = 100;
        this.maQuanLy = maQuanLy;
    }
}
