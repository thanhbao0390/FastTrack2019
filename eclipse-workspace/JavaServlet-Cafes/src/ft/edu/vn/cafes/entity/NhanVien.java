package ft.edu.vn.cafes.entity;

public class NhanVien {

	private String maNV;
	private String maBP;
	private String tenBP;
	private String hoten;
	private String diachi;
	private String dienthoai;
	private String masothue;
	private boolean isKetoan;
	private boolean isThungan;

	public String getMaNV() {
		return maNV;
	}

	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}

	public String getMaBP() {
		return maBP;
	}

	public void setMaBP(String maBP) {
		this.maBP = maBP;
	}

	public String getHoten() {
		return hoten;
	}

	public void setHoten(String hoten) {
		this.hoten = hoten;
	}

	public String getDiachi() {
		return diachi;
	}

	public void setDiachi(String diachi) {
		this.diachi = diachi;
	}

	public String getDienthoai() {
		return dienthoai;
	}

	public void setDienthoai(String dienthoai) {
		this.dienthoai = dienthoai;
	}

	public String getMasothue() {
		return masothue;
	}

	public void setMasothue(String masothue) {
		this.masothue = masothue;
	}

	public boolean isKetoan() {
		return isKetoan;
	}

	public void setKetoan(boolean isKetoan) {
		this.isKetoan = isKetoan;
	}

	public boolean isThungan() {
		return isThungan;
	}

	public void setThungan(boolean isThungan) {
		this.isThungan = isThungan;
	}

}
