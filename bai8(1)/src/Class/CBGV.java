package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung201;
	private double thuong201;
	private double phat201;
	private double luongThucLinh201;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap luong cung: ");
		luongCung201 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong201 = sc.nextDouble();
		sc.nextLine();

		System.out.print("\tNhap phat: ");
		phat201 = sc.nextDouble();
		sc.nextLine();

		// tinh luong
		luongThucLinh201 = luongCung201 + thuong201 - phat201;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung201);
		System.out.println("\tThuong: " + thuong201);
		System.out.println("\tPhat: " + phat201);
		System.out.println("\tLuong thuc linh: " + luongThucLinh201);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh201;
	}
}
