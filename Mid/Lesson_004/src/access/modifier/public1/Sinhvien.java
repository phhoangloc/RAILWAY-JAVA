package access.modifier.public1;

public class Sinhvien {
	public Integer maSV;
	public String TenSV; 
	Khoa khoa;
	public Sinhvien() {
		
	}

	public static void main(String[] args) {
//		Khoa khoa = new Khoa();
//		khoa.maKhoa = 1;
//		khoa.tenKhoa = "CNTT";
//		Sinhvien sinhvien = new Sinhvien();
//		sinhvien.maSV = 1;
//		sinhvien.TenSV = "Nguyễn Văn A";
//		sinhvien.khoa = khoa;
//		System.out.println("Mã SV:" + sinhvien.maSV +", Tên SV: " + sinhvien.TenSV + ", khoa: " + sinhvien.khoa.tenKhoa);
//		sinhvien.khoa.thongBao();
		
		///scanner
		String name = "Nam";
		int i = 1;
		for (char ch: name.toCharArray()) {
			System.out.println("chu cai thu " + i +":"+ ch);
			i ++;
		}
	}
}		
 