function tinhLuong(){
    var luongCoBan = document.getElementById("luongCoBan").value;
    var gioLam = document.getElementById("gioLam").value;

    var radioGiamDoc = document.getElementById("giamDoc").checked;
    var radioQuanLy = document.getElementById("quanLy").checked;
    var radioNhanVien = document.getElementById("nhanVien").checked;

    var tongLuong = 0;
    var xepLoai;

    console.log(luongCoBan);
    console.log(gioLam);
    console.log(radioGiamDoc);
    console.log(radioQuanLy);
    console.log(radioNhanVien);

    if(radioGiamDoc){
        tongLuong = luongCoBan * 3 * gioLam;
    } else if(radioQuanLy){
        tongLuong = luongCoBan * 2 * gioLam;
    }else if(radioNhanVien){
        tongLuong = luongCoBan * gioLam;
    }

    if(gioLam>120){
        xepLoai = "Nhân Viên Xuất Sắc";
    }else if(gioLam>100){
        xepLoai = "Nhân Viên Giỏi";
    }else if(gioLam>80){
        xepLoai = "Nhân Viên Khá";
    }else if(gioLam>50){
        xepLoai = "Nhân Viên Trung Bình";
    }else {
        xepLoai = "Nhân Viên Yếu";
    }

    console.log(tongLuong);

    document.getElementById("tongLuong").innerHTML = tongLuong.toLocaleString();
    document.getElementById("xepLoai").innerHTML = xepLoai;


}