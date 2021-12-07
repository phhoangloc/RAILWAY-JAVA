package com.vti.backend;

import java.util.Arrays;
import java.util.Scanner;

import com.vti.entity.News;

public class MyNews{
	
//	Exercise 1: Abstraction
//	Question 1: Interface
//	Tạo một interface có tên INews bao gồm method void Display(), float 
//	Calculate().
//	Tạo một class News bao gồm thuộc tính: 
//	ID (int), Title (String), PublishDate (String), Author (String), 
//	Content (String) và AverageRate (float). 
//	Tạo các setter và getter cho từng thuộc tính, riêng AverageRate thì chỉ 
//	có getter.
//	Implement các method trong interface INews như sau:
//	a) Method Display() sẽ in ra Title, PublishDate, Author, 
//	Content và AverageRate của tin tức ra console.
//	b) Method có tên Calculate() để thiết đặt thuộc tính 
//	Khai báo một array có tên Rates kiểu int gồm 3 phần tử
//	AverageRate là trung bình cộng của 3 phần tử của array
//	Rates.
//	c) Tạo chương trình demo có tên là MyNews và tạo một menu 
//	lựa chọn gồm các mục sau:
//	 Insert news
//	 View list news
//	 Average rate
//	 Exit
//	Nếu người dùng chọn 1 từ bàn phím thì tạo một object của 
//	class News và nhập giá trị cho các thuộc tính Title, 
//	PublishDate, Author, Content sau đó yêu cầu người dùng 
//	nhập vào 3 đánh giá để lưu vào Rates.
//	Nếu người dùng chọn 2 từ bàn phím thì thực thi method
//	Display().
//	Nếu người dùng chọn 3 từ bàn phím thì thực hiện method
//	Calculate() để tính đánh giá trung bình, sau đó thực thi 
//	method Display().
//	Trường hợp người dùng chọn 4 thì sẽ thoát khỏi chương 
//	trình
	
	Scanner sc;
	News[] Mynews;
	public MyNews() {
		sc= new Scanner(System.in);
		Mynews = new News[] {};
	}
	public void question1() {
		displaymenu();
		
	}
	public void displaymenu() {
		System.out.println("nhập số tương ứng với method cần thực hiện");
		System.out.println("1.Insert news\r\n"
				+ "2.View list news\r\n"
				+ "3.Average rate\r\n"
				+ "4.Exit");
		byte num = sc.nextByte();
		switch(num) {
		case 1: Insertnews();break;
		case 2: Viewlist();break;
		case 3: Averagerate();break;
		case 4: break;
		default: System.out.println(" bạn đã nhập sai phương thức");
		displaymenu();break;
		}
	}
	private void Averagerate() {
		for(News newarr:Mynews) {
			System.out.println("các bài tin tức có điểm trung bình là:");
			System.out.println("bài viết " + newarr.getTilte() + ":" + newarr.getAverageRate());
		}
		displaymenu();
	}
	private void Viewlist() {
		for(News newarr:Mynews) {
			System.out.println("list các bài tin tức");
			System.out.println(newarr);
		}
		displaymenu();
	}
	private void Insertnews() {
		sc.nextLine();
		System.out.println("mời bạn nhập vào tiêu đề");
		String title=sc.nextLine();
		System.out.println("mời bạn nhập vào ngày đăng");
		String pd=sc.nextLine();
		System.out.println("mời bạn nhập vào tác giả");
		String au=sc.nextLine();
		System.out.println("mời bạn nhập vào nội dung");
		String content=sc.nextLine();
		System.out.println("mời bạn nhập vào dánh giá thứ nhất");
		int rate1=sc.nextInt();
		System.out.println("mời bạn nhập vào dánh giá thứ hai");
		int rate2=sc.nextInt();
		System.out.println("mời bạn nhập vào dánh giá thứ ba");
		int rate3=sc.nextInt();
		float averates= ((float)rate1+(float)rate2+(float)rate3)/3;
		News new1 = new News(title,pd,au,content,averates);
		Mynews = Arrays.copyOf(Mynews, Mynews.length + 1);
		Mynews[Mynews.length - 1] = new1; 
		System.out.println("tin bạn được đăng lên là: ");
		System.out.println(new1);
		displaymenu();
	}
}

