package com.vti.backend;

import java.text.ParseException;
import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;

public class Excersise1 {
	public static void main(String[] args) throws ParseException {
		question1();
		question2();
		question3();
		
	}
//	Question 1:
//		Tạo constructor cho department: 
//		a) không có parameters
//		b) Có 1 parameter là nameDepartment và default id của 
//		Department = 0
//		Khởi tạo 1 Object với mỗi constructor ở trên
	private static void question1() {
		// TODO Auto-generated method stub
		Department dp1= new Department(null);
		dp1.setDepartmentId((byte) 1);
		dp1.setDepartmentName("Giam Doc");
		System.out.println(dp1);
		
		Department dp2= new Department("Marketing");
		System.out.println(dp2);
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
	private static void question2() throws ParseException {
		// TODO Auto-generated method stub
		Account acc1= new Account(1, "a1@gmail.com","a1","first1","last1");
		System.out.println(acc1);
		Account acc2= new Account(2, "a2@gmail.com","a2","first3","last3",new Date());
		System.out.println(acc2);
		Account acc3= new Account(3, "a3@gmail.com","a3","first3","last3","29-11-2021");
		System.out.println(acc3);
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
	private static void question3() throws ParseException {
		Account acc1= new Account();
		Account acc2= new Account(2, "a2@gmail.com","a2","first3","last3",new Date());
		Account[] accounts = {acc1,acc2};
		Group gr1= new Group("group1",acc1, accounts, new Date());
		System.out.println(gr1);
		
		String[] usernames= {"a4","a5"};
		Group gr2= new Group("group1",acc2, usernames, new Date());
		System.out.println(gr2);
	}
}
