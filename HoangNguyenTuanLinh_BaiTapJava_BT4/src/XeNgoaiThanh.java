
public class XeNgoaiThanh extends ChuyenXe {
	String noiDen;
	int soNgay;

	public XeNgoaiThanh(int msChuyen, int soXe, double doanhThu, String hoTen, String noiDen, int soNgay) {
		super(msChuyen, soXe, doanhThu, hoTen);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}

	public String inTT() {
		return "Ma so chuyen: " + this.msChuyen + ". Ho Ten: " + this.hoTen + ". So xe: " + this.soXe + ". Noi den: " + this.noiDen + ". So ngay: " + this.soNgay + ". Doanh thu: " + this.doanhThu;
	}
}
