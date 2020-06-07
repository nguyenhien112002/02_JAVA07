package lythuyet;

import java.util.Arrays;
import java.util.Scanner;import com.sun.jndi.url.dns.dnsURLContextFactory;

/*
 * viết chương trình tính tổng thu của một chuỗi cửa hàng
 * gồm 10 chi nhánh
 * Nhập vào doanh thu của từng chi nhánh
 * 
 * Xuất ra tổng doanh thu và doanh thu từng chi nhánh
 */
public class DanNhapMang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		long[] doanhThu = new long[10];
		long doanhThuTong = 0;
		for (int i = 0; i < doanhThu.length ; i++) {
			System.out.println("Nhập doanh thu chi nhánh: " +(i+1));
			doanhThu[i]= Long.parseLong(scan.nextLine());
			//System.out.println(Arrays.toString(doanhThu));
			//System.out.println(doanhThu.toString());
			
		}
		for (int i = 0; i < doanhThu.length ; i++) {
			System.out.println("Doanh thu chi nhánh " + (i+1)+": " +doanhThu[i]);
			
		}
		
		for (int i = 0; i < doanhThu.length ; i++) {
			doanhThuTong += doanhThu[i];
		}
		System.out.println("----------------------------------");
		System.out.println("Tổng doanh thu các chi nhánh: " +doanhThuTong);
	}

}
