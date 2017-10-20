package Buoi1;

import java.util.Scanner;

public class Bai4 {
	public static void main(String[] args) {
		float a,b,c,delta;
		Scanner sc= new Scanner(System.in);
		System.out.println("Nhap a: ");
		a= sc.nextFloat();
		System.out.println("Nhap b: ");
		b= sc.nextFloat();
		System.out.println("Nhap c: ");
		c=sc.nextFloat();
		if(a==0){
			System.out.println("Phuong trinh khong phai la phuong trinh bac 2\n");
		}
		else{
			delta= (float)(Math.pow(b, 2)-4*a*c);
			if(delta<0){
				System.out.println("Phuong trinh vo nghiem");
			}
			else if(delta==0){
				System.out.println("Phuong trinh co nghiem duy nhat");
			}
			else{
				System.out.println("Can delta: "+(float)Math.sqrt(delta));
			}
		}
	}
}
