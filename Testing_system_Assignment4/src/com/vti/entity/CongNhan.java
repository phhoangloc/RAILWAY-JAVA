package com.vti.entity;

public class CongNhan extends CanBo {
	public CongNhan(String hoTen, Byte tuoi, String gioitinh, String diaChi,byte capBac) {
		super(hoTen, tuoi, gioitinh, diaChi);
		// TODO Auto-generated constructor stub
	}

	private byte capBac;

	public byte getCapBac() {
		return capBac;
	}

	public void setCapBac(byte capBac) {
		this.capBac = capBac;
	}

	@Override
	public String toString() {
		return "CongNhan [capBac=" + capBac + "]";
	}
	
}
