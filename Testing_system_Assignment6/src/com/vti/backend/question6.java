package com.vti.backend;

import java.util.Scanner;

public class question6 {
	Scanner sc = new Scanner(System.in);
	public void inputAge() {
		System.out.println("input please! ");
		String input= sc.next();
		try{
		System.out.println(Integer.parseInt (input));
		}
		catch(Exception e) {
			System.out.println("\"wrong inputing! Please input an age as int, input again");inputAge();
		}
	}
}
