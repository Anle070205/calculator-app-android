package Class;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD201;
	private String hoTen201;
	private String diaChi201;
	private String dienUuTien201;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD, String hoTen, String diaChi, String dienUuTien) {
		this.soBD201 = soBD;
		this.hoTen201 = hoTen;
		this.diaChi201 = diaChi;
		this.dienUuTien201 = dienUuTien;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap so bao danh: ");
		soBD201 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen201 = sc.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi201 = sc.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien201 = sc.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD201);
		System.out.println("\tHo ten: " + hoTen201);
		System.out.println("\tDia chi: " + diaChi201);
		System.out.println("\tDien uu tien: " + dienUuTien201);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD201;
	}
}
