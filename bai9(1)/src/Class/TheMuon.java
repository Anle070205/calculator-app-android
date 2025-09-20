package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon201;
	private Date ngayMuon201;
	private Date hanTra201;
	private String soHieu201;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon, Date ngayMuon, String soHieu) {
		this.soMuon201 = soMuon;
		this.ngayMuon201 = ngayMuon;
		this.soHieu201 = soHieu;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc) {
		super.nhapThongTin(sc);

		System.out.print("\tNhap so muon: ");
		soMuon201 = sc.nextInt();
		sc.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon = sc.nextLine();
		ngayMuon201 = strToDate(strNgayMuon);

		String strNgayTra = "31-12-2020";
		hanTra201 = strToDate(strNgayTra);

		System.out.println("\tNhap so hieu: ");
		soHieu201 = sc.nextLine();
	}

	private Date strToDate(String strNgayMuon) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon201);
		System.out.println("\tNgay muon: " + ngayMuon201);
		System.out.println("\tHan tra: " + hanTra201);
		System.out.println("\tSo hieu: " + soHieu201);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra201;
	}
}
