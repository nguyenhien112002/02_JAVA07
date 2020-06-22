package com.cybersoft.quanlynhansu.main;

import com.cybersoft.quanlynhansu.object.CongTy;
import com.cybersoft.quanlynhansu.object.NhanSu;
import com.cybersoft.quanlynhansu.object.NhanVien;

public class MAIN {

    public static void main(String[] args) {
        
        InMennu inMenu = new InMennu();
      //inMenu();
        inMenu.inMenu();
        
        //NhanSu ns = new NhanSu();
        NhanVien nhanVien;// = new NhanVien("hien", 10.5f);
        //nhanVien.xuatThongTinNhanVien();
        
        CongTy congTyA = new CongTy();
        //1. Nhập, sửa thông tin công ty
        //2. Thêm, xóa, sửa thông tin một nhân viên (Lưu ý khi xóa trưởng phòng, phải ngắt liên kết với các nhân viên đang tham chiếu tới)
        
        //Thêm public NhanVien(String ten, int maSo, String SoDienThoai, float soNgayLamViec, int maQuanLy) {
        nhanVien = new NhanVien("Hien", "0968148", 20f, 2170);
        congTyA.themNhanSu(nhanVien);
        nhanVien = new NhanVien("Hien2", "0968149", 20.5f, 2171);
        congTyA.themNhanSu(nhanVien);
        nhanVien = new NhanVien("Hien3", "0968150", 21f, 2172);
        congTyA.themNhanSu(nhanVien);
        nhanVien = new NhanVien("Hien3", "0968147", 21.5f, 2173);
      //sửa
        congTyA.suaNhanSu(3,nhanVien);
        
        
        congTyA.xuatThongTinNhanSuCongTy();

        //3. Xuất ra thông tin toàn bộ người trong công ty
        //4. Tính và xuất tổng lương cho toàn công ty
        //5. Tìm Trưởng Phòng có lương cao nhất
        //6. Tìm Trưởng Phòng có số lượng nhân viên dưới quyền nhiều nhất
        //7. Tìm Giám Đốc có số lượng cổ phần nhiều nhất
        //8. Tính và xuất tổng THU NHẬP của từng giám đốc trong tháng: 
        //Tổng thu nhập = lương tháng + Cổ phần * Lợi nhuận công ty
        //@Lợi nhuận công ty = Doanh thu tháng - TỔNG LƯƠNG toàn công ty của tháng.
        
        
        
    }
}