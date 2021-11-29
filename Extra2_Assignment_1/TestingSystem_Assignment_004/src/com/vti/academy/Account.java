package com.vti.academy;

import java.util.Date;

public class Account {
	int accountID;
	String email;
	String username;
	String fullName;
	Department department;
	Position position;
	Date createDate;
	Group[] groups;
	//a)
	public Account() {

	}

	//b)
	public Account(int accountID, String email, String username, String firstName, String lastName) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = firstName.concat(" ").concat(lastName);
	}
	//c)
	public Account(int accountID, String email, String username, String firstName, String lastName, Position position) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = firstName.concat(" ").concat(lastName);
		this.position = position;
		this.createDate = new Date();
	}
	//d)
	public Account(int accountID, String email, String username, String firstName, String lastName,
			Position position, Date createDate) {
		super();
		this.accountID = accountID;
		this.email = email;
		this.username = username;
		this.fullName = firstName.concat(" ").concat(lastName);
		this.position = position;
		this.createDate = createDate;
	}

	@Override
	public String toString() {
		return "Account [accountID=" + accountID + ", email=" + email + ", username=" + username + ", fullName="
				+ fullName + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ ", groups=" + groups + "]";
	}
}
