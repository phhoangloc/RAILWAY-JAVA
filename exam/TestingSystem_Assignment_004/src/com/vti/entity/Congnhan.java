package com.vti.entity;

public class Congnhan extends Canbo {
	private byte bac;

	public Congnhan(String ten, byte tuoi, String gioiTinh, String diaChi, byte bac) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.bac = bac;
	} 
}
