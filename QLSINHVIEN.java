package BAIKT;
import java.util.Scanner;
class QLSINHVIEN {
	private int MSSV;
	private String HoTen;
	private String DiaChi;
	private String SDT;
	public QLSINHVIEN() {
		this.MSSV=0;
		this.HoTen="";
		this.DiaChi="";
		this.SDT="";		
	}
	public QLSINHVIEN(int MSSV,String Hoten,String DiaChi,String SDT) {
		this.MSSV=MSSV;
		this.HoTen=HoTen;
		this.DiaChi=DiaChi;
		this.SDT=SDT;
	}
	public int getMSSV() {
		return MSSV;
	}
	public void setMSSV(int MSSV) {
		this.MSSV=MSSV;
	}
	public String getHoTen() {
		return HoTen;
	}
	public void setHoTen(String HoTen) {
		this.HoTen=Hoten;
	}
	public String DiaChi() {
		return DiaChi;
	}
	public void setDiaChi(String DiaChi) {
		this.DiaChi=DiaChi;
	}
	public String SDT() {
		return SDT;
	}
	public void setSDT(String SDT) {
		this.SDT=SDT;
	}
	@Override
    public String toString() {
        return String.format("%-10d %-20s %-30s %-15s", MSSV, HoTen, DiaChi, SDT);
    }
	public static void main(String[] args) {
	Scanner kb = new Scanner(System.in);
	
	
	}
}
