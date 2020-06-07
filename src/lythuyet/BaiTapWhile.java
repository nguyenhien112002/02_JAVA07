package lythuyet;

import java.util.Scanner;

/*
 * Cho người dùng nhập vào số tự nhiên > 0
 * Tính tổng: 1+2+3+...+n
 */
public class BaiTapWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soTuNhien;
		int tong = 0;
		int temp = 1;
		
		//nhap với while
		soTuNhien = 0;
		while(soTuNhien < 1) {
			System.out.println("Xin nhập vào số tự nhiên > 0");
			soTuNhien = Integer.parseInt(scan.nextLine());
		}
		
		//nhap với do...while()
		/*
		do {
			System.out.println("Xin nhập vào số tự nhiên > 0");
			soTuNhien = Integer.parseInt(scan.nextLine());
		}while(soTuNhien < 1)  
			*/
			
		//xu ly
		while(temp <= soTuNhien) {
			tong = tong + temp;
			temp++;
		}
		
		//Xuat
		System.out.println("Tổng của số tự nhiên 1+2+3+...+n là: "+ tong);
	}

}
