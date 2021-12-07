package access.modifier.protected1;

public class Sinhvien {
	protected Integer maSV;
	protected String TenSV; 
	protected Khoa khoa; 
	//Khoa khoa;
	public Sinhvien() {
		
	}

	public static void main(String[] args) {
		Sinhvien sinhvien = new Sinhvien();
		sinhvien.maSV = 1;
		sinhvien.TenSV = "Nguyễn Văn A";
		Khoa khoa = new Khoa();
		khoa.tenKhoa = "Công nghệ thông tin";
		sinhvien.khoa = khoa;
		System.out.println("Mã SV:" + sinhvien.maSV +", Tên SV: " + sinhvien.TenSV  +", Tên khoa: "+ sinhvien.khoa.tenKhoa);
	}
}		
 