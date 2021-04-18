package Buoi04;
import java.util.Scanner;
import Buoi03.SinhVien;
public class SDSinhVienCNTT {
		public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("\nDanh sach cua ban co bao nhieu sinh vien: ");
		int n = Integer.parseInt(sc.nextLine());
		SinhVien ds[] = new SinhVien[n];
		System.out.println("\nNhap thong tin sinh vien");
		char c;
		for(int i=0;i<ds.length;i++){
			System.out.println("\n1.Nhap sinh vien khoa CNTT");
			System.out.println("2.Nhap sinh vien khoa khac");
			System.out.print("\nNhap su lua chon cua ban: "); 
			c = sc.nextLine().charAt(0);
			if(c=='1')	ds[i] = new SinhVienCNTT();
			else if(c=='2')	ds[i] = new SinhVien();
			ds[i].readSV();
			ds[i].readnameHP();
			ds[i].readMark();
		}
		System.out.println("\nDanh sach thong tin sinh vien vua nhap");
		for(int i=0;i<ds.length;i++){
			ds[i].printSV();
		}
		System.out.print("\nNhap email can tim: ");
		String email = sc.nextLine();

		boolean count = false;
		for(int i=0;i<ds.length;i++){
			if(ds[i].getEmail().equals(email)){
				System.out.println("\nThong tin cua sinh vien co Email " + ds[i].getEmail());
				System.out.println("Ten tai khoan Elcit: " + ds[i].getUser());
				System.out.println("Mat khau Elcit: " + ds[i].getpassWord());
				System.out.println("Diem tb cua sinh vien: " + ds[i].AVG());
				count = true;
				break;
			}
		}
		if(!count){
			System.out.println("\nKhong tim thay sinh vien co email " + email);
		}
		System.out.println("\nDanh sach sinh vien sap xep theo ten");
		for(int i=0;i<ds.length;i++){
			for(int j=i+1;j<ds.length;j++){
				if(ds[i].layTen().compareTo(ds[j].layTen()) > 0){
					SinhVien t = ds[i];
							ds[i] = ds[j];
							ds[j] = t;
				}
			}
		}
		System.out.printf("\nDanh sach ho ten sinh vien da sap xep\n");
		for(int i=0;i<ds.length;i++){
			System.out.println((i+1)+". "+ ds[i].layhoTen());
		}
	}
}
