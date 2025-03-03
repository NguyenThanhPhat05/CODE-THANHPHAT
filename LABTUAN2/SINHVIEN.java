package LABTUAN2;
import java.util.Scanner;
class SINHVIEN {
	private int MSSV;
	private String HoTen;
	private float DiemLT;
	private float DiemTH;
	public SINHVIEN() {
		this.MSSV=0;
		this.HoTen=" ";
		this.DiemLT=0.0f;
		this.DiemTH=0.0f;
	}
	public SINHVIEN(int MSSV, String HoTen, float DiemLT, float DiemTH) {
	    this.MSSV = MSSV;
	    this.HoTen = HoTen;
	    this.DiemLT = DiemLT;
	    this.DiemTH = DiemTH;
	}
	public int getMSSV() {
		return MSSV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public Float getDiemLT() {
		return DiemLT;
	}
	public Float getDiemTH() {
		return DiemTH;
	}
	public void setMSSV(int MSSV) {
		this.MSSV=MSSV;
		
	}
	public void setHoTen(String HoTen) {
		this.HoTen=HoTen;
	}
	public void setDiemLT(float DiemLT) {
		this.DiemLT=DiemLT;
	}
	public void setDiemTH(float DiemTH) {
		this.DiemTH=DiemTH;
	}
	public float DiemTB() {
		return (DiemLT + DiemTH)/2;
	}
	public String toString() {
		return MSSV + "\t" + HoTen + "\t" + DiemLT + "\t" + DiemTH + "\t" + DiemTB();
	}
	public static void main(String[]args) {
		Scanner kb = new Scanner(System.in);
		SINHVIEN sv1 = new SINHVIEN(1250080138,"Nguyen Thanh Phat", 7.0f,6.0f);
		SINHVIEN sv2 = new SINHVIEN(1250080137,"Le Tran Tan Phat", 6.0f,7.0f);
		SINHVIEN sv3 = new SINHVIEN();
		System.out.println("Nhap thong tin sinh vien:");
	    System.out.println("Nhap MSSV:");
	    sv3.setMSSV(kb.nextInt());
	    kb.nextLine();
	    System.out.println("Nhap ho ten:");
	    sv3.setHoTen(kb.nextLine());
	    System.out.println("Nhap diem LT:");
	    sv3.setDiemLT(kb.nextFloat());
	    System.out.println("Nhap diem TH:");
	    sv3.setDiemTH(kb.nextFloat());
	System.out.println("MSSV\tHọ Tên\t\tĐiểm LT\tĐiểm TH\tĐiểm TB");
	System.out.println("--------------------------");
	System.out.println(sv1);
	System.out.println(sv2);
	System.out.println(sv3);
	}
}
