package com.vti.backend;

public class question1 {
	int a;
	int b;
	
	
	public question1(int a, int b) {
		this.a=a;
		this.b=b;
		try{float c1=a/b;System.out.println(c1);}
		catch(ArithmeticException ari){System.out.println("cannot devide 0");}
	}


	
}
