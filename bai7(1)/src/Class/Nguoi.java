package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen201;
	protected Date ngaySinh201;
	protected String queQuan201;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen, Date ngaySinh, String queQuan) {
		this.hoTen201 = hoTen;
		this.ngaySinh201 = ngaySinh;
		this.queQuan201 = queQuan;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc) {
		System.out.print("\tNhap ho ten: ");
		hoTen201 = sc.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate = sc.nextLine();
		ngaySinh201 = strToDate(strDate);

		System.out.print("\tNhap que quan: ");
		queQuan201 = sc.nextLine();
	}

	private Date strToDate(String strDate) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen201);
		System.out.println("\tNgay sinh: " + ngaySinh201);
		System.out.println("\tQue quan: " + queQuan201);
	}

	// ham lay ra que quan
	public String getQueQuan() {
		return queQuan201;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh201;
	}
}
