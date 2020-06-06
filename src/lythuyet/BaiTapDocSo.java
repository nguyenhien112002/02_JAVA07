package lythuyet;

import java.util.Scanner;

/*
 * Nhap vao mot so tu 10 den 99
 * Xuat ra man hinh cach doc tieng viet so do
 * 15 Mﾆｰ盻拱 Lﾄノ
 * 34 -> ba mﾆｰﾆ｡i tﾆｰ
 * 10 -> Mﾆｰ盻拱
 * 11 -> Mﾆｰ盻拱 m盻冲
 * 21 -> Hai mﾆｰﾆ｡i m盻奏
 * 55 -> nﾄノ mﾆｰﾆ｡i lﾄノ
 * 5 -> nﾄノ
 */
public class BaiTapDocSo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int soNhap;
		int soHangChuc, soDonVi;
		String strHangChuc = "";
		String strDonVi = "";
		
		String strMuoi = "Mﾆｰ盻拱";
		String strMuoiMot = "Mﾆｰ盻拱 M盻冲";
		String strMuoiLam = "Mﾆｰ盻拱 Lﾄノ";
		String strHaiMot = "Hai Mﾆｰﾆ｡i M盻奏";
		String strBaTu = "Ba Muoi Tﾆｰ";
		String strNamNam = "Nﾄノ Mﾆｰﾆ｡i Lﾄノ";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Nh蘯ｭp vﾃ�o s盻� t盻ｱ nhiﾃｪn t盻ｫ 0 ﾄ黛ｺｿn 99: ");
		soNhap = scan.nextInt();
		
		soHangChuc = soNhap/10;
		soDonVi = soNhap%10;
		
	
		//
		if (soHangChuc == 1) {
			strHangChuc = "Mﾆｰ盻拱";
		}
		else if (soHangChuc == 2) {
			strHangChuc = "Hai mﾆｰﾆ｡i";
		}
		else if (soHangChuc == 3) {
			strHangChuc = "Ba mﾆｰﾆ｡i";
		}
		else if (soHangChuc == 4) {
			strHangChuc = "B盻創 mﾆｰﾆ｡i";
		}
		else if (soHangChuc == 5) {
			strHangChuc = "Nﾄノ mﾆｰﾆ｡i";
		}
		else if (soHangChuc == 6) {
			strHangChuc = "Sﾃ｡u mﾆｰﾆ｡i";
		}
		else if (soHangChuc == 7) {
			strHangChuc = "B蘯｣y mﾆｰﾆ｡i";
		}
		else if (soHangChuc == 8) {
			strHangChuc = "Tﾃ｡m mﾆｰﾆ｡i";
		}
		else if (soHangChuc == 9) {
			strHangChuc = "Chﾃｭn mﾆｰﾆ｡i";
		}
		
		// strHangDonVi
		if (soDonVi == 1 ) {
			if(soHangChuc != 0 && soHangChuc != 1)
				strDonVi = "M盻奏";
			else 
				strDonVi = "M盻冲";
		}
		else if (soDonVi == 2) {
			strDonVi = "Hai";
		}
		else if (soDonVi == 3) {
			strDonVi = "Ba";
		}
		else if (soDonVi == 4) {
			if(soHangChuc != 0 && soHangChuc != 1)
				strDonVi = "Tﾆｰ";
			else 
				strDonVi = "B盻創";
		}
		else if (soDonVi == 5 ) {
			if(soHangChuc != 0 )
				strDonVi = "Lﾄノ";
			else 
				strDonVi = "Nﾄノ";
		}
		else if (soDonVi == 6) {
			strDonVi = "Sﾃ｡u";
		}
		else if (soDonVi == 7) {
			strDonVi = "B蘯｣y";
		}
		else if (soDonVi == 8) {
			strDonVi = "Tﾃ｡m";
		}
		else if (soDonVi == 9) {
			strDonVi = "Chﾃｭn";
		}
		
		//dat biet
		if (soNhap == 10) {
			System.out.println("S盻� nh蘯ｭp vﾃ�o lﾃ�: " + strMuoi + "(" + soNhap + ")" );

		}
		else if (soNhap == 11) {
			System.out.println("S盻� nh蘯ｭp vﾃ�o lﾃ�: " + strMuoiMot + "(" + soNhap + ")" );

		}
		else if (soNhap == 15) {
			System.out.println("S盻� nh蘯ｭp vﾃ�o lﾃ�: " + strMuoiLam + "(" + soNhap + ")" );

		}
		else if (soNhap == 21) {
			System.out.println("S盻� nh蘯ｭp vﾃ�o lﾃ�: " + strHaiMot + "(" + soNhap + ")" );

		}
		else if (soNhap == 34) {
			System.out.println("S盻� nh蘯ｭp vﾃ�o lﾃ�: " + strBaTu + "(" + soNhap + ")" );

		}
		else if (soNhap == 55) {
			System.out.println("S盻� nh蘯ｭp vﾃ�o lﾃ�: " + strNamNam + "(" + soNhap + ")" );

		}
		else {
		System.out.println("S盻� nh蘯ｭp vﾃ�o lﾃ�: " + strHangChuc + " " + strDonVi + "(" + soNhap + ")");
		}

	}

}
