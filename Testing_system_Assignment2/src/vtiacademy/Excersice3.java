package vtiacademy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Excersice3 {
	public static void main(String[] args) throws ParseException {
	
	/*Question 1: 
		In ra thông tin Exam thứ 1 và property create date sẽ được format theo định 
		dạng vietnamese*/
		
		Exam exam1 = new Exam();
		exam1.examId=1;
		exam1.code="THUOQN";
		exam1.title="bai thi JAVA";
		String date_string13 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter13 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date13 = formatter13.parse(date_string13);
		exam1.createDate=date13;
		
		Locale locale = new Locale("vi","VN");
		DateFormat dateFormat= DateFormat.getDateInstance(DateFormat.DEFAULT,locale);
		String date = dateFormat.format(date13);
		System.out.println(date);

		Exam exam2 = new Exam();
		exam2.examId=2;
		exam2.code="THTOQN";
		exam2.title="bai thi EXCEL";
		String date_string14 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter14 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date14 = formatter14.parse(date_string14);
		exam2.createDate=date14;
		
		Exam exam3 = new Exam();
		exam3.examId=3;
		exam3.code="THYOQN";
		exam3.title="bai thi EXCEL";
		String date_string15 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter15 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date15 = formatter15.parse(date_string15);
		exam3.createDate=date15;
	
	/*Question 2: 
		In ra thông tin: Exam đã tạo ngày nào theo định dạng 
		Năm – tháng – ngày – giờ – phút – giây*/
		String paternq2 = "YYYY-MM-dd HH:mm:ss";
		SimpleDateFormat formatterq2 = new SimpleDateFormat(paternq2);
		Exam[] exams= {exam1,exam2,exam3};
		for(Exam exam: exams) {
			String date1 = formatterq2.format(exam.createDate);
			System.out.println(date1);
		}
	/*Question 3: 
Chỉ in ra năm của create date property trong Question 2*/

		
		String paternq3 = "YYYY";
		SimpleDateFormat formatterq3 = new SimpleDateFormat(paternq3);
		Exam[] exams3= {exam1,exam2,exam3};
		for(Exam exam: exams3) {
			String date2 = formatterq3.format(exam.createDate);
			System.out.println("năm là: " + date2);
		}
		
		/*Question 4: 
Chỉ in ra tháng và năm của create date property trong Question 2*/
		
		String paternq4 = "YYYY-MM";
		SimpleDateFormat formatterq4 = new SimpleDateFormat(paternq4);
		Exam[] exams4= {exam1,exam2,exam3};
		for(Exam exam: exams4) {
			String date4 = formatterq4.format(exam.createDate);
			System.out.println("năm-tháng: " + date4);
		}
		
		/*Question 5: 
		Chỉ in ra "MM-DD" của create date trong Question 2*/
		String paternq5 = "MM-dd";
		SimpleDateFormat formatterq5 = new SimpleDateFormat(paternq5);
		Exam[] exams5= {exam1,exam2,exam3};
		for(Exam exam: exams5) {
			String date5 = formatterq5.format(exam.createDate);
			System.out.println("năm-tháng: " + date5);
		}
	}
}
