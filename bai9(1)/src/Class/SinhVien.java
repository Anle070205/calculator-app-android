package Class;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen201;
	protected String maSV201;
	protected String ngaySinh201;
	protected String lop201;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen, String maSV, String ngaySinh, String lop) {
		this.hoTen201 = hoTen;
		this.maSV201 = maSV;
		this.ngaySinh201 = ngaySinh;
		this.lop201 = lop;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen201 = sc.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV201 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh201 = sc.nextLine();

		System.out.print("\tNhap lop: ");
		lop201 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen201);
		System.out.println("\tNgay sinh: " + ngaySinh201);
		System.out.println("\tMa sinh vien: " + maSV201);
		System.out.println("\tLop: " + lop201);
	}
}
