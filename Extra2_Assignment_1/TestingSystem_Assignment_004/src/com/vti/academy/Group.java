package com.vti.academy;

import java.util.Arrays;
import java.util.Date;

public class Group {
	byte groupID;
	String groupName;
	Account creator;
	Date createDate;
	Account[] accounts;

	//a)
	public Group() {

	}

	//b)
	public Group(String groupName, Account creator, Date createDate, Account[] accounts) {
		super();
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts = accounts;
	}
	

	//c)
	public Group(String groupName, Account creator, String[] usernames, Date createDate) {
		this.groupName = groupName;
		this.creator = creator;
		this.createDate = createDate;
		this.accounts  = new Account[] {};//khởi tạo mảng
		if(usernames.length > 0) {//kiểm tra nếu số username > 0 thì mới khởi tạo Account
			for (String uname : usernames) {
				Account account = new Account();
				account.username = uname; 
				//độ dài = 0 
				//a = {}; -> độ dài: 0;
				//a ={b,c} -> độ dài: 2
				//a[0] = b;
				//a[1] = c
				this.accounts = Arrays.copyOf(this.accounts, this.accounts.length + 1);// tăng size lên 1 để lưu phần tử mới
				this.accounts[this.accounts.length - 1] = account;// thêm phần tử mới vào mảng
			}
		}
	}
	@Override
	public String toString() {
		return "Group [groupID=" + groupID + ", groupName=" + groupName + ", creator=" + creator + ", createDate="
				+ createDate + ", accounts=" + accounts + "]";
		
	}

}
