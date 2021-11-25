package vtiacademy;

import java.text.SimpleDateFormat;
import java.util.Date;

import vtiacademy.enums.PositionName;

import java.text.ParseException;

public class Excercise1 {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
	//Question1
		Department department1 = new Department();
		department1.departmentId=1;
		department1.departmentName="Marketing";
	
		
		Department department2 = new Department();
		department2.departmentId=2;
		department2.departmentName="Nhan Su";
		
		
		Department department3 = new Department();
		department3.departmentId=3;
		department3.departmentName="Bao Ve";
		
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = PositionName.POSITION_SCRUM_MASTER.getPositionName();
		
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = PositionName.POSITION_DEV.getPositionName();
		
		Position position3 = new Position();
		position3.positionId = 2;
		position3.positionName = PositionName.POSITION_DEV.getPositionName();
		
		
		//Account
		Account account1 = new Account();
		account1.accountId=1;
		account1.email="Anguyen@gmail.com";
		account1.username="Anguyen";
		account1.fullName="Nguyen Van A";
		account1.department=department1;
		account1.position=position1 ;
		String date_string1 = "20-11-1992";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date1 = formatter.parse(date_string1);
		account1.createDate = date1;
		
		Account account2 = new Account();
		account2.accountId=2;
		account2.email="Bnguyen@gmail.com";
		account2.username="Bnguyen";
		account2.fullName="Nguyen Van B";
		account2.department=department1;
		account2.position=position1 ;
		String date_string2 = "20-11-1994";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date2 = formatter2.parse(date_string2);
		account2.createDate = date2;
		
		
		Account account3 = new Account();
		account3.accountId=3;
		account3.email="Cnguyen@gmail.com";
		account3.username="Cnguyen";
		account3.fullName="Nguyen Van C";
		account3.department=department1;
		account3.position=position1 ;
		String date_string3 = "20-11-1992";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter3 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date3 = formatter3.parse(date_string3);
		account3.createDate = date3;
		
		Group group1 = new Group();
		group1.groupId=1;
		group1.groupName="A";
		group1.creator=account1;
		String date_string4 = "12-10-2021";
		SimpleDateFormat formatter4 = new SimpleDateFormat("dd-MM-yyyy");
		Date date4 = formatter4.parse(date_string4);
		group1.createDate = date4;
		
		
		Group group2 = new Group();
		group2.groupId=2;
		group2.groupName="B";
		group2.creator=account3;
		String date_string5 = "11-2-2021";
		SimpleDateFormat formatter5 = new SimpleDateFormat("dd-MM-yyyy");
		Date date5 = formatter5.parse(date_string5);
		group2.createDate = date5;
		
		
		Group group3 = new Group();
		group3.groupId=3;
		group3.groupName="C";
		group3.creator=account2;
		String date_string6 = "11-8-2021";
		SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MM-yyyy");
		Date date6 = formatter6.parse(date_string6);
		group3.createDate = date6;
		
		account2.groups = new Group[] {group1,group2};
		
		group1.accounts = new Account[] {account1,account2,account3};
		
		Account [] accounts = {account1,account2,account3};
		
		Department [] departments = {department1,department2,department3};
		
		Group[] groups = {group1,group2,group3};
		
		question1(account2);
		question2(account2);
		question3(account2);
		question4(account1);
		question5(groups);
		question6(account2);
		question7(account1);
		question8(accounts);
		question9(departments);
		question10(accounts);
		question11(departments);
		question12(departments);
		question13(accounts);
		question14(accounts);
		question15();
		question16_10while(accounts);
		question16_11while(departments);
		question16_12while(departments);
		question16_13while(accounts);
		question16_14while(accounts);
		question16_15while();
		question17_10dowhile(accounts);
		question17_11dowhile(departments);
		question17_12dowhile(departments);
		question17_13dowhile(accounts);
		question17_14dowhile(accounts);
		question17_15dowhile();
	}
		//question1
//		Kiểm tra account thứ 2
//		Nếu không có phòng ban (tức là department == null) thì sẽ in ra text 
//		"Nhân viên này chưa có phòng ban"
//		Nếu không thì sẽ in ra text "Phòng ban của nhân viên này là …"
		public static void question1(Account account2) {
			System.out.println("question1");
		if(account2.department == null) {
			System.out.println("nhan vien nay chua co phong ban");
		}else {
			System.out.println("nhan vien nay co phong ban: " + account2.department.departmentName);
		}
	}
		
		//question2

//		Kiểm tra account thứ 2
//		Nếu không có group thì sẽ in ra text "Nhân viên này chưa có group"
//		Nếu có mặt trong 1 hoặc 2 group thì sẽ in ra text "Group của nhân viên 
//		này là Java Fresher, C# Fresher"
//		Nếu có mặt trong 3 Group thì sẽ in ra text "Nhân viên này là người 
//		quan trọng, tham gia nhiều group"
//		Nếu có mặt trong 4 group trở lên thì sẽ in ra text "Nhân viên này là 
//		người hóng chuyện, tham gia tất cả các group"
		
		public static void question2(Account account2) {
			System.out.println("question2");
		if(account2.groups == null ) {System.out.println("Nhân viên n�?y chưa có group");}
		else{
		int countGroupInAccount = account2.groups.length;
		if(countGroupInAccount == 0 ) {System.out.println("Nhân viên n�?y chưa có group");}
		if(countGroupInAccount == 1 || countGroupInAccount == 2) {System.out.println("Group của nhân viên n�?y là Java Fresher, C# Fresher");}
		if(countGroupInAccount == 3 ) {System.out.println("Nhân viên n�?y là người quan trọng, tham gia nhiều group");}
		if(countGroupInAccount == 4 ) { System.out.println("Nhân viên n�?y là người hóng chuyện, tham gia tất cả các group");}
		};
	}
		
//		Question 3:
//		Sử dụng toán tử ternary để làm Question 1
		public static void question3(Account account2) {
			System.out.println("question3");
		System.out.println(account2.department == null?"nhan vien nay chua co phong ban":"nhan vien nay co phong ban: " + account2.department.departmentName);
		}
		//question4
//		Sử dụng toán tử ternary để làm yêu cầu sau:
//		Kiểm tra Position của account thứ 1
//		Nếu Position = Dev thì in ra text "Đây là Developer"
//		Nếu không phải thì in ra text "Người này không phải là Developer
		public static void question4(Account accounts) {
			System.out.println("question4");
		System.out.println(accounts.position.positionName == "Dev"?"Đây là Developer":"Người n�?y không phải là Developer");
		}

		//Question 5
//		Lấy ra số lượng account trong nhóm thứ 1 và in ra theo format sau:
//			Nếu số lượng account = 1 thì in ra "Nhóm có một thành viên"
//			Nếu số lượng account = 2 thì in ra "Nhóm có hai thành viên"
//			Nếu số lượng account = 3 thì in ra "Nhóm có ba thành viên"
//			Còn lại in ra "Nhóm có nhiều thành viên
	
	public static void question5(Group[] groups) {
		System.out.println("question5");
		if(groups==null){System.out.println("nhóm không có thành viên nào");}
		else {
		int num = groups.length;
		switch(num) {
		case 1: System.out.println("nhóm có một thành viên ");break;
		case 2: System.out.println("nhóm có hai thành viên ");break;
		case 3: System.out.println("nhóm có ba thành viên ");break;
		default: System.out.println("nhóm có nhiều thành viên");break;
			}
		}
	}
//		Question 6: 
//		Sử dụng switch case để làm lại Question 2
	public static void question6(Account account2) {
		System.out.println("question6");
		int num = account2.groups.length;
		switch(num) {
		case 0: System.out.println("Nhân viên n�?y chưa có group");break;
		case 1: System.out.println("Group của nhân viên n�?y là Java Fresher, C# Fresher");break;
		case 2: System.out.println("Group của nhân viên n�?y là Java Fresher, C# Fresher");break;
		case 3: System.out.println("Nhân viên n�?y là người quan trọng, tham gia nhiều group");break;
		default: System.out.println("Nhân viên n�?y là người hóng chuyện, tham gia tất cả các group");break;
	}
	};
	
//	Question 7: 
//		Sử dụng switch case để làm lại Question 4
	public static void question7(Account accounts) {
		System.out.println("question7:");
		String postionisDEV = accounts.position.positionName;
		switch(postionisDEV){
		case "Dev": System.out.println("Đây là Developer");
		break;
		case "Test": System.out.println("Đây là Tester");
		break;
		case "Scrum Master": System.out.println("Đây là Scrum Master");
		break;
		default: System.out.println("Đây là PM");
		break;
		}
	}

	//question8
	//In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ
		public static void question8(Account[] accounts) {
			System.out.println("question8:");
			for(Account acc:accounts) {
				System.out.println("người thứ nhất" + "Email: " + acc.email+" Họ và tên: "+ acc.fullName + " tên phòng ban: " + acc.department.departmentName );
			}
		}
//			Question 9: 
//				In ra thông tin các phòng ban bao gồm: id và name
			public static void question9(Department [] ii) {
			for (Department i:ii) {
				System.out.println("departmentId: " + i.departmentId + " " +"\n"
						+ "departmentName: " + i.departmentName);
			}
			}
			//question10
//			In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của 
//			họ theo định dạng như sau:
//			Thông tin account thứ 1 là: 
//			Email: NguyenVanA@gmail.com
//			Full name: Nguyễn Văn A
//			Phòng ban: Sale
//			Thông tin account thứ 2 là: 
//			Email: NguyenVanB@gmail.com
//			Full name: Nguyễn Văn B
//			Phòng ban: Marketting
			public static void question10(Account[] abc) {
				for(int i=0;i<abc.length;i++) {
					System.out.println(
							"thông tin account thứ " + (i+1) + " là: "+" \n"
							+ "Email: " + abc[i].email + " \n"
							+ "Full name: " + abc[i].fullName + " \n"
							+ "Phòng ban: " + abc[i].department.departmentName
					);
				}
			}
			
			//question11
//			In ra thông tin các phòng ban bao gồm: id và name theo định dạng sau: 
//				Thông tin department thứ 1 là: 
//				Id: 1
//				Name: Sale
//				Thông tin department thứ 2 là: 
//				Id: 2
//				Name: Marketing
			public static void question11(Department[] abc) {
				for(int i=0;i<abc.length;i++) {
					System.out.println(
					"thông tin department thứ " + (i+1) + " là: "+" \n"
					+ "Id: " + abc[i].departmentId + " \n"
					+ "Name: " + abc[i].departmentName);
				}
			}
		
			//question12
//			Chỉ in ra thông tin 2 department đầu tiên theo định dạng như Question 10
			public static void question12(Department[] abc){
				for(int i=0;i<2;i++) {
					System.out.println(
							"thông tin department thứ " + (i+1) + " là: "+" \n"
							+ "department id "+ abc[i].departmentId + " \n"
							+ "tên department "+ abc[i].departmentName
					);
				}
			}
			
			//question13
//			In ra thông tin tất cả các account ngoại trừ account thứ 2
			public static void question13(Account[] abc) {
				for(int i=0;i<abc.length;i++) {
					if(i==1) {i = 2;}
					System.out.println(
					"thông tin account thứ " + (i+1) + " là: "+" \n"
							+ "Email: " + abc[i].email + " \n"
							+ "Full name: " + abc[i].fullName + " \n"
					);
				};
			}
			
			//question14
//			In ra thông tin tất cả các account có id < 4
			public static void question14(Account[] abc) {
			for(int i=0;i<abc.length;i++) {
				if(abc[i].accountId<4) {
					System.out.println(
							"thông tin account thứ " + (i+1) + " là: "+" \n"
							+"email: " + abc[i].email +" \n"
							+"fullname: " + abc[i].fullName + " \n"
							+"phòng: " + abc[i].department.departmentName +" \n"
							+"chức vụ: " + abc[i].position.positionName +" \n"
					);	
				}
			}
		}
			//question15
//			In ra các số chẵn nhỏ hơn hoặc bằng 20
			public static void question15() {
			for(int i=0;i<=20;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}

//			//question16
//			Làm lại các Question ở phần FOR bằng cách sử dụng WHILE kết hợp với lệnh break, continue
//			//question16-10
//			//In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng
//			System.out.println("làm lại question FOR bằng While:");
			public static void question16_10while(Account[] abc) {
				System.out.println("question16_10while");
				int i=0;
				while(i<abc.length) {
					System.out.println(
							"thông tin account thứ " + (i+1) + " là: "+" \n"
							+ "Email: " + abc[i].email + " \n"
							+ "Full name: " + abc[i].fullName + " \n"
							+ "Phòng ban: " + abc[i].department.departmentName
					);
				i++;
				};
			}

//			//Question 16-11:
//				//In ra thông tin các phòng ban bao gồm: id và name theo định dạng
			public static void question16_11while(Department[] abc) {
				System.out.println("question16_11while");
				int j=0;
			while(j<abc.length) {
				System.out.println(
				"thông tin department thứ " + (j+1) + " là: "+" \n"
				+ "Id: " + abc[j].departmentId + " \n"
				+ "Name: " + abc[j].departmentName);
				j++;
			}
		}
			//Question 16-12:
			//Chỉ in ra thông tin 2 department đầu tiên theo định dạng  như Question 10
			public static void question16_12while(Department[] abc) {
				System.out.println("question16_12while");
			System.out.println("question 12 - While:");
			int i=0;
				while(i<2) {
				System.out.println(
					"thông tin Department thứ " + (i+1) + " là: "+" \n"
						+ "Department ID: " + abc[i].departmentId + " \n"
						+ "Department name: " + abc[i].departmentName + " \n"
				);
				i++;
			}
		}
//			//Question 16-13:
//				//In ra thông tin tất cả các account ngoại trừ account thứ 2
//			System.out.println("question 13 - While:");
			public static void question16_13while(Account[] abc) {
				System.out.println("question16_13while");
			int i=0;
			while(i<abc.length) {
				if(i == 1) {i=2;}
				System.out.println(
					"thông tin account thứ " + (i+1) + " là: "+" \n"
					+ "Email: " + abc [i].email + " \n"
					+ "Full name: " + abc[i].fullName + " \n"
					+ "Phòng ban: " + abc[i].department.departmentName
				);
				i++;
			}
		}
//			//Question 16-14:
//			//In ra thông tin tất cả các account có id < 4;
			public static void question16_14while(Account[] abc) {
				System.out.println("question16_14while");
			int i=0;
			while(i < abc.length) {
				if(abc[i].accountId<4) {
					System.out.println(
							"thông tin account thứ " + (i+1) + " là: "+" \n"
							+"email: " + abc[i].email +" \n"
							+"fullname: " + abc[i].fullName + " \n"
							+"phòng: " + abc[i].department.departmentName +" \n"
							+"chức vụ: " + abc[i].position.positionName +" \n"
					);	
				};
				i++;
			}
			}
//			//Question 16-15:
//			//In ra các số chẵn nhỏ hơn hoặc bằng 20
			public static void question16_15while() {
			System.out.println("question16_15while");
			int i=0;
			while(i <= 20) {
				if(i%2==0) {
					System.out.println(i);
				};
			i++;
			}
		}
//			//question17
//			//question17-10
//			//In ra thông tin các account bao gồm: Email, FullName và tên phòng ban của họ theo định dạng
//			System.out.println("làm lại question FOR bằng DoWhile:");
//			System.out.println("question 10 - DoWhile:");
			public static void question17_10dowhile(Account[] abc) {
				System.out.println("question17_10dowhile");
			int i= 0 ;
			 do{
				System.out.println(
						"thông tin account thứ " + (i+1) + " là: "+" \n"
						+ "Email: " + abc[i].email + " \n"
						+ "Full name: " + abc[i].fullName + " \n"
						+ "Phòng ban: " + abc[i].department.departmentName
				);
				i++;
			} while(i<abc.length);
			}
//			//Question 17-11:
//				//In ra thông tin các phòng ban bao gồm: id và name theo định dạng
			public static void question17_11dowhile(Department[] abc) {
				System.out.println("question17_11dowhile");
			int i= 0 ;
			do {
				System.out.println(
				"thông tin department thứ " + (i+1) + " là: "+" \n"
				+ "Id: " + abc[i].departmentId + " \n"
				+ "Name: " + abc[i].departmentName);
				i++;
			}
			while(i<abc.length);
		}
//			
//			//Question 17-12:
//			//Chỉ in ra thông tin 2 department đầu tiên theo định dạng  như Question 10
//			
			public static void question17_12dowhile(Department[] abc) {
			System.out.println("question17_12dowhile");
			int i= 0 ;
			do{
				System.out.println(
						"thông tin account thứ " + (i+1) + " là: "+" \n"
						+ "Id: " + abc[i].departmentId + " \n"
						+ "Name: " + abc[i].departmentName
				);
				i++;
			}
			while(i<2) ;
		}
//			//Question 17-13:
//				//In ra thông tin tất cả các account ngoại trừ account thứ 2
			public static void question17_13dowhile(Account[] abc) {
				System.out.println("question17_13dowhile");
			int i=0;
			do {
				if(i == 1) {i=2;}
				System.out.println(
					"thông tin account thứ " + (i+1) + " là: "+" \n"
					+ "Email: " + abc [i].email + " \n"
				+ "Full name: " + abc[i].fullName + " \n"
					+ "Phòng ban: " + abc[i].department.departmentName
				);
			i++;
			}while(i<abc.length); 
		}
			
//			//Question 17-14:
//			//In ra thông tin tất cả các account có id < 4;
			public static void question17_14dowhile(Account[] abc) {
				System.out.println("question17_14dowhile");
			int i=0;
			do {
				if(abc[i].accountId<4){
					System.out.println(
							"thông tin account thứ " + (i+1) + " là: "+" \n"
							+"email: " + abc[i].email +" \n"
							+"fullname: " + abc[i].fullName + " \n"
							+"phòng: " + abc[i].department.departmentName +" \n"
							+"chức vụ: " + abc[i].position.positionName +" \n"
					);	
				};
				i++;
			}while(i < abc.length) ;
		}
		
//			//Question 17-15:
//			//In ra các số chẵn nhỏ hơn hoặc bằng 20
			public static void question17_15dowhile() {
				System.out.println("question17_15dowhile");
			int i=0;
			do{
				if(i%2==0) {
					System.out.println(i);
				};
				i++;
		}while(i <= 20);
	}
}