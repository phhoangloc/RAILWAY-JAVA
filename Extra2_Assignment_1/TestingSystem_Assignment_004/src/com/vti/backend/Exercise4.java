package com.vti.backend;

import com.vti.entity.Account;
import com.vti.entity.Circle;
import com.vti.entity.Date;
import com.vti.entity.Student;

public class Exercise4 {
	// question1
	public void question1() {
		Student st1 = new Student("Hùng", "Hà Nội");
		st1.setScore(2f);
		Student st2 = new Student("Hải", "Cần Thơ");
		st2.setScore(5f);
		Student st3 = new Student("Name", "Bắc Giang");
		st3.setScore(9.9f);
		System.out.println(st1);
		System.out.println(st2);
		System.out.println(st3);
	}

	// question2
	public void question2() {
		System.out.println("--- Circle ----");
		Circle circle = new Circle(2.0, "red");
		System.out.println("Diện tích hình tròn là: " + circle.getArea());

		System.out.println("---- Account -----");
		Account account1 = new Account("1", "account1", 10);
		Account account2 = new Account("2", "account2", 20);
		System.out.println(
				"Số tiền ban đầu của: account1: " + account1.getBalance() + " account2: " + account2.getBalance());

		account1.credit(30);
		System.out.println("Balance của account1 sau khi Credit 30: " + account1.getBalance());

		account1.debit(10);
		System.out.println("Balance của account1 sau khi debit 10: " + account1.getBalance());

		System.out.println("account1 chuyển 50 cho account2: ");
		account1.tranfer(account2, 50);
		System.out.println("Sau khi chuyển số tiền của account1: " + account1.getBalance() + " account2: "
				+ account2.getBalance());
		
		
		System.out.println("---- Date -----");
		Date date1 = new Date(25, 04, 1988);
		System.out.println("Bạn vừa tạo ngày: " + date1);
		System.out.println("Kiểm tra năm nhuận: ");
		if (date1.isLeapYear()) {
			System.out.println("Đây là năm nhuận");
		} else {
			System.out.println("Đây không phải là năm nhuận");
		}
	}
}
