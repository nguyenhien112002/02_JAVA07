//console.log('hello');   


function tinhTienTaxi(){
    var soKM = document.getElementById('soKm').value;
    var tgCho = document.getElementById('tgCho').value;
    
    var uberX = document.getElementById('uberX').checked;
    var uberSUV = document.getElementById('uberSUV').checked;
    var uberBlack = document.getElementById('uberBlack').checked;

    //tính tiền
    var tongTien= 0;
    soKM = parseInt(soKM);
    tgCho = parseInt(tgCho);
    //them 1 dấu bằng để kiểm tra kiểu dữ liệu
    if(uberX === true){
        if(soKM <= 1){
            tongTien = 8000 + tgCho * 2000;

        }else if(soKM <= 20){
            tongTien= 8000+ (soKM -1)*12000 + tgCho * 2000;
        }else {
            tongTien= 8000+ 19 * 12000 + (soKM -20)* 10000 + tgCho * 2000;
        }
    }else if(uberSUV === true){
        if(soKM <= 1){
            tongTien = 8000 + tgCho * 2000;

        }else if(soKM <= 20){
            tongTien= 8000+ (soKM -1)*12000 + tgCho * 2000;
        }else {
            tongTien= 8000+ 19 * 12000 + (soKM -20)* 10000 + tgCho * 2000;
        }
    }else if(uberBlack === true){
        if(soKM <= 1){
            tongTien = 8000 + tgCho * 2000;

        }else if(soKM <= 20){
            tongTien= 8000+ (soKM -1)*12000 + tgCho * 2000;
        }else {
            tongTien= 8000+ 19 * 12000 + (soKM -20)* 10000 + tgCho * 2000;
        }
    }

    console.log(soKM);
    console.log(uberX);
    document.getElementById('xuatTien').innerHTML = tongTien.toLocaleString();

}