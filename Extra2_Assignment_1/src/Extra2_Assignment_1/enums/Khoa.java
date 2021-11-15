package Extra2_Assignment_1.enums;

public enum Khoa {
	KYT("Kĩ Thuật"),
	KIT("Kinh Tế"),
	NGN("Ngoại Ngữ");
	
	private String tenKhoa;

	Khoa(String tenKhoa) {
		this.tenKhoa = tenKhoa;
	}

	public String getKhoa() {
		return tenKhoa;
	}
}
