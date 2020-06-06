package lythuyet;
import java.util.Scanner;

public class NhapXuat {

	public static void main(String[] args) {
		//khai bao
		String ten;
		int namSinh;
		int tuoi;
		Scanner scan = new Scanner(System.in);
		
		//code nhap
		System.out.println("Java hello bạn");
		
		System.out.print("bạn tên gì: ");
		ten = scan.nextLine();
		System.out.print("xin nhap nam sinh: ");
		namSinh = scan.nextInt();
		tuoi = 2020 - namSinh;
		
		/*syntax
		 * < > <= >= == != && || !
		 * if(bieu thuc dieu kien){
		 * }
		 */
		//Code xuat
		
		if(tuoi > 29) {
			System.out.println(" chào anh "+ ten+ ", Chúc anh học java thật tốt nhé");
		}
		else {
			System.out.println("Java xin chào "+ ten+ ", Chúc bạn học java thật tốt nhé");
		}
	}
		

}
