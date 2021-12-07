package com.vti.academy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Exercise1 {
	public static void main(String[] args) throws ParseException {
		// question1();
		//question2();
		question3();
	}

//	Question 1:
//		Tạo constructor cho department:
//		a) không có parameters
//		b) Có 1 parameter là nameDepartment và default id của
//		Department = 0
//		Khởi tạo 1 Object với mỗi constructor ở trên
	public static void question1() {
		// a) hàm khởi tạo không tham số
		Department department = new Department();
		department.departmentID = 1;
		department.departmentName = "Sale";
		System.out.println("///hàm khởi tạo không tham số///");
		System.out.println("departmentID: " + department.departmentID);
		System.out.println("departmentName: " + department.departmentName);
		// b) hàm khởi tạo có tham số
		System.out.println("///hàm khởi tạo có tham số///");
		Department department2 = new Department("Marketing");
		System.out.println("departmentID: " + department2.departmentID);
		System.out.println("departmentName: " + department2.departmentName);
	}

//	Question 2:
//		Tạo constructor cho Account:
//		a) Không có parameters
//		b) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName)
//		c) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, default createDate = now
//		d) Có các parameter là id, Email, Username, FirstName,
//		LastName (với FullName = FirstName + LastName) và
//		Position của User, createDate

//		Khởi tạo 1 Object với mỗi constructor ở trên

	public static void question2() throws ParseException {
		// a) Không có parameters
		Account account = new Account();
		account.accountID = 1;
		account.email = "vana@gmail.com";
		account.username = "vana";
		account.fullName = "";
		account.department = null;
		account.position = null;
		account.createDate = new Date();
		account.groups = null;

		System.out.println("//// a) Không có parameters ///////");
		System.out.println(account);
		// b) Có các parameter là id, Email, Username, FirstName,
		// LastName (với FullName = FirstName + LastName)

		Account account2 = new Account(2, "vanb@gmail.com", "vanb", "Nguyễn Văn", "b");
		System.out.println("//// b) hàm có parameters ///////");
		System.out.println(account2);

		// c) Có các parameter là id, Email, Username, FirstName,
		// LastName (với FullName = FirstName + LastName) và
		// Position của User, default createDate = now

		Account account3 = new Account(2, "vanc@gmail.com", "vanc", "Nguyễn Văn", "c", null);
		System.out.println("//// c) hàm có parameters ///////");
		System.out.println(account3);

		// d) Có các parameter là id, Email, Username, FirstName,
		// LastName (với FullName = FirstName + LastName) và
		// Position của User, createDate

		//create a date
		String dateString = "20-11-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date createDate = formatter.parse(dateString);
		
		Account account4 = new Account(3, "vand@gmail.com", "vand", "Nguyễn Văn", "d",  null, createDate);
		System.out.println("//// d) hàm có parameters ///////");
		System.out.println(account4);
		
		
		
		

	}
	
//	Question 3:
//		Tạo constructor cho Group:
//		a) không có parameters
//		b) Có các parameter là GroupName, Creator, array Account[]
//		accounts, CreateDate
//		c) Có các parameter là GroupName, Creator, array String[]
//		usernames , CreateDate
//		Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
//		username, các thông tin còn lại = null).
//		Khởi tạo 1 Object với mỗi constructor ở trên
	public static void question3() throws ParseException {
		
		// creator: thông tin người tạo
		Account account = new Account();
		account.accountID = 1;
		account.email = "vana@gmail.com";
		account.username = "vana";
		account.fullName = "nguyen van a";
		account.department = null;
		account.position = null;
		account.createDate = new Date();
		account.groups = null;
		
		
		//create a date
		String dateString = "20-11-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date createDate = formatter.parse(dateString);
		
		 
		Account account2 = new Account(2, "vanb@gmail.com", "vanb", "Nguyễn Văn", "b");
		
		
		Account [] accountArr = new Account[] {account,account2};
		
		//a) không có parameters
		Group group1 = new Group();
		group1.groupID = 1;
		group1.groupName = "Nhóm 1";
		group1.creator = account;
		group1.createDate = createDate;
		group1.accounts =  accountArr;
				
		
		System.out.println("////// a) không có parameters////////");
		System.out.println(group1);
		System.out.println("Xem danh sách nhân viên: ");
		for (Account acc : group1.accounts) {
			System.out.println(acc);
		}
		
		System.out.println("");
		
		
		//b) Có các parameter là GroupName, Creator, array Account[]
		Group group2 = new Group("Group 2", account2, createDate, accountArr);
		System.out.println("////// b) hàm khởi tạo có parameter  ///////");
		System.out.println(group2);
		System.out.println("Xem danh sách nhân viên: ");
		for (Account acc : group2.accounts) {
			System.out.println(acc);
		}
		
		//c) Có các parameter là GroupName, Creator, array String[]
		//usernames , CreateDate
		//Với mỗi username thì sẽ khởi tạo 1 Account (chỉ có thông tin
		//username, các thông tin còn lại = null).
		//Khởi tạo 1 Object với mỗi constructor ở trên
		
		System.out.println(" ");
		
		String [] usernames = new String[] {"vand","vane"};
		Group group3 = new Group("Group 3", account2, usernames, createDate);
		
		System.out.println("c) Hàm khởi tạo có tham số");
		System.out.println(group3);
		System.out.println("Xem danh sách nhân viên: ");
		for (Account acc : group3.accounts) {
			System.out.println(acc);
		}
	}
}
