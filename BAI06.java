package LABTUAN1;
import java.util.Scanner;
public class BAI06 {

	public static void main(String[] args) {
		int canh_a,canh_b,canh_c;
		Scanner kb=new Scanner(System.in);
		System.out.print("Nhap canh a:");
		canh_a= kb.nextInt();
		System.out.print("Nhap canh b:");
		canh_b= kb.nextInt();
		System.out.print("Nhap canh c:");
		canh_c= kb.nextInt();
		if(canh_a>0 && canh_b>0 && canh_c>0 && (canh_a+canh_b)>canh_c && (canh_a+canh_c)>canh_b && (canh_b+canh_c)>canh_a){
        System.out.print("Day la tam giac hop le!");	
		}else {
			System.out.print("Day la tam giac khong hop le!!!");
		}
	}

}
