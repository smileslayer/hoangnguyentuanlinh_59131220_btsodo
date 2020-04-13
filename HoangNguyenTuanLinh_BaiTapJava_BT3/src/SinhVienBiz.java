
public class SinhVienBiz extends SinhVienPoly {
	public double diemMarketing, diemSales;
	
	public SinhVienBiz(String hoTen, double diemMarketing, double diemSales) {
		super(hoTen, "Biz");
		this.diemMarketing = diemMarketing;
		this.diemSales = diemSales;
	}
	public double getDiem() {
		return (2 * diemMarketing + diemSales) / 3;
	}
}
