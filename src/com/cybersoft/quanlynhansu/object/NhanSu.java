package com.cybersoft.quanlynhansu.object;

public class NhanSu {

    // properties
    public static int maSoTuTang = 0;
    
    protected int maSo;
    protected String hoTen;
    protected String soDienThoai;
    protected float ngayLamViec;
    protected float luongMotNgay;
    
    //Getter and Setter
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
    
    //Contructor
    public NhanSu() {
        this.hoTen = "";
        this.maSo = 0;
        this.soDienThoai = "";
        this.ngayLamViec = 0;
        this.luongMotNgay = 0;
    }

    //methods
    public float tinhLuong() {
        return ngayLamViec*luongMotNgay;
    }
    
    public void xuatThongTinNhanVien() {
        System.out.println("---");
        System.out.println("Mã số: " + maSo);
        System.out.println("Tên: " + hoTen);
        System.out.println("Số điện thoại: " + soDienThoai);
        System.out.println("Số ngày làm viẹc: " + ngayLamViec);
        
    }
    public static int getMaSoTuTang() {
        return ++maSoTuTang;
    }
    
    
    
    

}
