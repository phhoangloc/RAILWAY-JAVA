package com.vti.entity;

import java.util.Scanner;

public class ScannerUtils {
	private static Scanner sc; 
	public static int inputint() {
		sc = new Scanner(System.in);
		while (true) {
			try {
				return Integer.parseInt(sc.next());
			} catch(Exception e){
				System.out.println("nhập lại kiểu int");
			}
		}
		
	}
	public static float inputfloat() {
		sc = new Scanner(System.in);
		while (true) {
			try {
				return Float.parseFloat(sc.next());
			} catch(Exception e){
				System.out.println("nhập lại kiểu float");
			}
		}
	}
	public static double inputdouble() {
		sc = new Scanner(System.in);
		while (true) {
			try {
				return Double.parseDouble(sc.next());
			} catch(Exception e){
				System.out.println("nhập lại kiểu double");
			}
		}
		
	}
	public static String inputString() {
		sc = new Scanner(System.in);
		while (true) {
			try {
				String string = sc.nextLine();
				if(!string.isEmpty())
				return string;
			} catch(Exception e){
				System.out.println("nhập lại kiểu String");
			}
		}
	}
}
