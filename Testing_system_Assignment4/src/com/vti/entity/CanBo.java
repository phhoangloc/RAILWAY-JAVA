package com.vti.entity;

public class CanBo {
	private String hoTen;
	private Byte tuoi;
	private String gioiTinh;
	private String diaChi;
	
	public String getHoTen() {
		return hoTen;
	}
	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}
	public Byte getTuoi() {
		return tuoi;
	}
	public void setTuoi(Byte tuoi) {
		this.tuoi = tuoi;
	}
	public String getGioitinh() {
		return gioiTinh;
	}
	public void setGioitinh(String gioitinh) {
		this.gioiTinh = gioitinh;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	
	

	@Override
	public String toString() {
		return "CanBo [hoTen=" + hoTen + ", tuoi=" + tuoi + ", gioiTinh=" + gioiTinh + ", diaChi=" + diaChi + "]";
	}
	public CanBo(String hoTen,byte tuoi,String gioitinhcb, String diaChi) {
		super();
		this.hoTen=hoTen;
		this.tuoi = tuoi;
		this.gioiTinh = gioitinhcb;
		this.diaChi=diaChi;
	}
		
}
