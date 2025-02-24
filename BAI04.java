package LABTUAN1;
import java.util.Scanner;
public class BAI04 {

	public static void main(String[] args) {
		int year;
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap nam can kiem tra:");
		year= kb.nextInt();
		if((year % 4 == 0 && year % 100 !=0  )||(year % 400 ==0)){
			System.out.print(year + " la nam nhuan!!");
		}else {
			System.out.print(year +" " + "khong phai nam nhuan!!");
			
		}

	}

}
