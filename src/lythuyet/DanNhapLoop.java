package lythuyet;

/*
 * while(dieu kien){
 * khối lệnh 
 * }
 */
import java.util.Scanner;

public class DanNhapLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String cauTraLoi= "";
		int demSoLan = 0;

		System.out.println("Em có yêu anh không?");
		System.out.println("Câu trả lời(Y/N): ");
		cauTraLoi = scan.nextLine();
		
		while(!cauTraLoi.equals("Y") && demSoLan <=3 ) {
			System.out.println("Em có yêu anh không?");
			System.out.println("Câu trả lời(Y/N): ");
			cauTraLoi = scan.nextLine();
			demSoLan++;
		}
		System.out.println("Anh cũng yêu em");
			
		
	}

}
