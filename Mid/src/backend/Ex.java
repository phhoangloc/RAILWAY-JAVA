package backend;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import entity.Admin;
import entity.Employee;
import entity.User;

public class Ex {
	User us1 = new Admin(1,"loc1","hoangloc1","loc1@gmai","ph10310",3);
	User us2 = new Employee(2,"loc2","hoangloc2","loc2@gmai","ph20310","JAVA");
	User us3 = new Admin(3,"loc3","hoangloc3","loc3@gmai","ph30310",3);
	User us4 = new Admin(4,"loc4","hoangloc4","loc4@gmai","ph40310",5);
	User us5 = new Employee(5,"loc5","hoangloc5","loc5@gmai","ph50310","JAVA");
	
	User[] users= {us1,us2,us3,us4,us5};
	
	List<User> userList = new ArrayList<>(Arrays.asList(users));
	Scanner sc = new Scanner(System.in);
	
	public void question2() {
		for (User user:users)
		System.out.println(user);
	}
	public void question3() {
		System.out.println("nhap id: ");
		int input=sc.nextInt();
		for (User user:users) {
			if(user.getId()==input) {System.out.println(user);}
		}
	}
	public void question4() {
		System.out.println("nhap id: ");
		int input=sc.nextInt();
		for (int i=0; i<users.length;i++) {
			if(users[i].getId()==input) {
				userList.remove(i);//Xóa phần tử đầu tiên có thứ tự thứ i;
				users = userList.toArray(new User[0]);// Chuyển ArrayList kết quả trở về Array và lưu trong mảng kết quả;
				System.out.println("Mang ket qua :\n"+Arrays.toString(users));
			}
		}
	}
}
	