package Buoi1;

import java.util.Scanner;

public class Bai2 {
	public static void main(String[] args) {
		float cDai,cRong,min;
		double dienTich,chuVi;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap chieu dai: ");
		cDai=sc.nextFloat();
		System.out.println("Nhap chieu rong: ");
		cRong = sc.nextFloat();
		dienTich=cDai*cRong;
		chuVi=(cDai+cRong)*2;
		
		min=Math.min(cDai, cRong);
		
		System.out.println("Chu vi: "+chuVi);
		System.out.println("Dien tich : " +dienTich);
		System.out.println("Do dai canh be nhat: "+min);
	}


}
