package com.vti.entity.enums;

public enum Typename {
	ESSAY("Essay"), 
	MULTIPLECHOISE("Multiple-choice");

	private String typeName;

	Typename(String typeName) {
		this.typeName = typeName;
	}

	public String getTypename() {
		return typeName;
	}
}