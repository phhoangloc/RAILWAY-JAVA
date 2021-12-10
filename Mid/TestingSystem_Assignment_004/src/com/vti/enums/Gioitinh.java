package com.vti.enums;

public enum Gioitinh {
	GENDER_NAM("Nam"), GENDER_NU("Nữ"), GENDER_CHUA_XAC_DINH("Chưa xác định");

	private String gioitinh;

	Gioitinh(String gioitinh) {
		this.gioitinh = gioitinh;
	}

	public String getGioitinh() {
		return gioitinh;
	}
}
