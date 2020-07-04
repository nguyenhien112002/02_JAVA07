/*
    *
    *
*/
//B1: lấy thông tin từ form
function tinhDiemTrungBinh() {

    //truy xuất thẻ input có id là "diemToan"
    //lấy ra giá trịn người dùng nhập vào thẻ input
    var diemToan = document.getElementById("diemToan").value;
    var diemLy = document.getElementById("diemLy").value;
    var diemHoa = document.getElementById("diemHoa").value;


    console.log(diemToan);
    console.log(diemLy);
    console.log(diemHoa);

    //ép kiểu
    diemToan = parseFloat(diemToan);
    diemLy = parseFloat(diemLy);
    diemHoa = parseFloat(diemHoa);

    //B2: tính điểm trung bình
    var diemTB = (diemToan + diemLy + diemHoa) / 3;

    console.log(diemTB);
    //B3: xếp loại
    /*Điểm nhỏ hơn 5 => Yếu
    5 < 6.5 điểm => Trung bình
    6.5 < 8 => Khá
    Điểm lớn hơn 8 => Giỏi
    */
    var xepLoai = '';
    if (diemTB < 5) {
        xepLoai = 'yếu';
    } else if (diemTB < 6.5) {
        xepLoai = 'Trung bình';
    } else if (diemTB < 8) {
        xepLoai = 'Khá';
    } else {
        xepLoai = 'Giỏi';
    }


    //B4: xuât thông tin
    document.getElementById("diemTB").innerHTML = diemTB;
    document.getElementById("xepLoai").innerHTML = xepLoai;



}