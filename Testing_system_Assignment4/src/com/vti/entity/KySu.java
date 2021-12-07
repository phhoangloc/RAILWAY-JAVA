package com.vti.entity;

public class KySu extends CanBo{
	public KySu(String hoTen, Byte tuoi, String gioitinh, String diaChi,String nganh) {
		super(hoTen, tuoi, gioitinh, diaChi);
		// TODO Auto-generated constructor stub
	}

	private String nganh;

	public String getNganh() {
		return nganh;
	}

	public void setNganh(String nganh) {
		this.nganh = nganh;
	}
}
