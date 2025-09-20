package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1201;
	private String mon2201;
	private String mon3201;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1, String mon2, String mon3) {
		this.mon1201 = mon1;
		this.mon2201 = mon2;
		this.mon3201 = mon3;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap mon 1: ");
		mon1201 = sc.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2201 = sc.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3201 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1201 + " - " + mon2201 + " - " + mon3201);
	}
}
