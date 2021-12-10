package com.vti.enums;

public enum TypeName {
	TYPE_NAME_ESSAY("Essay"), TYPE_NAME_MULTI_CHOICE("Multiple-Choice");

	private String typeName;

	TypeName(String typeName) {
		this.typeName = typeName;
	}

	public String getTypeName() {
		return typeName;
	}
}
