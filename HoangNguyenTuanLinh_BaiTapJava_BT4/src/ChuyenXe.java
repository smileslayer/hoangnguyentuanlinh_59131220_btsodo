
public abstract class ChuyenXe {
	int msChuyen, soXe;
	double doanhThu;
	String hoTen;
	public ChuyenXe(int msChuyen, int soXe, double doanhThu, String hoTen) {
		super();
		this.msChuyen = msChuyen;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
		this.hoTen = hoTen;
	}
	public abstract String inTT();
}
