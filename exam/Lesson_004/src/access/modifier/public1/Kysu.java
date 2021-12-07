package access.modifier.public1;

public class Kysu extends Sinhvien{
	String he;
	public Kysu() {
		
	}
	
	public static void main(String[] args) {
		Kysu kysu = new Kysu();
		kysu.maSV = 2;
		kysu.TenSV = "Nguyễn Văn B";
		kysu.he = "Kỹ Sư";
		System.out.println("Mã SV:" + kysu.maSV +", Tên SV: " + kysu.TenSV + ", Hệ: "+ kysu.he);
	}
}
