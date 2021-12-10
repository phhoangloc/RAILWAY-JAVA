package com.vti.entity;

import java.util.Arrays;

public class Group {
	public int count;
	private int id;
	private String name;
	private Account[] accounts;
	public Group() {
		accounts = new Account[0];
		count++;
		this.id=count;
		System.out.println("mời bạn nhập vào tên group");
		this.name = ScannerUtils.inputString();
		System.out.println("bạn có muốn thêm mới tài khoản không 0.không 1.có ");
		int number=ScannerUtils.inputint();
		boolean ok=true;
		while(ok) {
			if(number == 1){
				addAccount();
				System.out.println("bạn có muốn nhập thêm tài khoản không 0.không 1.có");
				int ifnum = ScannerUtils.inputint();
				if(ifnum==1) {ok=true;}
				else{ok=false;};
			}
			else {break;};
		}
		
		System.out.println(this);
	}
	private void addAccount() {
		// TODO Auto-generated method stub
		Account account = new Account();
		account.Account();
		accounts = Arrays.copyOf(accounts, accounts.length + 1);
		accounts[accounts.length - 1] = account; 
	}
	@Override
	public String toString() {
		return "Group [count=" + count + ", id=" + id + ", name=" + name + ", accounts=" + Arrays.toString(accounts)
				+ "]";
	}
	
}
