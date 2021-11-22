package vtiacademy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Excersice2 {
	public static void main(String[] args) throws ParseException {
		question1();
		question2();
		question3();
		question4();
		question5();
	}
	/*Question 1: 
		Khai báo 1 số nguyên = 5 và sử dụng lệnh System out printf để in ra số 
		nguyên đó*/
		public static void question1() {
		int a=5;
		System.out.printf("số nguyên: %d%n", a);
		}
	/*Question 2: 
			Khai báo 1 số nguyên = 100 000 000 và sử dụng lệnh System out printf để in 
			ra số nguyên đó thành định dạng như sau: 100,000,000*/
		public static void question2() {
		int b=10000000;
		System.out.printf(Locale.US,"số nguyên: %,d %n", b);
		}
	/*Question 3: 
Khai báo 1 số thực = 5,567098 và sử dụng lệnh System out printf để in ra số 
thực đó chỉ bao gồm 4 số đằng sau*/
		public static void question3() {
		float c = 132.346659829348f;
		System.out.printf("số nguyên: '%5.4f'%n", c);
		}
		/*Question 4: 
			Khai báo Họ và tên của 1 học sinh và in ra họ và tên học sinh đó theo định 
			dạng như sau:
			Họ và tên: "Nguyễn Văn A" thì sẽ in ra trên console như sau: 
			Tên tôi là "Nguyễn Văn A" và tôi đang độc thân.*/
		public static void question4() {
		String d = "Nguyễn Văn A";
		System.out.printf( "Tên tôi là " + "\""+"%s%n",d + "\""+ " và tôi đang độc thân.");
		}
		/*Question 5:
			Lấy thời gian bây giờ và in ra theo định dạng sau:
			24/04/2020 11h:16p:20s */
		public static void question5() {
		String pattern = "dd/MM/YYYY HH:mm:ss";
		SimpleDateFormat simpledateformat = new SimpleDateFormat(pattern);
		String date = simpledateformat.format(new Date());
		System.out.println("bây giờ là " + date);
	}
}
