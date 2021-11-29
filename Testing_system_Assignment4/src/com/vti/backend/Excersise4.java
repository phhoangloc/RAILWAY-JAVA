package com.vti.backend;

import java.text.ParseException;
import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.Department;
import com.vti.entity.Group;
import com.vti.entity.Student;

public class Excersise4 {
	public static void main(String[] args) throws ParseException {
		question1();
//		question2();
//		question3();
		
	}

	public static void question1(){
		Student st1= new Student("Van A","Ha Noi");
		System.out.println(st1);
		
//		c) Tạo 1 method cho phép set điểm vào
		st1.setScore((float) 8.5);
		System.out.println(st1.getScore());
		
//		d) Tạo 1 method cho phép cộng thêm điểm
		st1.setMoreScore((float) 0.5);
		System.out.println(st1.getScore());
		
	
//	e) Tạo 1 method để in ra thông tin của sinh viên bao gồm có tên, 
//	điểm học lực ( nếu điểm <4.0 thì sẽ in ra là Yếu, nếu điểm > 
//	4.0 và < 6.0 thì sẽ in ra là trung bình, nếu điểm > 6.0 và < 8.0 
//  thì sẽ in ra là khá, nếu > 8.0 thì in ra là Giỏi)
	System.out.println(st1);
	}
}
