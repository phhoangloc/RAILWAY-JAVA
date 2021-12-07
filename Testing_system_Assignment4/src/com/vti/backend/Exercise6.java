package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.VPhone;

public class Exercise6 {
	Scanner sc;
	VPhone vPhone;
	 public Exercise6() {
		 sc= new Scanner(System.in);
		 vPhone = new VPhone();
	 }
	 public void question1() {
		 loadmenu();
	 }
	private void loadmenu() {
		while (true) {
			System.out.println("xin mời nhập vào số tương ứng với thao tác của bạn");
			System.out.println("1. thêm sdt" + "\n" 
					+ "2. xóa sdt" + "\n" 
					+ "3. đổi sdt" + "\n" 
					+ "4. tìm sdt" + "\n" 
					+ "5. xem sdt" + "\n" 
					+ "6. thoát ứng dụng");
			byte num = sc.nextByte();
			switch(num) {
			case 1: themsdt();break;
			case 2: xoasdt();break;
			case 3: thaydoisdt();break;
			case 4: timsdt();break;
			case 5: xemsdt();break;
			default: System.out.println("bạn nhập không đúng. mời nhập lại!"); loadmenu();
			}
		}
	}
	private void timsdt() {
		System.out.println("nhập tên danh bạ cần tìm: ");
		String name = sc.next();
		vPhone.searchContact(name);
		
	}
	private void thaydoisdt() {
		System.out.println("Nhập tên mới");
		String name = sc.next();
		System.out.println("Nhập số mới ");
		String phone = sc.next();
		vPhone.updateContact(name, phone);
		
	}
	private void xemsdt() {
		vPhone.printContact();
		question1();
		
	}
	private void xoasdt() {
		System.out.println("nhập tên số đt muốn xóa");
		String name = sc.next();
		vPhone.removeContact(name);
	}
	private void themsdt() {
		// TODO Auto-generated method stub
		
		sc.nextLine();
		System.out.println("nhập tên mới");
		String name = sc.nextLine();
		System.out.println("nhập số đt mới");
		String number = sc.nextLine();
		vPhone.insertContact(name, number);
		
		loadmenu();
		
	}
	
//	Question 1: abstract class & abstract method
//	Tạo 1 class Phone để lưu thông tin liên lạc, trong Phone có chứa 1 
//	property có kiểu dữ liệu là Array contacts, trong từng contact có lưu 
//	thông tin number, name
//	a) Tạo các abstract method 
//	a. void insertContact(String name, String phone)
//	b. void removeContact(String name)
//	c. void updateContact(String name, String newPhone)
//	d. void searchContact(String name)
//	b) Tạo class VietnamesePhone kế thừa Phone và triển khai các 
//	method abstract
//	Viết chương trình demo
}