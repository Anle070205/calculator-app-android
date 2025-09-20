package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop201;
	private String khoHoc201;
	private String kyHoc201;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen, String lop, String khoaHoc, String kyHoc) {
		this.hoTen201 = hoTen;
		this.lop201 = lop;
		this.khoHoc201 = khoaHoc;
		this.kyHoc201 = kyHoc;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap lop: ");
		lop201 = sc.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc201 = sc.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc201 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop201);
		System.out.println("\tKhoa hoc: " + khoHoc201);
		System.out.println("\tKy hoc: " + kyHoc201);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop201;
	}
}
