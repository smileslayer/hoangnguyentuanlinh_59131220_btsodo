import java.util.ArrayList;
import java.util.List;


public class QuanLyChuyenXe implements IQuanLyChuyenXe {
	List<ChuyenXe> ds;
	
	public QuanLyChuyenXe() {
		super();
		ds = new ArrayList<ChuyenXe>();
	}

	@Override
	public void themChuyenXe(ChuyenXe xe) {
		ds.add(xe);
	}

	@Override
	public List<ChuyenXe> xuatDS() {
		// TODO Auto-generated method stub
		return ds;
	}

	@Override
	public void inTTChuyenXe() {
		for (ChuyenXe i: ds) {
			System.out.println(i.inTT());
		}
	}

	@Override
	public double tongDTXeNoiThanh() {
		double sum = 0.0;
		for (ChuyenXe i: ds) {
			if (i instanceof XeNoiThanh) {
				sum += i.doanhThu;
			}
		}
		return sum;
	}

	@Override
	public double tongDTXeNgoaiThanh() {
		// TODO Auto-generated method stub
		double sum = 0.0;
		for (ChuyenXe i: ds) {
			if (i instanceof XeNgoaiThanh) {
				sum += i.doanhThu;
			}
		}
		return sum;
	}

	@Override
	public double tongDT() {
		// TODO Auto-generated method stub
		return this.tongDTXeNoiThanh() + this.tongDTXeNgoaiThanh();
	}
	public static void main(String[] args) {
		XeNoiThanh noi1 = new XeNoiThanh(1, 10, 10.0, "Hoang Linh", 1, 69);
		XeNoiThanh noi2 = new XeNoiThanh(2, 11, 10.0, "Lee San", 2, 69);
		XeNoiThanh noi3 = new XeNoiThanh(3, 12, 10.0, "Hoang Yasuo", 3, 69);
		XeNgoaiThanh ngoai1 = new XeNgoaiThanh(4, 13, 20.0, "Hoang LeeSin", "Ha Tinh", 96);
		XeNgoaiThanh ngoai2 = new XeNgoaiThanh(5, 14, 20.0, "Hoang Yasuo", "Summonerift", 96);
		XeNgoaiThanh ngoai3 = new XeNgoaiThanh(6, 15, 20.0, "Hoang Zed", "Demacia", 96);
		QuanLyChuyenXe ql = new QuanLyChuyenXe();
		ql.themChuyenXe(noi1);
		ql.themChuyenXe(noi2);
		ql.themChuyenXe(noi3);
		ql.themChuyenXe(ngoai1);
		ql.themChuyenXe(ngoai2);
		ql.themChuyenXe(ngoai3);
		ql.inTTChuyenXe();
		System.out.println("Tong doanh thu noi thanh: " + ql.tongDTXeNoiThanh());
		System.out.println("Tong doanh thu ngoai thanh: " + ql.tongDTXeNgoaiThanh());
		
	}

}
