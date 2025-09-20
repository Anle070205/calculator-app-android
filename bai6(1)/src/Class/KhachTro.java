package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro201;
	private String loaiPhong201;
	private double giaPhong201;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen, int CMND, int soNgayTro, String loaiPhong, double giaPhong) {
		this.hoTen201 = hoTen;
		this.CMND201 = CMND;
		this.soNgayTro201 = soNgayTro;
		this.loaiPhong201 = loaiPhong;
		this.giaPhong201 = giaPhong;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro201 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong201 = sc.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong201 = sc.nextDouble();
		sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro201);
		System.out.println("\tLoai phong: " + loaiPhong201);
		System.out.println("\tGia phong: " + giaPhong201);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro201;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong201;
	}
}
