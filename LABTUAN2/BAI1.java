package LABTUAN2;
import java.util.Scanner;
public class BAI1 {
	public static void main(String[] args) {
		Scanner kb= new Scanner(System.in);
		//CAU A
		int n;
		System.out.print("Nhap so phan tu cua mang: ");
		n = kb.nextInt();
		int[]arr = new int[n];
		int i=0; 
		System.out.println("Nhap phan tu cua mang: ");
		while(i<n) {
			System.out.print("arr["+ i +"] =");
			arr[i] = kb.nextInt();
			i++;
		}
		//CAU B
		System.out.print("Mang vua nhap la:");
		i=0;
		while (i<n) {
			System.out.print(arr[i]+" ");
			i++;
		}
		System.out.println();
		// CAU C
		int x;
		System.out.print("Nhap so x can tim:");
		x= kb.nextInt();
		boolean found= false;
		i=0;
		while(i<n) {
			if(arr[i] == x) {
				System.out.println("So"+" "+x+" "+"duoc tim thay tai"+" "+i);
				found = true;
			}
			i++;
		}
		if(!found) {
			System.out.println("Khong tim thay so!!");
		}
		//CAU D
		int gtlonnhat= arr[0];
		i=1;
		while (i<n) {
			if(arr[i]> gtlonnhat) {
				gtlonnhat = arr[i];
			}
			i++;
		}
		System.out.println("GT lon nhat trong mang la:"+gtlonnhat);
		//CAU E
		int gtnhonhat=arr[0];
		i=1;
		while(i<n) {
			if(arr[i]<gtlonnhat){
				gtnhonhat = arr[i];
			}
			i++;
		}
		System.out.println("GT nho nhat trong mang la:"+gtnhonhat);
		//CAU F
		System.out.print("Vi tri cua phan tu lon nhat trong mang la:");
		i=0;
		while(i<n) {
			if(arr[i]== gtlonnhat) {
				System.out.print(i+" ");
			}
			i++;
		}
		System.out.println();
		//CAU G
		int g;
		i=0;
		while(i<n-1) {
			g=i+1;
			while(g<n) {
			if(arr[i]>arr[g]) {
			  int temp = arr[i];
			  arr[i]=arr[g];
			  arr[g]=temp;
			}
			g++;
		}
		i++;
	}
	System.out.print("Mang sau khi xep tang dan la:");
	i=0;
	while(i<n) {
		System.out.print(arr[i]+" ");
		i++;
	}
	}
}
