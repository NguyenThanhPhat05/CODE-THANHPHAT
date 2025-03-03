package LABTUAN2;
import java.util.Scanner;
public class HINHCHUNHAT {
	private double ChieuDai;
	private double ChieuRong;
	public HINHCHUNHAT(double ChieuDai, double ChieuRong) {
		this.ChieuDai=ChieuDai;
		this.ChieuRong=ChieuRong;
	}
	public void setChieuDai(double ChieuDai) {
		if(ChieuDai>0) {
			this.ChieuDai=ChieuDai;
		}else {
			System.out.print("Chieu dai phai lon hon 0!!");
		}
	}
	public void setChieuRong(double ChieuRong) {
		if(ChieuRong>0) {
			this.ChieuRong=ChieuRong;
		}else {
			System.out.print("Chieu rong phai lon hon 0!!");
		}
	}
	public double getChieuDai() {
		return ChieuDai;
	}
	public double getChieuRong() {
		return ChieuRong;
	}
	public double TinhDienTich() {
		return ChieuDai*ChieuRong;
	}
	public double TinhChuVi() {
		return (ChieuDai+ChieuRong)*2;
	}
	public String toString() {
		return "Hinh chu nhat:"+
	           "\nChieu dai="+ ChieuDai+
	           "\nChieu rong="+ ChieuRong+
	           "\nDien tich="+ TinhDienTich()+
	           "\nChu vi="+ TinhChuVi();
	}
		public static void main(String[]args) {
		 Scanner kb = new Scanner(System.in);
		 double dai,rong;
		 System.out.print("Nhap chieu dai:");
		 dai= kb.nextDouble();
		 System.out.print("Nhap chieu rong");
		 rong= kb.nextDouble();
		 HINHCHUNHAT hcn = new HINHCHUNHAT(dai, rong);
		 System.out.print(hcn);
		}
	}


