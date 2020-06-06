/*
 * switch([ten bien]){
 * 	case [gia tri]:
 * 	[khoi lenh]
 *  break;
 * }
 */

package lythuyet;
import java.util.Scanner;

public class BaiTapSwitchCase {

	public static void main(String[] args) {
		int soNhap;
		int soHangChuc, soDonVi;
		String strHangChuc = "";
		String strDonVi = "";
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhập vào số tự nhiên từ 0 đến 99: ");
		soNhap = scan.nextInt();
		
		soHangChuc = soNhap/10;
		soDonVi = soNhap%10;
		
		// hàng chục
		switch (soHangChuc) {
			case 1:
				System.out.print("Mười ");
				break;
			case 2:
				System.out.print("Hai mươi ");
				break;
			case 3:
				System.out.print("Ba mươi ");
				break;
			case 4:
				System.out.print("Bốn mươi ");
				break;
			case 5:
				System.out.print("Năm mươi ");
				break;
			case 6:
				System.out.print("Sáu mươi ");
				break;
			case 7:
				System.out.print("Bảy mươi ");
				break;
			case 8:
				System.out.print("Tám mươi ");
				break;
			case 9:
				System.out.print("Chín mươi ");
				break;
			
		}
		//hàng đơn vị
		switch (soDonVi) {
		case 1:
			if (soHangChuc >1) {
				System.out.print("Mốt");
			}
			else { 
				System.out.print("Một");
			}	
			break;
		case 2:
			System.out.print("Hai");
			break;
		case 3:
			System.out.print("Ba");
			break;
		case 4:
			System.out.print("Bốn");
			break;
		case 5:
			System.out.print("Năm");
			break;
		case 6:
			System.out.print("Sáu");
			break;
		case 7:
			System.out.print("Bảy");
			break;
		case 8:
			System.out.print("Tám");
			break;
		case 9:
			System.out.print("Chín");
			break;
		}
		
	

	}

}
