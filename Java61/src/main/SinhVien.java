package main;

import java.util.Objects;

public class SinhVien {
	private String maSinhVien;
	private String hoVaTen;
	private int namSinh;
	private float diemTB;
	public SinhVien(String maSinhVien, String hoVaTen, int namSinh, float diemTB) {
		this.maSinhVien = maSinhVien;
		this.hoVaTen = hoVaTen;
		this.namSinh = namSinh;
		this.diemTB = diemTB;
	}
	
	public SinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getMaSinhVien() {
		return maSinhVien;
	}
	public void setMaSinhVien(String maSinhVien) {
		this.maSinhVien = maSinhVien;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public int getNamSinh() {
		return namSinh;
	}
	public void setNamSinh(int namSinh) {
		this.namSinh = namSinh;
	}
	public float getDiemTB() {
		return diemTB;
	}
	public void setDiemTB(float diemTB) {
		this.diemTB = diemTB;
	}
	@Override
	public String toString() {
		return "SinhVien: Mã sinh viên " + maSinhVien + ", họ và tên " + hoVaTen + ", năm sinh " + namSinh + ", điểm trung bình "
				+ diemTB;
	}
//	@Override
//	public int compareTo(SinhVien o) {
//		return this.maSinhVien.compareTo(o.maSinhVien);
//	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(diemTB, hoVaTen, maSinhVien, namSinh);
//	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		SinhVien other = (SinhVien) obj;
		return Objects.equals(maSinhVien, other.maSinhVien); 
	}
	
	
}
