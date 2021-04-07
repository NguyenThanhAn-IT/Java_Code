package Buoi03;
import java.util.Scanner;
public class SDSinhVien {
	static Scanner sc;
	public static void main(String[] args) {
		SinhVien a = new SinhVien();
		a.readSV();
		a.readtenhp();
		a.readMark();
		a.themHP("LTHDT","A");
		System.out.println("Thong tin vua nhap la ");
		a.printSV();
		sc =new Scanner(System.in);
		System.out.print("\nDanh sach ban co bao nhieu sinh vien: ");
		int n = sc.nextInt();
		SinhVien ds[] = new SinhVien[n];
		//Nhap danh sach
		System.out.print("\nNhap thong tin va du lieu sinh vien\n");
		for(int i=0;i<ds.length;i++) {
			System.out.println("Nhap sinh vien thu " + (i+1));
			ds[i] = new SinhVien();
			ds[i].readSV();
			ds[i].readtenhp();
			ds[i].readMark();
		}
		System.out.print("\nThong tin va du lieu cac sinh vien vua nhap\n");
		for(int i=0;i<ds.length;i++) {
			System.out.println("Thong tin sinh vien thu " + (i+1));
			ds[i].printSV();
		}
		for(int i=0;i<ds.length;i++) {
			System.out.print("\nDiem trung binh cua sinh vien " + ds[i].layfullname() + " la: " + ds[i].AVG());
		}
		System.out.print("\nDanh sach da tach ten cua cac sinh vien\n");
		for(int i=0;i<ds.length;i++) {
			System.out.println("Ten sv thu " + (i+1) + ds[i].tachten());
		}
		for(int i=0;i<ds.length;i++) {
			if(ds[i].AVG() <1)
				ds[i].printSV();
		}
		for(int i=0;i<ds.length-1;i++) {
			for(int j=i+1;j<ds.length;j++) {
				if(ds[i].tachten().compareTo(ds[j].tachten())>0) {
					SinhVien temp = ds[i];
						ds[i] = ds[j];
						ds[j] = temp;
				}
			}
		}
		System.out.print("\nDanh sach da sort for name\n");
		for(int i=0;i<ds.length;i++) {
			ds[i].printSV();
		}
		for(int i=0;i<ds.length;i++) {
			System.out.println("\nDiem trung binh tich luy cua sinh vien " + ds[i].layfullname() + " la :" + ds[i].diemTb());
		}
		                                                                                                                                                                                                                                                                                                    
	}
}

