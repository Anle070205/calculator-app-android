package Class;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen201;
	protected String ngaySinh201;
	protected String queQuan201;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, String ngaySinh, String queQuan) {
		this.hoTen201 = hoTen;
		this.ngaySinh201 = ngaySinh;
		this.queQuan201 = queQuan;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen201 = sc.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh201 = sc.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan201 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen201);
		System.out.println("\tNgay sinh: " + ngaySinh201);
		System.out.println("\tQue quan: " + queQuan201);
	}
}
