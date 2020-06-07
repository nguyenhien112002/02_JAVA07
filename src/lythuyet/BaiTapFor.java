package lythuyet;

import java.util.Scanner;

public class BaiTapFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		long soTuNhien;
		float tongSn = 0f;
		
		//nhap với while
		do {
			System.out.println("Xin nhập vào số tự nhiên > 0");
			soTuNhien = Long.parseLong(scan.nextLine());
		}while(soTuNhien < 1) ;
		
		for(int i = 1; i<= soTuNhien; i++) {
			tongSn += (float)1/(i*(i+1)*(i+2));
			//tongSn += 1f/(i*(i+1)*(i+2));
		}
		
		System.out.println("Tổng Sn là: " + tongSn);
		
	}

}
