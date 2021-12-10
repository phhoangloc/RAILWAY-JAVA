package com.vti.backend;

import java.util.Scanner;

public class question5 {
	Scanner sc = new Scanner(System.in);
	public void inputAge() {
		System.out.println("input please! ");
		String input= sc.next();
		try{
		int in = Integer.parseInt (input);
		if(in<=0) {System.out.println("Wrong inputing! The age must be greater than 0, please input again.");inputAge();}
		else {System.out.println(Integer.parseInt (input));}
		}
		catch(Exception e) {
			System.out.println("\"wrong inputing! Please input an age as int, input again");inputAge();
		}
	}
}
