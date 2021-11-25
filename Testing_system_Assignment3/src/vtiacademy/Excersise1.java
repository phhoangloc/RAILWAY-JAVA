package vtiacademy;

import java.util.Random;
import java.util.Scanner;

public class Excersise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Exercise 1 (Optional): Datatype Casting
		
		question1();
		question2();
		question3();
		question4();
	}
//		Question 1:

		public static void question1() {
//			Khai báo 2 số lương có kiểu dữ liệu là float.
			float salary1;
			float salary2;
//			Khởi tạo Lương của Account 1 là 5240.5 $
//			Khởi tạo Lương của Account 2 là 10970.055$
			salary1=(float) 5240.5;
			salary2=(float) 10975.055;
//			Khai báo 1 số int để làm tròn Lương của Account 1 và in số int đó ra
//			Khai báo 1 số int để làm tròn Lương của Account 2 và in số int đó ra
			int intsalary1=(int) salary1;
			int intsalary2=(int) salary2;
			System.out.println("Lương account thứ nhất đã được làm tròn là: "+intsalary1);
			System.out.println("Lương account thứ hai đã được làm tròn là: "+intsalary2);
		}
//		Question 2:
		public static void question2() {
//		Lấy ngẫu nhiên 1 số có 5 chữ số (những số dưới 5 chữ số thì sẽ thêm
//		có số 0 ở đầu cho đủ 5 chữ số)
			Random rand = new Random();
            int ranNum= rand.nextInt((99999));
            if(ranNum<10000) {
            	System.out.println(ranNum);
            System.out.println("chưa biết làm");}
            else {
            System.out.println(ranNum);}
		}
//		Question 3: 
//		Lấy 2 số cuối của số ở Question 2 và in ra.
//		Gợi ý: 
//		Cách 1: convert số có 5 chữ số ra String, sau đó lấy 2 số cuối
//		Cách 2: chia lấy dư số đó cho 100
		public static void question3() {
			Random rand = new Random();
            int ranNum= rand.nextInt((99999));
            int index=ranNum%100;
            System.out.println(index);
		}
//		Question 4:
//		Viết 1 method nhập vào 2 số nguyên a và b và trả về thương của chúng
		public static void question4() {
			@SuppressWarnings("resource")
			Scanner scan = new Scanner(System.in);
			System.out.println("mời bạn nhập vào số nguyên thứ nhất");
			float so1= scan.nextInt();
			System.out.println("mời bạn nhập vào số nguyên thứ hai");
			float so2= scan.nextInt();
			float so3 = so1/so2;
			System.out.println("số thứ nhất chia số thứ hai: "+ so3);
		}
	}


