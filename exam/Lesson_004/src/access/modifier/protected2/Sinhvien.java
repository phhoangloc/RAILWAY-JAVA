package access.modifier.protected2;
import access.modifier.protected1.Khoa;

public class Sinhvien {
	public Integer maSV;
	public String TenSV; 
	public Khoa khoa;
	public Sinhvien() {
			
	}
	
	public static void main(String[] args) {
		Khoa khoa = new Khoa();
		//khoa.maKhoa = 1;
		//khoa.tenKhoa = "Công Nghệ Thông Tin";
		Sinhvien sinhvien = new Sinhvien();
		sinhvien.maSV = 1;
		sinhvien.TenSV = "Nguyễn Văn A";
		sinhvien.khoa = khoa;
		System.out.println("Mã SV:" + sinhvien.maSV +", Tên SV: " + sinhvien.TenSV);
		//khoa.thongBao();
	}
}		
 