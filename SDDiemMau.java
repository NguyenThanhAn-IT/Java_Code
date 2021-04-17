package Student_Management;
import java.util.Scanner;
import Buoi02.Diem;

public class SDDiemMau {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		DiemMau a = new DiemMau(5,10,"White");
		System.out.print("\nDiem mau a vua duoc khoi tao\n");
		System.out.print("a = " + a.toString());
		DiemMau b = new DiemMau();
		System.out.print("\nNhap thong tin cho diem b\n");
		b.readPoint();
		b.tinhTien(10,8);
		b.gan("Yellow");
		System.out.print("\nThong tin diem b vua nhap\n");
		System.out.print("b = " + b.toString());
		System.out.print("\nDanh sach ban co bao nhieu diem: ");
		int n = Integer.parseInt(sc.nextLine());
		Diem ds[] = new Diem[n];
		char c;
		for(int i=0;i<ds.length;i++){
			System.out.println("\nNhap su lua chon cua ban");
			System.out.println("\n1. Nhap diem");
			System.out.println("\n2. Nhap diem mau");
			c = sc.nextLine().charAt(0);
			if(c=='1')	ds[i] = new Diem();
			else if(c=='2')	ds[i] = new DiemMau();
			ds[i].readPoint();
		}
		System.out.print("\nThong tin cac diem vua nhap\n");
		for(int i=0;i<ds.length;i++){
			System.out.println("Thong tin diem thu " + (i+1));
			System.out.println("Ds["+(i+1)+"]: " + ds[i].toString());
		}
	}
}
