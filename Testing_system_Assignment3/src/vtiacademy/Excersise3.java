package vtiacademy;

import java.time.LocalDate;

public class Excersise3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		question1();
		question2();
		question3();
	}
//	Question 1:
	public static void question1() {

//			Khởi tạo lương có datatype là Integer có giá trị bằng 5000.
//			Sau đó convert lương ra float và hiển thị lương lên màn hình (với số 
//			float có 2 số sau dấu thập phân)
			Integer luong = 5000;
			System.out.printf("người này có lương là: "+ "%2.2f",(float)luong);
	}
	public static void question2() {
		//Question 2:
//			Khai báo 1 String có value = "1234567"
//			Hãy convert String đó ra số int
			String str ="1234567";
			int numstr= Integer.parseInt(str);
			System.out.println("\n"+numstr);
	}
	public static void question3() {		
//		Question 3:
//		Khởi tạo 1 số Integer có value là chữ "1234567"
//		Sau đó convert số trên thành datatype int
			Integer str =1234567;
			int i = str.intValue();
			System.out.println(i);
	}

}