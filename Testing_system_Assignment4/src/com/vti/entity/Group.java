package com.vti.entity;
import java.util.Arrays;
import java.util.Date;

public class Group {
	private byte groupId;
	private String groupName;
	private Account creator;
	private Date createDate;
	private Account[] accounts;
	public byte getGroupId() {
		return groupId;
	}
	public void setGroupId(byte groupId) {
		this.groupId = groupId;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}
	public Account getCreator() {
		return creator;
	}
	public void setCreator(Account creator) {
		this.creator = creator;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Account[] getAccounts() {
		return accounts;
	}
	public void setAccounts(Account[] accounts) {
		this.accounts = accounts;
	}
	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", groupName=" + groupName + ", creator=" + creator + ", createDate="
				+ createDate + ", accounts=" + Arrays.toString(accounts) + "]";
	}
	public Group() {};
	public Group(String GroupName, Account Creator, Account[] accounts, Date CreateDate) {
		this.groupName=GroupName;
		this.creator=Creator;
		this.accounts=accounts;
		this.createDate=CreateDate;
	};
	public Group(String GroupName, Account Creator, String[] usernames, Date CreateDate) {
		this.groupName=GroupName;
		this.creator=Creator;
		this.accounts= new Account[] {};
		if(usernames.length>0) {
			for (String user : usernames) {
				Account account = new Account();
				account.setUsername(user);
			this.accounts = Arrays.copyOf(this.accounts, this.accounts.length + 1);
			this.accounts[this.accounts.length - 1] = account;
		}
		this.createDate=CreateDate;
		};
	}
}
