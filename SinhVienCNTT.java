package Buoi04;
import java.util.Scanner;
import Buoi03.SinhVien;

public class SinhVienCNTT extends SinhVien {
	private String user,password,email;

	public SinhVienCNTT(){
		super();
		user = new String();
		password = new String();
		email = new String();
	}
	public SinhVienCNTT(SinhVienCNTT sv){
		super(sv);
		user = new String(sv.user);
		password = new String(sv.password);
		email = new String(sv.email);
	}
	public void readSV(){
		super.readSV();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap tai khoan: ");
		user = sc.nextLine();
		System.out.print("Nhap password: ");
		password = sc.nextLine();
		System.out.print("Nhap email: ");
		email = sc.nextLine();
	}
	public void printSV(){
		super.printSV();
		System.out.println("Tai khoan: " + user);
		System.out.println("Password: " + password);
		System.out.println("Email: " + email);
	}
	public void doimatKhau(String pass){
		password = new String(pass);
	}
	public String getUser(){
		return user;
	}
	public String getpassWord(){
		return password;
	}
	public String getEmail(){
		return email;
	}
}
