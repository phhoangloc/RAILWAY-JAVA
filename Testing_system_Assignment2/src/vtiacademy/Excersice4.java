package vtiacademy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Locale;
import java.util.Random;

public class Excersice4 {
	public static void main(String[] args) throws ParseException {
		/*Question 1: 
			In ngẫu nhiên ra 1 số nguyên*/
			Random random = new Random();
			int x = random.nextInt();
			System.out.println(x);
		/*
			Question 2: 
			In ngẫu nhiên ra 1 số thực */
			
			float y = random.nextFloat();
			System.out.println(y);
			
			/*
			Question 3: 
			Khai báo 1 array bao gồm các tên của các bạn trong lớp, sau đó in ngẫu nhiên 
			ra tên của 1 bạn*/
			String [] names= {"a","b","c","d","e","f"};
			int n = random.nextInt(names.length);
			System.out.println(names[n]);
			/*
			Question 4:
			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 24-07-1995 tới ngày 20-12-
			1995
			*/
			int minDay= (int) LocalDate.of(1995,7,24).toEpochDay();
			int maxDay= (int) LocalDate.of(1995,12,20).toEpochDay();
			int randomInt=minDay+random.nextInt(maxDay-minDay);
			LocalDate randomDay=LocalDate.ofEpochDay(randomInt);
			System.out.println(randomDay);
			/*
			Question 5:
			Lấy ngẫu nhiên 1 ngày trong khoảng thời gian 1 năm trở lại đây
			*/
			int nowDay= (int) LocalDate.now().toEpochDay();
			int randomIntq5=nowDay-random.nextInt(365);
			LocalDate randomDayq5=LocalDate.ofEpochDay(randomIntq5);
			System.out.println(randomDayq5);
			/*
			Question 6:
			Lấy ngẫu nhiên 1 ngày trong quá khứ*/
			int maxNow= (int) LocalDate.now().toEpochDay();
			int randomIntq6=random.nextInt(maxNow);
			LocalDate randomDayq6=LocalDate.ofEpochDay(randomIntq6);
			System.out.println(randomDayq6);
			
			/*
			Question 7:
			Lấy ngẫu nhiên 1 số có 3 chữ số*/
			long t=random.nextInt(900)+100;
			System.out.println(t);
	}
}
