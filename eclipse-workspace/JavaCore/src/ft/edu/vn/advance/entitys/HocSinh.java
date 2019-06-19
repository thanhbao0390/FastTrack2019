package ft.edu.vn.advance.entitys;

public class HocSinh implements Comparable<HocSinh> {

	double toan;

	public double getToan() {
		return toan;
	}

	public void setToan(double toan) {
		this.toan = toan;
	}

	@Override
	public int compareTo(HocSinh o) {
		
		if (toan > o.toan) {
			return -1;
		} else if (toan < o.toan) {
			return 1;
		} else {
			return 0;
		}
	}
}
