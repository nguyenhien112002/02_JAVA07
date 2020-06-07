package lythuyet;

import java.util.Scanner;

public class DemChuSoTuNhien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		long soTuNhien;
		int soChuSo = 0;
		
		//nhap với while
		do {
			System.out.println("Xin nhập vào số tự nhiên > 0");
			soTuNhien = Long.parseLong(scan.nextLine());
		}while(soTuNhien < 0) ;
			
		//xu ly
		while(soTuNhien/10 != 0) {
			soChuSo++;
			soTuNhien= soTuNhien/10;
		}
		soChuSo++;
		//Xuat
		System.out.println("Số chữ số của số tự nhiên là: "+ soChuSo);
	}
	
	public static int demChuSo(Long chuso) {
		
		if(chuso / 10 ==0)
		return 1;
		//lặp đệ qui
		else return 1 + demChuSo(chuso);
	}

}
