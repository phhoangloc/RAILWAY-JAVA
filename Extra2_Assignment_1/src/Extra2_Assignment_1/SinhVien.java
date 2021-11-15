package Extra2_Assignment_1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import Extra2_Assignment_1.enums.He;
import Extra2_Assignment_1.enums.Khoa;

public class SinhVien {
	int maSV;
	String hoTen;
	String email;
	String	soDT;
	String diaChi;
	String tenHe;
	String tenKhoa;
	int soTinChiHoanThanh;
	Lop lop;
	String clb;
	float noHocPhi;
	Date ngayNhapHoc;
	Date ngayTotNghiep;
	
	
	public static void main(String[] args) throws ParseException {
	SinhVien sinhvien1 = new SinhVien();
	sinhvien1.maSV=1;
	sinhvien1.hoTen= "Nguyễn Văn A";
	sinhvien1.email="anguyen@gmail.com";
	sinhvien1.diaChi="Hà Nội";
	sinhvien1.tenHe=He.ĐH.getHe();
	sinhvien1.tenKhoa=Khoa.KIT.getKhoa();
	sinhvien1.soTinChiHoanThanh=50;
	sinhvien1.noHocPhi=20000000L;
	String date_string1 = "2020-04-20";
	// Instantiating the SimpleDateFormat class
	SimpleDateFormat formatter1 = new SimpleDateFormat("dd-MM-yyyy");
	// Parsing the given String to Date object
	Date date1 = formatter1.parse(date_string1);
	sinhvien1.ngayNhapHoc=date1;
	}
}

