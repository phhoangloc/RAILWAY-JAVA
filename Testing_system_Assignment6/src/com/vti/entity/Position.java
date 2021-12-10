package com.vti.entity;

public class Position {
	public static int COUNTPos=0;
	public int id;
	public PositionName name;
	public enum PositionName{
		Dev,Test,Scrum_Master,PM
	}
	@Override
	public String toString() {
		return "Position [id=" + id + ", name=" + name + "]";
	}
	public Position() {
		super();
		COUNTPos++;
		this.id=COUNTPos;
		System.out.println("chọn tên vị trí muốn nhập vào 1.dev 2.test 3.Scrum_Master,4.PM");
		while(true) {
			int choosePos = ScannerUtils.inputint();
			switch(choosePos) {
			case 1: this.name=PositionName.Dev;System.out.println("vị trí muốn nhập vào là:" + this.name);break;
			case 2: this.name=PositionName.Test;System.out.println("vị trí muốn nhập vào là:" + this.name);break;
			case 3: this.name=PositionName.Scrum_Master;System.out.println("vị trí muốn nhập vào là:" + this.name);break;
			case 4: this.name=PositionName.PM;System.out.println("vị trí muốn nhập vào là:" + this.name);break;
			default:System.out.println("mời bạn chọn lại");
			}
			
		}
	}
}
