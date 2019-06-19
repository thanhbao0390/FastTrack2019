package ft.edu.vn.advance.entitys;

public class HocSinh2 implements Comparable<HocSinh2> {

	double toan;
	double ly;

	public double getToan() {
		return toan;
	}

	public void setToan(double toan) {
		this.toan = toan;
	}
	
	public double getLy() {
		return ly;
	}

	public void setLy(double ly) {
		this.ly = ly;
	}

	@Override
	public int compareTo(HocSinh2 o) {

		//return this.getToan().compareTo(o.getToan());
		
		if (toan > o.toan) {
			return -1;
		} else if (toan < o.toan) {
			return 1;
		} else {
			if (ly > o.ly) {
				return -1;
			} else if (ly < o.ly) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
