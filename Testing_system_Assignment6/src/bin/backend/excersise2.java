package bin.backend;

import java.util.Scanner;

import bin.entity.Department;

public class excersise2 {
	public static void main(String[] args) {
		question1();
		question2();
		question3();
		question4();
		question5();
	}

	private static void question5() {
		Scanner sc = new Scanner(System.in);
		System.out.println("hãy nhập số 1 vào");
		int in = sc.nextInt();
		try {System.out.println(in);}
		catch (Exception e) {System.out.println("bạn nhập không đúng kiểu số mời nhập lại!");}
	}

	private static void question4() {
		// TODO Auto-generated method stub
//		Question 4:
//			Tạo 1 array departments gồm 3 phần tử
//			Sau đó viết 1 method getIndex(int index) để lấy thông tin phần tử thứ 
//			index trong array departments. Nếu index vượt quá length lấy ra thì sẽ 
//			in ra text "Cannot find department."
		Department[] dps = new Department[5];
		try {System.out.println(dps[6]);}catch(Exception e){System.out.println("không tìm thấy phần tử");}
		}

	private static void question3() {
		// TODO Auto-generated method stub
		int[] number= {1,2,3};
		try{System.out.println(number[10]);}
		catch(Exception e) {System.out.println("đã có lỗi! không thể thực hiện phương thức");}
	}

	private static void question2() {
		// TODO Auto-generated method stub
		try{System.out.println(chia(7,0));}
		catch(Exception e){System.out.println("không thể thực hiện khi số bị chia bằng 0");}
		finally {System.out.println("hoàn thành");}
	}

	private static void question1() {
		// TODO Auto-generated method stub
		try{System.out.println(chia(7,0));}
		catch(Exception e){System.out.println("không thể thực hiện khi số bị chia bằng 0");}
	}

	static float chia(int i, int j) {
		return i/j;
	}
			
}
