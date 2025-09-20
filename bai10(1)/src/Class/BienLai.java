package Class;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi201;
	private int chiSoCu201;
	private double tien201;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi, int chiSoCu, double tien) {
		this.chiSoMoi201 = chiSoMoi;
		this.chiSoCu201 = chiSoCu;
		this.tien201 = tien;
	}

	public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
		this.tenChuHo201 = tenChuHo;
		this.chiSoMoi201 = chiSoMoi;
		this.chiSoCu201 = chiSoCu;
		this.tien201 = tien;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi201 = sc.nextInt();
		sc.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu201 = sc.nextInt();
		sc.nextLine();
		tien201 = (chiSoMoi201 - chiSoCu201) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi201);
		System.out.println("\tChi so cu: " + chiSoCu201);
		System.out.println("\tTien: : " + tien201);
	}
}
