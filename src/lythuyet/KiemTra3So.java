package lythuyet;
import java.util.Scanner;

/*
 * Chuong trinh kiem tra 3 so nhap vao sap xep theo tang, giam hay khong sxep
 */
public class KiemTra3So {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int so1, so2, so3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nhap vao 3 so tu nhien");
		System.out.println("Nhap so thu 1: ");
		so1= scan.nextInt();
		System.out.println("Nhap so thu 2: ");
		so2= scan.nextInt();
		System.out.println("Nhap so thu 3: ");
		so3= scan.nextInt();
		
		// xu ly
		if(so1<=so2 && so2<=so3) {
			System.out.println("ba so nhap vao sx theo thu tu tang dan: " + so1 + "," + so2 +","+ so3);
		}
		else if(so1>=so2 && so2>=so3) {
			System.out.println("ba so nhap vao sx theo thu tu giam dan: " + so1 + "," + so2 +","+ so3);
		}
		else if(so1==so2 && so2==so3) {
			System.out.println("ba so nhap vao bang nhau: " + so1 + "," + so2 +","+ so3);
		}
		else {
			System.out.println("ba so nhap vao khong sx theo thu tu: " + so1 + "," + so2 +","+ so3);
		}
	}

}
