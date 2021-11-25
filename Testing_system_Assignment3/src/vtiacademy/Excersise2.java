package vtiacademy;

import java.time.LocalDate;

public class Excersise2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question1();
		
	};
	
//		Question 1:
	public static void question1() {
//	Không sử dụng data đã insert từ bài trước, tạo 1 array Account và khởi 
//	tạo 5 phần tử theo cú pháp (sử dụng vòng for để khởi tạo):
//	 Email: "Email 1"
//	 Username: "User name 1"
//	 FullName: "Full name 1"
//	 CreateDate: now
		Account[] acc5s=new Account[5];
		for(int i=0;i<=acc5s.length;i++) {
			if(i==acc5s.length) {break;}
		Account acc = new Account();
		acc.email = "Email" + (i+1);
		acc.username = "aaa" + (i+1);
		acc.fullName = "aaa aaa" +(i+1);
		acc.createDate=LocalDate.now();
		acc5s[i]=acc;
		System.out.println("thông tin account thứ " + (i+1)+"\n"
				+ "email: "+ acc.email + "\n"
				+ "email: "+ acc.username + "\n"
				+ "email: "+ acc.fullName + "\n"
				+ "email: "+ acc.createDate + "\n"
				);
		}
	}
}
