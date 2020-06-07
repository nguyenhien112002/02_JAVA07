package lythuyet;

import java.util.Scanner;

/*
 * Bài tập Mảng
 * Cho người dùng nhập vào số phần tử mảng
 * Cho người dùng nhập giá trị từng phần tử
 * 
 * Xuất ra màn hình có bao nhiêu số chia hết cho 3 trong mảng
 */
public class BaiTapMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int soPhanTu = 0, dem= 0;
		int[] arrSoTuNhien; 
		int[] arrTemp = null;
		do {
			System.out.println("Nhập vào số phần tử mảng: ");
			soPhanTu = scan.nextInt();
		}while(soPhanTu<1);
		
		arrSoTuNhien = new int[soPhanTu];
		
		for(int i = 0; i< arrSoTuNhien.length; i++) {
			System.out.println("Nhập vào giá trị phần tử thứ: "+ (i+1));
			arrSoTuNhien[i]= scan.nextInt();
			if(arrSoTuNhien[i]%3 == 0) {
				//arrTemp[dem]= i;
				dem++;
			}
		}
		
		System.out.println("Mảng vừa nhập vào có " + dem + " phần tử chia hết cho 3");
		//System.out.println(arrTemp[0]);
		
	}

}
