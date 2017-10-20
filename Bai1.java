package Buoi1;

import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String ho,ten;
		float diemTB;
		System.out.println("Nhap ho: ");
		ho=sc.nextLine();
		System.out.println("Nhap ten :");
		ten=sc.nextLine();
		System.out.println("Nhap diem trung binh :");
		diemTB=sc.nextFloat();
		System.out.println("<< "+ho+" "+ten+" >>\t"+"<< "+diemTB+" >> diem");
	}
}
