package vtiacademy;

import java.time.LocalDate;
import java.util.Scanner;

public class Excersise5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Department dp1 = new Department();
		dp1.departmentId = 1;
		dp1.departmentName= "Accounting";
		Department dp2 = new Department();
		dp2.departmentId = 2;
		dp2.departmentName= "Boss of director";
		Department dp3 = new Department();
		dp3.departmentId = 3;
		dp3.departmentName= "Marketing";
		Department dp4 = new Department();
		dp4.departmentId = 4;
		dp4.departmentName= "Sale";
		Department dp5 = new Department();
		dp5.departmentId = 5;
		dp5.departmentName= "Waiting room";
		Department dp6 = new Department();
		dp6.departmentId = 6;
		dp6.departmentName= "Waiting room";
		Department[] departments = new Department[6];
		departments[0]=dp1;
		departments[1]=dp2;
		departments[2]=dp3;
		departments[3]=dp4;
		departments[4]=dp5;
		departments[5]=dp6;
		
//		question1(dp1);
//		question2(departments);
//		question3(dp1);
//		question4(dp1);
		question5(dp1,dp2);
//		question6();
//		question7();
//		question8();
//		question9();
//		question4();
//		question4();
	}
//	Question 1:
//	In ra thông tin của phòng ban thứ 1 (sử dụng toString())
	public static void question1(Department department) {
		System.out.println(department.toString());
	}
//	Question 2:
//	In ra thông tin của tất cả phòng ban (sử dụng toString())
	public static void question2(Department[] departments) {
		for(Department department:departments)
		System.out.println(department.toString());
	}
//	Question 3:
//	In ra địa chỉ của phòng ban thứ 1
	public static void question3(Department department) {
		System.out.println(department.hashCode());
	}
//	Question 4: Kiểm tra xem phòng ban thứ 1 có tên là "Phòng A" không?
	public static void question4(Department department) {
		if(department.departmentName.equals("Phong A")) {
			System.out.println("phòng ban thứ 1 có tên là Phòng A");
		}else {
		System.out.println("phòng ban thứ 1 có tên khác tên Phòng A");
		}
	}
//	Question 5: So sánh 2 phòng ban thứ 1 và phòng ban thứ 2 xem có bằng nhau 
//	không (bằng nhau khi tên của 2 phòng ban đó bằng nhau)
	public static void question5(Department dp1,Department dp2) {
		if(dp1.departmentName.equals(dp2.departmentName)) {
			System.out.println("phòng ban thứ 1 có tên giống phòng thứ 2");
		}else {
		System.out.println("phòng ban thứ 1 có tên khác phòng thứ 2");
		}
	}
//	Question 6: Khởi tạo 1 array phòng ban gồm 5 phòng ban, sau đó in ra danh 
//	sách phòng ban theo thứ tự tăng dần theo tên (sắp xếp theo vần ABCD)
	
//	VD: 
//	Accounting
//	Boss of director
//	Marketing
//	Sale
//	Waiting room
//	Question 7: Khởi tạo 1 array học sinh gồm 5 Phòng ban, sau đó in ra danh 
//	sách phòng ban được sắp xếp theo tên
//	VD: 
//	Accounting
//	Boss of director
//	Marketing
//	waiting room
//	Sale
}