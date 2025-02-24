package LABTUAN1;
import java.util.Scanner;
public class BAI02 {

	public static void main(String[] args) {
		float chieudai,chieurong;
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap chieu dai:");
		chieudai= kb.nextFloat();
		System.out.print("Nhap chieu rong:");
		chieurong= kb.nextFloat();
		float dientich;
		dientich= chieudai*chieurong;
		System.out.print("Dien tich la:"+ dientich);
	

	}

}
