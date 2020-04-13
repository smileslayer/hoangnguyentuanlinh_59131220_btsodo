
public class NhanVien {
	private String ten;
	private int tuoi;
	private String dia_chi;
	private double tien_luong;
	private int tong_gio_lam;
	
	public NhanVien(String ten, int tuoi, String dia_chi, double tien_luong, int tong_gio_lam) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.dia_chi = dia_chi;
		this.tien_luong = tien_luong;
		this.tong_gio_lam = tong_gio_lam;
	}

	public NhanVien() {
		super();
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public String getDia_chi() {
		return dia_chi;
	}

	public void setDia_chi(String dia_chi) {
		this.dia_chi = dia_chi;
	}

	public double getTien_luong() {
		return tien_luong;
	}

	public void setTien_luong(double tien_luong) {
		this.tien_luong = tien_luong;
	}

	public int getTong_gio_lam() {
		return tong_gio_lam;
	}

	public void setTong_gio_lam(int tong_gio_lam) {
		this.tong_gio_lam = tong_gio_lam;
	}
	
	public double tinhThuong() {
		if (this.tong_gio_lam >= 200) {
			return this.tien_luong * 0.2;
		} else if (this.tong_gio_lam >= 100) {
			return this.tien_luong * 0.1;
		} else {
			return 0;
		}
	}
	public String getThongtin() {
//		return this.toString();
		return "Ten: " + this.ten + ", Tuoi: " + this.tuoi + ", Dia chi: " + this.dia_chi + ", Luong: " + this.tien_luong + ", Gio Lam: " + this.tong_gio_lam;
		
	}
	public static void main(String[] args) {
		NhanVien nv = new NhanVien("Linh", 21, "HN", 1200, 150);
		System.out.println(nv.getThongtin());
		System.out.println(nv.tinhThuong());
	}
	
}
