package LABTUAN1;
import java.util.Scanner;
public class BAI05 {

	public static void main(String[] args) {
		Float a,b,c;
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap so a:");
		a= kb.nextFloat();
		System.out.print("Nhap so b:");
		b= kb.nextFloat();
		System.out.print("Nhap so c:");
		c= kb.nextFloat();
		if(a<=b &&  a<=c) {
			System.out.print(a+" " + "la so nho nhat!");
		}else if(b<=c && b<=a) {
			System.out.print(b+" " + "la so nho nhat!");
		
		}else {System.out.print(c+" " + "la so nho nhat!");
		

	}
	}
}
	
