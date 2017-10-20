package Buoi1;

import java.util.Scanner;

public class Bai3 {
	
	public static void main(String[] args) {
		float canh;
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap canh hinh lap phuong: ");
		canh=sc.nextFloat();
		System.out.println("The tich hinh lap phuong la: "+(canh*canh*canh));
		System.out.println("Dien tich hinh lap phuong la : "+Math.pow(canh, 2)*6);
	}

}
