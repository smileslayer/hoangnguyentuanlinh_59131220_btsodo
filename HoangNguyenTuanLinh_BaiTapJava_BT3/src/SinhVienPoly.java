
public abstract class SinhVienPoly {
	public String hoTen;
	public String nganh;
	public SinhVienPoly(String hoTen, String nganh) {
		super();
		this.hoTen = hoTen;
		this.nganh = nganh;
	}
	public abstract double getDiem();
	public String getHocLuc() {
		double diem = this.getDiem();
		if (diem < 5) {
			return "Yeu";
		} else if (diem < 6.5) {
			return "Trung binh";
		} else if (diem <7.5) {
			return "Kha";
		} else if (diem < 9) {
			return "Gioi";
		} else {
			return "Xuat sac";
		}
 	}
	public void xuat() {
		System.out.println("Ten: " + this.hoTen + ". Nganh: " + this.nganh);
	}
	
	
}
