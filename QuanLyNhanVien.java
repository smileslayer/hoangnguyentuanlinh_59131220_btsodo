import java.util.ArrayList;
import java.util.List;

public class QuanLyNhanVien implements IQuanLy {
	List<NhanVien> ds;
	public QuanLyNhanVien() {
		ds = new ArrayList<NhanVien>();
	}
	@Override
	public void them(NhanVien nv) {
		// TODO Auto-generated method stub
		ds.add(nv);
	}

	@Override
	public void inDS() {
		// TODO Auto-generated method stub
		for (NhanVien i: this.ds) {
			System.out.println(i.getThongtin());
		}
	}

	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("Linh1", 21, "HN", 1200, 150);
		NhanVien nv2 = new NhanVien("Linh2", 22, "SG", 1200, 150);
		NhanVien nv3 = new NhanVien("Linh3", 34, "DN", 1200, 150);
		NhanVien nv4 = new NhanVien("Linh4", 54, "HT", 1200, 150);
		NhanVien nv5 = new NhanVien("Linh5", 55, "NA", 1200, 150);
		QuanLyNhanVien qlnv = new QuanLyNhanVien();
		qlnv.them(nv1);
		qlnv.them(nv2);
		qlnv.them(nv3);
		qlnv.them(nv4);
		qlnv.them(nv5);
		qlnv.inDS();

	}

}
