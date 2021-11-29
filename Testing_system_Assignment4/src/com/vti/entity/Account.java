package com.vti.entity;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class Account {
	private int accountId;
	private String email;
	private String username;
	private String fullName;
	private Department department;
	private Position position;
	private Date createDate;
	private Group[] groups;
	public int getAccountId() {
		return accountId;
	}
	public void setAccountId(int accountId) {
		this.accountId = accountId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public Department getDepartment() {
		return department;
	}
	public void setDepartment(Department department) {
		this.department = department;
	}
	public Position getPosition() {
		return position;
	}
	public void setPosition(Position position) {
		this.position = position;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Group[] getGroups() {
		return groups;
	}
	public void setGroups(Group[] groups) {
		this.groups = groups;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", email=" + email + ", username=" + username + ", fullName="
				+ fullName + ", department=" + department + ", position=" + position + ", createDate=" + createDate
				+ ", groups=" + Arrays.toString(groups) + "]";
	}
	public Account() {};
	public Account(int accountId, String Email, String Username, String FirstName, String LastName) {
		this.accountId=accountId;
		this.email=Email;
		this.username=Username;
		this.fullName=FirstName +" "+ LastName;
	};
	public Account(int accountId, String Email, String Username, String FirstName, String LastName,Date createDate) {
		this.accountId=accountId;
		this.email=Email;
		this.username=Username;
		this.fullName=FirstName +" "+ LastName;
		this.createDate= createDate;
	}
	public Account(int accountId, String Email, String Username, String FirstName, String LastName,String createDate) throws ParseException {
		this.accountId=accountId;
		this.email=Email;
		this.username=Username;
		this.fullName=FirstName +" "+ LastName;
		String date_string1 = createDate;
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date = formatter.parse(date_string1);
		this.createDate= date;
	}
}
