package com.vti.entity;

public class Department {
	private int id;
	private String name;
	private int count;
	
	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
	public Department(int id,String name) {
		this.id=id;
		this.name=name;
	}
	
	public Department() {
		super();
		count++;
		this.id=count;
		System.out.println("nhập vào tên phòng");
		this.name=ScannerUtils.inputString();
		System.out.println("tên phòng mới nhập là " + this.name);
	}
};

