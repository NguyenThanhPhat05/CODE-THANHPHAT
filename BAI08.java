package LABTUAN1;
import java.util.Scanner;
public class BAI08 {
	public static int chusodautien(int so) {
		while (so >=10) {
			so= so/10;
		}
		return so;
	}
	public static int chusocuoi(int so) {
		return so%10;
	}
	public static void main(String[] args) {
		int so;
		Scanner kb = new Scanner(System.in);
		System.out.print("Nhap so:");
		so= kb.nextInt();
		int chusodautien = chusodautien(so);
		int chusocuoi = chusocuoi(so);
		System.out.println("Chu so dau tien la:"+" "+chusodautien);
		System.out.print("Chu so cuoi la:"+" "+chusocuoi);

	}

}
