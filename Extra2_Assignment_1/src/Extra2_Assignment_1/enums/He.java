package Extra2_Assignment_1.enums;

public enum He {
	CD("Cao Đẳng"),
	ĐH("Đại Học");
	
	private String tenHe;

	He(String tenHe) {
		this.tenHe = tenHe;
	}

	public String getHe() {
		return tenHe;
	}
}
