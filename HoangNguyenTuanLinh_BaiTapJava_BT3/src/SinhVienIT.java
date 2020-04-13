
public class SinhVienIT extends SinhVienPoly {
	public double diemJava, diemCss, diemHtml;
	
	public SinhVienIT(String hoTen, double diemJava, double diemCss, double diemHtml) {
		super(hoTen, "IT");
		this.diemJava = diemJava;
		this.diemCss = diemCss;
		this.diemHtml = diemHtml;
	}
	public double getDiem() {
		return (2 * diemJava + diemHtml + diemCss) / 4;
	}
}
