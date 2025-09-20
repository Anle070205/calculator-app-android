package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	// thuoc tinh
	private ArrayList<ThiSinh> dsts201;

	// phuong thuc
	public TuyenSinh() {
		dsts201 = new ArrayList<ThiSinh>(10);
	}

	// ham them 1 thi sinh
	public void themThiSinh(ThiSinh ts) {
		dsts201.add(ts);
	}

	// nhap danh sach
	public void nhapDanhSach(Scanner sc) {
		ThiSinh ts201;
		int chon;

		System.out.print("Nhap vao so luong thi sinh: ");
		int n201 = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < n201; i++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon = sc.nextInt();

			switch (chon) {
			case 1:
				ts201 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts201 = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts201 = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts201 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}

			ts201.nhapThongTin(sc);
			themThiSinh(ts201);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dsts201.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts201.get(i).hienThiThongTin();
		}
	}

	// tim kiem thi sinh theo so bao danh
	public void timKiemThiSinh(int soBaoDanh) {
		for (ThiSinh ts : dsts201) {
			if (ts.getSoBD() == soBaoDanh) {
				ts.hienThiThongTin();
			}
		}
	}
}
