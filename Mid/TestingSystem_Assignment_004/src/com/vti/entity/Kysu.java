package com.vti.entity;

public class Kysu extends Canbo {
	private String nganhDaoTao;
	
	public Kysu(String ten, byte tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
		super(ten, tuoi, gioiTinh, diaChi);
		this.nganhDaoTao = nganhDaoTao;
	}

}
