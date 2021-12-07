package com.vti.entity;

public class NhanVien extends CanBo {
	public NhanVien(String hoTen, Byte tuoi, String gioitinhcb, String diaChi,String congViec) {
		super(hoTen, tuoi, gioitinhcb, diaChi);
		// TODO Auto-generated constructor stub
	}

	private String congViec;

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}

}
