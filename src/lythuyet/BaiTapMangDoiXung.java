package lythuyet;

import java.util.Scanner;

/*
 * viet ctrinh nhap vào 10 phẩn tử 
 * Kiểm tra có phải mảng đối xứng không
 */
public class BaiTapMangDoiXung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soPhanTu = 0, dem= 0;
		int[] arrSoTuNhien; 
		int[] arrTemp = null;
		do {
			System.out.println("Nhập vào số phần tử mảng: ");
			soPhanTu = scan.nextInt();
		}while(soPhanTu<2);
		
		arrSoTuNhien = new int[soPhanTu];
		
		for(int i = 0; i< arrSoTuNhien.length; i++) {
			System.out.println("Nhập vào giá trị phần tử thứ: "+ (i+1));
			arrSoTuNhien[i]= scan.nextInt();
		}
		
		
		for(int i = 0; i< arrSoTuNhien.length/2; i++) {
			if(arrSoTuNhien[i] != arrSoTuNhien[arrSoTuNhien.length-i-1]) {
				dem++;
				i= arrSoTuNhien.length;
			}
		}
		if (dem== 0) {
			System.out.println("Đây là mảng đối xứng");
		}
		else {
			System.out.println("Đây không phải là mảng đối xứng");
		}
		for(int i = 0; i< arrSoTuNhien.length; i++) {
			System.out.print(arrSoTuNhien[i] + " ");
		}

	}

}
