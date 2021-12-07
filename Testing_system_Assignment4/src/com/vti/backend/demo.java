package com.vti.backend;

import java.util.Scanner;

import com.vti.entity.CanBo;
import com.vti.entity.CongNhan;

public class demo {
	public static void main(String[] args) {
		
		question1();
	}

	@SuppressWarnings("resource")
	public static void question1() {
		Scanner sc = new Scanner(System.in);
		// TODO Auto-generated method stub
		System.out.println("điền tên công nhân");
		String hoten= sc.nextLine();
		System.out.println("điền tuổi công nhân");
		byte tuoi= sc.nextByte();
		sc.nextLine();
		System.out.println("điền giới tính công nhân");
		String gioitinh = sc.nextLine();
		System.out.println("điền địa chỉ công nhân");
		String diachi= sc.nextLine();
		System.out.println("điền cấp bậc công nhân");
		Byte capbac= sc.nextByte();
		CanBo cb1 = new CongNhan(hoten, tuoi, gioitinh, diachi,capbac);
		System.out.println(cb1);
	}
}
