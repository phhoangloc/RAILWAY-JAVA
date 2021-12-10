package com.vti.entity;

public class Nhanvien extends Canbo {
	private String congViec;

	public Nhanvien(String ten, byte tuoi, String gioiTinh, String diaChi, String congViec) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.congViec = congViec;
	} 
}
