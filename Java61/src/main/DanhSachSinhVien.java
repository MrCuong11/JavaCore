package main;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class DanhSachSinhVien {
	private ArrayList<SinhVien> danhSach;

	public DanhSachSinhVien() {
		this.danhSach = new ArrayList<SinhVien>();
	}

	public DanhSachSinhVien(ArrayList<SinhVien> danhSach) {
		this.danhSach = danhSach;
	}

	// 1 Thêm SV
	public void themSv(SinhVien sv) {
		this.danhSach.add(sv);
	}

	// 2 In danh sách sv ra màn hình
	public void In() {
		for (SinhVien item : danhSach) {
			System.out.println(item);
		}
	}

	// 3 Kiểm tra ds có rỗng hay không
	public boolean isEmty() {
		return this.danhSach.isEmpty();
	}

	// 4 Lấy ra số lượng sinh viên trong danh sách
	public int slSinhVien() {
		return this.danhSach.size();
	}

	// 5 Làm rỗng danh sách sinh viên
	public void lamRong() {
		this.danhSach.removeAll(danhSach);
	}

	// 6 Kiểm tra sinh viên có tồn tại hay không dựa trên mã sinh viên
	public boolean kiemTraTonTai(SinhVien sv) {
		return this.danhSach.contains(sv);
	}
	// 7 Xem sv có xoá thành công hay không
	public boolean removeSuccess(SinhVien sv) {
		return this.danhSach.remove(sv);
	}

	// 8 Tim sinh viên dựa trên tên được nhập vào từ bàn phím
	public void timSV(String ten) {
		for (SinhVien sv : danhSach) {
			if (sv.getHoVaTen().indexOf(ten) >= 0) {
				System.out.println(sv);
			}
		}
	}

	// 9 Xuất ra danh sách sinh viên có điểm từ cao đến thấp
	public void sortSV() {
		Collections.sort(this.danhSach, new Comparator<SinhVien>() {
			@Override
			public int compare(SinhVien sv1, SinhVien sv2) {
				if (sv1.getDiemTB() > sv2.getDiemTB()) {
					return -1;  // sv1 nằm trước sv2
				} else if (sv1.getDiemTB() < sv2.getDiemTB()) {
					return 1; //sv1 nằm sau sv2
				} else {
					return 0;
				}
			}

		});
	}

}
