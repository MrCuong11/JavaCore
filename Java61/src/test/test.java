package test;

import java.util.Scanner;

import main.DanhSachSinhVien;
import main.SinhVien;

public class test {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DanhSachSinhVien dssv = new DanhSachSinhVien();
		int luaChon = 0;

		do {
			System.out.print("Press any keydown to continue...");
			String next = sc.nextLine();
			if (next == "")
				continue;
			System.out.println("---------- MENU ---------- ");
			System.out.println("Vui lòng chọn chức năng: ");
			System.out.println("1.	Thêm sinh viên vào danh sách.\n" + "2.	In danh sách sinh viên ra màn hình.\n"
					+ "3.	Kiểm tra danh sách có rỗng hay không.\n"
					+ "4.	Lấy ra số lượng sinh viên trong danh sách.\n" + "5.	Làm rỗng danh sách sinh viên.\n"
					+ "6.	Kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên.\n"
					+ "7.	Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên.\n"
					+ "8.	Tìm kiếm tất cả sinh viên dựa trên Tên được nhập từ bàn phím.\n"
					+ "9.	Xuất ra danh sách sinh viên có điểm từ cao đến thấp.\n" + "0.   Thoát khỏi chương trình");
			luaChon = sc.nextInt();
			sc.nextLine();
			if (luaChon == 1) {
				System.out.println("Nhập mã số sinh viên");
				String mssv = sc.nextLine();
				System.out.println("Nhập họ và tên");
				String ten = sc.nextLine();
				System.out.println("Nhập năm sinh");
				int namSinh = sc.nextInt();
				System.out.println("Nhập điểm trung bình");
				float dTb = sc.nextFloat();
				SinhVien sv = new SinhVien(mssv, ten, namSinh, dTb);
				dssv.themSv(sv);
			} else if (luaChon == 2) {
				if(dssv.isEmty()) {
					System.out.println("Không có sinh viên nào trong danh sách.");
				}
				else {
					dssv.In();
				}
			} else if (luaChon == 3) {
				if (dssv.isEmty()) {
					System.out.println("Danh sách rỗng.");
				} else {
					System.out.println("Danh sách không rỗng.");
				}

			} else if (luaChon == 4) {
				System.out.println("Số lượng sinh viên hiện tại: " + dssv.slSinhVien());
			} else if (luaChon == 5) {
				System.out.println("DSSV đã được làm rỗng");
				dssv.lamRong();
			} else if (luaChon == 6) {
				System.out.println("Nhập mã sinh viên: ");
				String mssv = sc.nextLine();
				SinhVien sv = new SinhVien(mssv);
				System.out.println("Sinh viên có mã "+sv.getMaSinhVien()+" tồn tại trong danh sách: " + dssv.kiemTraTonTai(sv));
			} else if (luaChon == 7) {
				System.out.println("Nhập mã sinh viên: ");
				String mssv = sc.nextLine();
				SinhVien sv = new SinhVien(mssv);
				if(dssv.removeSuccess(sv) == true) {
					System.out.println("Đã xoá sinh viên có mã "+sv.getMaSinhVien()+" trong danh sách: " );
				}
				else {
					System.out.println("Không tìm thấy sinh viên có mã "+sv.getMaSinhVien()+" trong danh sách: " );
				}
				System.out.println("Danh sách sinh viên sau khi xoá: ");
				if(dssv.isEmty()) {
					System.out.println("Không có sinh viên nào trong danh sách.");
				}
				else {
					dssv.In();
				}
			} else if (luaChon == 8) {
				System.out.println("Nhập họ và tên: ");
				String hoVaTen = sc.nextLine();
				System.out.println("Kết quả tìm kiếm: ");
				dssv.timSV(hoVaTen);
			} else if (luaChon == 9) {
				dssv.sortSV();
				dssv.In();
			}
			sc.nextLine();
		} while (luaChon != 0);
		System.out.println("Cảm ơn bạn đã sử dụng chương trình");
	}
}
