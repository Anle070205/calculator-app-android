package Class;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo201;
	protected int soNha201;
	protected String maCongTo201;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo, int soNha, String maCongTo) {
		this.tenChuHo201 = tenChuHo;
		this.soNha201 = soNha;
		this.maCongTo201 = maCongTo;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo201 = sc.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha201 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo201 = sc.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo201);
		System.out.println("\tSo nha: " + soNha201);
		System.out.println("\tMa cong to: " + maCongTo201);
	}
}
