package vtiacademy;

import java.time.LocalDate;
import java.util.Scanner;

public class Excersise4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//  	question1();
//		question2();
//		question3();
//		question4();
//		question5();
//		question6();
//		question7();
//		question8();
		question9();
//		question4();
//		question4();
	}
//	Question 1:
//		Nhập một xâu kí tự, đếm số lượng các từ trong xâu kí tự đó (các từ có 
//		thể cách nhau bằng nhiều khoảng trắng );
	public static void question1() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("xin mời nhập vào một chuỗi");
		String str=sc.nextLine();
		String[] strarr=str.split("\s+");
		int strarrcount=strarr.length;
		System.out.println("số từ trong chuỗi là: " + strarrcount);
	}
//		Question 2: 
//		Nhập hai xâu kí tự s1, s2 nối xâu kí tự s2 vào sau xâu s1;
	public static void question2() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("xin mời nhập vào chuỗi thứ nhất");
		String str1=sc.nextLine();
		System.out.println("xin mời nhập vào chữ thứ hai");
		String str2 = sc.nextLine();
		System.out.println("nhập hai chuỗi vừa nhập vào lại là:" + str1 +" "+ str2);
	}
//		Question 3: 
//		Viết chương trình để người dùng nhập vào tên và kiểm tra, nếu tên chư 
//		viết hoa chữ cái đầu thì viết hoa lên
	public static void question3() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("xin mời nhập vào tên");
		String str = sc.nextLine();
		String wordf=str.substring(0,1);
		String wordF=wordf.toUpperCase();
		String wordl=str.substring(1);
		if(wordf.equals(wordF)) {System.out.println(wordF+wordl);}
		else{System.out.println(wordF+wordl);}
	}
//		Question 4: 
//		Viết chương trình để người dùng nhập vào tên in từng ký tự trong tên 
//		của người dùng ra
//		VD: 
//		Người dùng nhập vào "Nam", hệ thống sẽ in ra
//		"Ký tự thứ 1 là: N" 
//		"Ký tự thứ 1 là: A" 
//		"Ký tự thứ 1 là: M"
	public static void question4() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("xin mời nhập vào tên");
		String str = sc.nextLine();
		String STR= str.toUpperCase();
		for (int i=0;i<STR.length();i++) {
			System.out.println("kí tự thứ "+ (i+1) +" là " + STR.charAt(i));
		}
	}
//	Question 5: 
//		Viết chương trình để người dùng nhập vào họ, sau đó yêu cầu người 
//		dùng nhập vào tên và hệ thống sẽ in ra họ và tên đầy đủ
	public static void question5() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("xin mời nhập vào họ");
		String ho = sc.nextLine();
		System.out.println("xin mời nhập vào tên");
		String ten = sc.nextLine();
		System.out.println("họ và tên là "+ho+" "+ten);
		
	}
//		Question 6:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và 
//		sau đó hệ thống sẽ tách ra họ, tên , tên đệm
//		VD:
//		Người dùng nhập vào "Nguyễn Văn Nam"
//		Hệ thống sẽ in ra
//		"Họ là: Nguyễn"
//		"Tên đệm là: Văn"
//		"Tên là: Nam"
	public static void question6() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("xin mời nhập vào họ tên");
		String hoten = sc.nextLine();
		String[] word = hoten.split("\s");
		int num =word.length;
		switch (num) {
		case 2: System.out.println("người này có họ là: " + word[0]+"\n" +"người này có tên là: "+ word[1]+"\n" );break;
		case 3: System.out.println("người này có họ là: " + word[0]+"\n" +"người này có tên đệm là: "+ word[1] + "\n"+ "người này có tên là: "+ word[2]+"\n" );break;
		case 4: System.out.println("người này có họ là: " + word[0]+"\n" +"người này có tên đệm là: "+ word[1]+ " " + word[2] + "\n"+ "người này có tên là: "+ word[3]+"\n" );break;
		default: System.out.println("không có kiểu tên này");break;
		}
		}
		
//		Question 7:
//		Viết chương trình yêu cầu người dùng nhập vào họ và tên đầy đủ và 
//		chuẩn hóa họ và tên của họ như sau:
//		a) Xóa dấu cách ở đầu và cuối và giữa của chuỗi người dùng nhập vào
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ 
//		chuẩn hóa thành "nguyễn văn nam"
//		b) Viết hoa chữ cái mỗi từ của người dùng
//		VD: Nếu người dùng nhập vào " nguyễn văn nam " thì sẽ 
//		chuẩn hóa thành "Nguyễn Văn Nam"
	public static void question7() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("xin mời nhập vào họ tên");
		String str = sc.nextLine().trim().replace("\s+", "");
		String[] arrs = str.split("\s+");
		str="";
		for(String arr:arrs) {
			String wordf=arr.substring(0, 1).toUpperCase();
			String wordl=arr.substring(1);
			arr = wordf + wordl;
			str += arr + " " ;
		}
		System.out.println("tên vừa nhập vào là: " + str);
	}
//		
//		Question 8:
//		In ra tất cả các group có chứa chữ "Java"
	public static void question8() {
		Group group1 = new Group();
		group1.groupName="Java";
		Group group2 = new Group();
		group2.groupName="JavaScript";
		Group group3 = new Group();
		group3.groupName="Script";
		Group group4 = new Group();
		group4.groupName="";
		Group group5 = new Group();
		Group[] groups = {group1,group2,group3,group4,group5};
		for(Group gr:groups) {
			if(gr.groupName==null) {continue;}else
			if(gr.groupName.contains("Java")) {
				System.out.println("các group có chứa chữ Java: "+ gr.groupName);
			}else {continue;};
		}
	}
//		Question 9:
//		In ra tất cả các group "Java"
public static void question9() {
		Group group1 = new Group();
		group1.groupName="Java";
		Group group2 = new Group();
		group2.groupName="JavaScript";
		Group group3 = new Group();
		group3.groupName="Script";
		Group group4 = new Group();
		group4.groupName="";
		Group group5 = new Group();
		Group[] groups = {group1,group2,group3,group4,group5};
			for(Group gr:groups) {
				if(gr.groupName==null) {continue;}else
					if(gr.groupName.equals("Java")) {
						System.out.println("các group có tên Java: "+ gr.groupName);
					}else {continue;};
		}
	}
}