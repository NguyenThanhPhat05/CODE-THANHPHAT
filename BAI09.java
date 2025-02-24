package LABTUAN1;
import java.util.Scanner;
public class BAI09 {
	public static int tong(int so) {
		int tong=0;
		while (so!=0) {
			tong+= so%10;
			so/=10;
		}
		return tong;
	}
		public static int tich(int so) {
			int ketqua=1;
			while (so!=0) {
				int tich=so%10;
				if(tich!=0) {
					ketqua*=tich;
				}
				so/=10;
			}
			return ketqua;
		}
	public static void main(String[] args) {
		int so,tong,tich;
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap mot so nguyen:");
		so = kb.nextInt();
		tong = tong(so);
		tich = tich(so);
		System.out.println("Tong cac chu so la:"+" "+tong);
		System.out.println("Tich cac chu so la:"+" "+tich);
	}

}
