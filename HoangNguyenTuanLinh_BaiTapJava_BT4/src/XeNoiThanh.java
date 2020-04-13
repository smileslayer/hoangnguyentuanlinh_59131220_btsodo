
public class XeNoiThanh extends ChuyenXe {
	int soTuyen, soKm;

	public XeNoiThanh(int msChuyen, int soXe, double doanhThu, String hoTen, int soTuyen, int soKm) {
		super(msChuyen, soXe, doanhThu, hoTen);
		this.soTuyen = soTuyen;
		this.soKm = soKm;
	}
	
	public String inTT() {
		return "Ma so chuyen: " + this.msChuyen + ". Ho Ten: " + this.hoTen + ". So xe: " + this.soXe + ". So Tuyen: " + this.soTuyen + ". So Km: " + this.soKm + ". Doanh thu: " + this.doanhThu;
	}
}
