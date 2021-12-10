package com.vti.entity;

public class Account {
	private int id;
	private String name;
	private String address;
	public int count;
	public void Account() {
		count++;
		this.id=count;
		System.out.println("mời bạn nhập tên");
		this.name=ScannerUtils.inputString();
		System.out.println("mời bạn nhập địa chỉ");
		this.address=ScannerUtils.inputString();
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", name=" + name + ", address=" + address + ", count=" + count + "]";
	}
	
	
}
