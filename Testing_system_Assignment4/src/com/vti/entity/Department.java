package com.vti.entity;

public class Department {
	private byte departmentId;
	private String departmentName;
	public byte getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(byte i) {
		this.departmentId = i;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	@Override
	public String toString() {
		return "Department [departmentId=" + departmentId + ", departmentName=" + departmentName + "]";
	}
	public Department() {};
	public Department(String departmentname) {
		this.departmentName=departmentname;
	};
}
