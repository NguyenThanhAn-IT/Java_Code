package Buoi03;
import Buoi02.Date;
import java.util.Scanner;

public class SinhVien {
	private String MSSV;
	private String fullname;
	private Date ngaysinh;
	private int sl;
	private String diemhp[],tenhp[];
	private int stc[];

	public SinhVien() {
		MSSV = new String();
		fullname = new String();
		ngaysinh = new Date();
		sl=0;
		stc = new int[80];
		diemhp = new String[80];
		tenhp = new String[80];
	}
	public SinhVien(SinhVien s) {
		MSSV = new String(s.MSSV);
		fullname = new String(s.fullname);
		ngaysinh = new Date(s.ngaysinh);
		sl=s.sl;
		diemhp = new String[80];
		tenhp = new String[80];
		for(int i=0;i<s.sl;i++) {
			diemhp[i] = new String(s.diemhp[i]);
			tenhp[i] = new String(s.tenhp[i]);
			stc[i] = s.stc[i];
		}
	}
	public void readSV() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten sinh vien: ");
		fullname = sc.nextLine();
		System.out.print("Nhap mssv: ");
		MSSV = sc.nextLine();
		System.out.print("Nhap ngay thang nam sinh\n");
		ngaysinh.readDate();
	}
	public void readtenhp() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Sinh vien hoc bao nhieu HP trong hoc ki: ");
		sl = sc.nextInt();
		sc.nextLine();
		 for(int i =0; i<sl; i++) {
			 System.out.print("Nhap ten hp thu " + (i+1) + " : ");
			 tenhp[i] = sc.nextLine();
		 }
	}
	public void readMark() {
		Scanner sc = new Scanner (System.in);
		for (int i =0; i<sl; i++) {
			System.out.print("Nhap diem cua hp " + tenhp[i]+" : ");
			diemhp[i] = sc.nextLine();
			System.out.print("Nhap so tin chi cua hp " + tenhp[i]+" : ");
			stc[i] = Integer.parseInt(sc.nextLine());
		}
	}
	public void printSV() {
		System.out.print("\n------------------------------------------\n");
		System.out.println("Ten sinh vien: " + fullname);
		System.out.println("MSSV: "+ MSSV);
		System.out.println("Ngaysinh: "+ ngaysinh.toString());
		System.out.println("So hp SV hoc trong 1 hk: " + sl);
		for (int i=0; i<sl; i++) {
			System.out.println("Ten hp thu " + (i+1) + ": " + tenhp[i]);
			System.out.println("Diem cua hp thu " + (i+1) + ": " + diemhp[i]);
			System.out.println("STC cua hp thu " + (i+1) + ": " + stc[i]);
		}
		System.out.print("------------------------------------------\n");
	}
	
	public String layfullname() {
		return fullname;
	}
	public double AVG() {
		double s=0;
		for(int i=0;i<sl;i++) {
			if(diemhp[i].equals("A")) s = s + 4;
			else if(diemhp[i].equals("B+"))	s = s + 3.5;
			else if(diemhp[i].equals("B"))	s = s + 3;
			else if(diemhp[i].equals("C+"))	s = s + 2.5;
			else if(diemhp[i].equals("C"))	s = s + 2;
			else if(diemhp[i].equals("D+"))	s = s + 1.5;
			else if(diemhp[i].equals("D"))	s = s + 1.0;
			else s = s + 0;
		}
		return (double)s/sl;
	}
	public float diemTb() {
		float d = 0.0f;
		int soTC = 0;
		for (int i = 0; i < sl; i++) {
			soTC += stc[i];
			if (diemhp[i].equals("A"))
				d += 4*stc[i];
			else if (diemhp[i].equals("B+"))
				d += 3.5*stc[i];
			else if (diemhp[i].equals("B"))
				d += 3*stc[i];
			else if (diemhp[i].equals("C+"))
				d += 2.5*stc[i];
			else if (diemhp[i].equals("C"))
				d += 2*stc[i];
			else if (diemhp[i].equals("D+"))
				d += 1.5*stc[i];
			else if (diemhp[i].equals("D"))
				d += 1*stc[i];
			else if (diemhp[i].equals("F"))
				d += 0;
		}
		return d / soTC;
	}
	public String tachten() {
		String h = new String(fullname);
		h=h.trim();
		return h.substring(h.lastIndexOf(" ")+1);
	}
	public void themHP(String ten, String diem) {
		
	}
}
