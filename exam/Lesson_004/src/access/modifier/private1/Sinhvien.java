package access.modifier.private1;

import access.modifier.public1.Khoa;

public class Sinhvien {
	private Integer maSV;
	private String TenSV; 
	private Khoa khoa;
	public Sinhvien() {
			
	}
	
	public static void main(String[] args) {
		Sinhvien sinhvien = new Sinhvien();
		sinhvien.maSV = 1;
		sinhvien.TenSV = "Nguyễn Văn A"; 
		System.out.println("Mã SV:" + sinhvien.maSV +", Tên SV: " + sinhvien.TenSV); 
	}
}		
 