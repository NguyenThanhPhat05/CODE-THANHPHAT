package LABTUAN1;
import java.util.Scanner;
public class BAI07 {

	public static void main(String[] args) {
		Float ly,hoa,sinh,toan,maytinh;
		Scanner kb= new Scanner(System.in);
		System.out.print("Nhap diem mon Ly:");
		ly= kb.nextFloat();
		System.out.print("Nhap diem Hoa:");
		hoa= kb.nextFloat();
		System.out.print("Nhap diem mon Sinh:");
		sinh= kb.nextFloat();
		System.out.print("Nhap diem mon Toan:");
		toan= kb.nextFloat();
		System.out.print("Nhap diem mon Maytinh:");
		maytinh= kb.nextFloat();
		Float diemtb;
		diemtb= ((ly+hoa+sinh+toan+maytinh)/50)*100;
		System.out.print(+diemtb);
		if(diemtb>90) {
			System.out.print("Hang A");
		}else if(diemtb>80) {
			System.out.print("Hang B");
		}else if(diemtb>70) {
			System.out.print("Hang C");
		}else if(diemtb>60) {
			System.out.print("Hang D");
		}else if(diemtb>40) {
			System.out.print("Hang E");	
		}else {
			System.out.print("Hang F");
		}

	}

}
