package com.vti.backend;

import com.vti.entity.Department;

public class question4 {
	Department dp1 = new Department(1,"giam doc");
	Department dp2 = new Department(2,"bao ve");
	Department dp3 = new Department(3,"nhan su");
	Department dp4 = new Department(4,"tai vu");
	Department [] dpArr= {dp1,dp2,dp3,dp4};
	
	public question4(int index) {
		try{System.out.println(dpArr[index]);}
		catch(Exception e) {System.out.println("not available");}
	}
}
