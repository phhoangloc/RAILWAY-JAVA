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
//		Ki???m tra account th??? 2
//		N???u kh??ng c?? ph??ng ban (t???c l?? department == null) th?? s??? in ra text 
//		"Nh??n vi??n n??y ch??a c?? ph??ng ban"
//		N???u kh??ng th?? s??? in ra text "Ph??ng ban c???a nh??n vi??n n??y l?? ???"
		public static void question1(Account account2) {
			System.out.println("question1");
		if(account2.department == null) {
			System.out.println("nhan vien nay chua co phong ban");
		}else {
			System.out.println("nhan vien nay co phong ban: " + account2.department.departmentName);
		}
	}
		
		//question2

//		Ki???m tra account th??? 2
//		N???u kh??ng c?? group th?? s??? in ra text "Nh??n vi??n n??y ch??a c?? group"
//		N???u c?? m???t trong 1 ho???c 2 group th?? s??? in ra text "Group c???a nh??n vi??n 
//		n??y l?? Java Fresher, C# Fresher"
//		N???u c?? m???t trong 3 Group th?? s??? in ra text "Nh??n vi??n n??y l?? ng?????i 
//		quan tr???ng, tham gia nhi???u group"
//		N???u c?? m???t trong 4 group tr??? l??n th?? s??? in ra text "Nh??n vi??n n??y l?? 
//		ng?????i h??ng chuy???n, tham gia t???t c??? c??c group"
		
		public static void question2(Account account2) {
			System.out.println("question2");
		if(account2.groups == null ) {System.out.println("Nh??n vi??n n????y ch??a c?? group");}
		else{
		int countGroupInAccount = account2.groups.length;
		if(countGroupInAccount == 0 ) {System.out.println("Nh??n vi??n n????y ch??a c?? group");}
		if(countGroupInAccount == 1 || countGroupInAccount == 2) {System.out.println("Group c???a nh??n vi??n n????y l?? Java Fresher, C# Fresher");}
		if(countGroupInAccount == 3 ) {System.out.println("Nh??n vi??n n????y l?? ng?????i quan tr???ng, tham gia nhi???u group");}
		if(countGroupInAccount == 4 ) { System.out.println("Nh??n vi??n n????y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");}
		};
	}
		
//		Question 3:
//		S??? d???ng to??n t??? ternary ????? l??m Question 1
		public static void question3(Account account2) {
			System.out.println("question3");
		System.out.println(account2.department == null?"nhan vien nay chua co phong ban":"nhan vien nay co phong ban: " + account2.department.departmentName);
		}
		//question4
//		S??? d???ng to??n t??? ternary ????? l??m y??u c???u sau:
//		Ki???m tra Position c???a account th??? 1
//		N???u Position = Dev th?? in ra text "????y l?? Developer"
//		N???u kh??ng ph???i th?? in ra text "Ng?????i n??y kh??ng ph???i l?? Developer
		public static void question4(Account accounts) {
			System.out.println("question4");
		System.out.println(accounts.position.positionName == "Dev"?"????y l?? Developer":"Ng?????i n????y kh??ng ph???i l?? Developer");
		}

		//Question 5
//		L???y ra s??? l?????ng account trong nh??m th??? 1 v?? in ra theo format sau:
//			N???u s??? l?????ng account = 1 th?? in ra "Nh??m c?? m???t th??nh vi??n"
//			N???u s??? l?????ng account = 2 th?? in ra "Nh??m c?? hai th??nh vi??n"
//			N???u s??? l?????ng account = 3 th?? in ra "Nh??m c?? ba th??nh vi??n"
//			C??n l???i in ra "Nh??m c?? nhi???u th??nh vi??n
	
	public static void question5(Group[] groups) {
		System.out.println("question5");
		if(groups==null){System.out.println("nh??m kh??ng c?? th??nh vi??n n??o");}
		else {
		int num = groups.length;
		switch(num) {
		case 1: System.out.println("nh??m c?? m???t th??nh vi??n ");break;
		case 2: System.out.println("nh??m c?? hai th??nh vi??n ");break;
		case 3: System.out.println("nh??m c?? ba th??nh vi??n ");break;
		default: System.out.println("nh??m c?? nhi???u th??nh vi??n");break;
			}
		}
	}
//		Question 6: 
//		S??? d???ng switch case ????? l??m l???i Question 2
	public static void question6(Account account2) {
		System.out.println("question6");
		int num = account2.groups.length;
		switch(num) {
		case 0: System.out.println("Nh??n vi??n n????y ch??a c?? group");break;
		case 1: System.out.println("Group c???a nh??n vi??n n????y l?? Java Fresher, C# Fresher");break;
		case 2: System.out.println("Group c???a nh??n vi??n n????y l?? Java Fresher, C# Fresher");break;
		case 3: System.out.println("Nh??n vi??n n????y l?? ng?????i quan tr???ng, tham gia nhi???u group");break;
		default: System.out.println("Nh??n vi??n n????y l?? ng?????i h??ng chuy???n, tham gia t???t c??? c??c group");break;
	}
	};
	
//	Question 7: 
//		S??? d???ng switch case ????? l??m l???i Question 4
	public static void question7(Account accounts) {
		System.out.println("question7:");
		String postionisDEV = accounts.position.positionName;
		switch(postionisDEV){
		case "Dev": System.out.println("????y l?? Developer");
		break;
		case "Test": System.out.println("????y l?? Tester");
		break;
		case "Scrum Master": System.out.println("????y l?? Scrum Master");
		break;
		default: System.out.println("????y l?? PM");
		break;
		}
	}

	//question8
	//In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a h???
		public static void question8(Account[] accounts) {
			System.out.println("question8:");
			for(Account acc:accounts) {
				System.out.println("ng?????i th??? nh???t" + "Email: " + acc.email+" H??? v?? t??n: "+ acc.fullName + " t??n ph??ng ban: " + acc.department.departmentName );
			}
		}
//			Question 9: 
//				In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name
			public static void question9(Department [] ii) {
			for (Department i:ii) {
				System.out.println("departmentId: " + i.departmentId + " " +"\n"
						+ "departmentName: " + i.departmentName);
			}
			}
			//question10
//			In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a 
//			h??? theo ?????nh d???ng nh?? sau:
//			Th??ng tin account th??? 1 l??: 
//			Email: NguyenVanA@gmail.com
//			Full name: Nguy???n V??n A
//			Ph??ng ban: Sale
//			Th??ng tin account th??? 2 l??: 
//			Email: NguyenVanB@gmail.com
//			Full name: Nguy???n V??n B
//			Ph??ng ban: Marketting
			public static void question10(Account[] abc) {
				for(int i=0;i<abc.length;i++) {
					System.out.println(
							"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
							+ "Email: " + abc[i].email + " \n"
							+ "Full name: " + abc[i].fullName + " \n"
							+ "Ph??ng ban: " + abc[i].department.departmentName
					);
				}
			}
			
			//question11
//			In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name theo ?????nh d???ng sau: 
//				Th??ng tin department th??? 1 l??: 
//				Id: 1
//				Name: Sale
//				Th??ng tin department th??? 2 l??: 
//				Id: 2
//				Name: Marketing
			public static void question11(Department[] abc) {
				for(int i=0;i<abc.length;i++) {
					System.out.println(
					"th??ng tin department th??? " + (i+1) + " l??: "+" \n"
					+ "Id: " + abc[i].departmentId + " \n"
					+ "Name: " + abc[i].departmentName);
				}
			}
		
			//question12
//			Ch??? in ra th??ng tin 2 department ?????u ti??n theo ?????nh d???ng nh?? Question 10
			public static void question12(Department[] abc){
				for(int i=0;i<2;i++) {
					System.out.println(
							"th??ng tin department th??? " + (i+1) + " l??: "+" \n"
							+ "department id "+ abc[i].departmentId + " \n"
							+ "t??n department "+ abc[i].departmentName
					);
				}
			}
			
			//question13
//			In ra th??ng tin t???t c??? c??c account ngo???i tr??? account th??? 2
			public static void question13(Account[] abc) {
				for(int i=0;i<abc.length;i++) {
					if(i==1) {i = 2;}
					System.out.println(
					"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
							+ "Email: " + abc[i].email + " \n"
							+ "Full name: " + abc[i].fullName + " \n"
					);
				};
			}
			
			//question14
//			In ra th??ng tin t???t c??? c??c account c?? id < 4
			public static void question14(Account[] abc) {
			for(int i=0;i<abc.length;i++) {
				if(abc[i].accountId<4) {
					System.out.println(
							"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
							+"email: " + abc[i].email +" \n"
							+"fullname: " + abc[i].fullName + " \n"
							+"ph??ng: " + abc[i].department.departmentName +" \n"
							+"ch???c v???: " + abc[i].position.positionName +" \n"
					);	
				}
			}
		}
			//question15
//			In ra c??c s??? ch???n nh??? h??n ho???c b???ng 20
			public static void question15() {
			for(int i=0;i<=20;i++) {
				if(i%2==0) {
					System.out.println(i);
				}
			}
		}

//			//question16
//			L??m l???i c??c Question ??? ph???n FOR b???ng c??ch s??? d???ng WHILE k???t h???p v???i l???nh break, continue
//			//question16-10
//			//In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a h??? theo ?????nh d???ng
//			System.out.println("l??m l???i question FOR b???ng While:");
			public static void question16_10while(Account[] abc) {
				System.out.println("question16_10while");
				int i=0;
				while(i<abc.length) {
					System.out.println(
							"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
							+ "Email: " + abc[i].email + " \n"
							+ "Full name: " + abc[i].fullName + " \n"
							+ "Ph??ng ban: " + abc[i].department.departmentName
					);
				i++;
				};
			}

//			//Question 16-11:
//				//In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name theo ?????nh d???ng
			public static void question16_11while(Department[] abc) {
				System.out.println("question16_11while");
				int j=0;
			while(j<abc.length) {
				System.out.println(
				"th??ng tin department th??? " + (j+1) + " l??: "+" \n"
				+ "Id: " + abc[j].departmentId + " \n"
				+ "Name: " + abc[j].departmentName);
				j++;
			}
		}
			//Question 16-12:
			//Ch??? in ra th??ng tin 2 department ?????u ti??n theo ?????nh d???ng  nh?? Question 10
			public static void question16_12while(Department[] abc) {
				System.out.println("question16_12while");
			System.out.println("question 12 - While:");
			int i=0;
				while(i<2) {
				System.out.println(
					"th??ng tin Department th??? " + (i+1) + " l??: "+" \n"
						+ "Department ID: " + abc[i].departmentId + " \n"
						+ "Department name: " + abc[i].departmentName + " \n"
				);
				i++;
			}
		}
//			//Question 16-13:
//				//In ra th??ng tin t???t c??? c??c account ngo???i tr??? account th??? 2
//			System.out.println("question 13 - While:");
			public static void question16_13while(Account[] abc) {
				System.out.println("question16_13while");
			int i=0;
			while(i<abc.length) {
				if(i == 1) {i=2;}
				System.out.println(
					"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
					+ "Email: " + abc [i].email + " \n"
					+ "Full name: " + abc[i].fullName + " \n"
					+ "Ph??ng ban: " + abc[i].department.departmentName
				);
				i++;
			}
		}
//			//Question 16-14:
//			//In ra th??ng tin t???t c??? c??c account c?? id < 4;
			public static void question16_14while(Account[] abc) {
				System.out.println("question16_14while");
			int i=0;
			while(i < abc.length) {
				if(abc[i].accountId<4) {
					System.out.println(
							"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
							+"email: " + abc[i].email +" \n"
							+"fullname: " + abc[i].fullName + " \n"
							+"ph??ng: " + abc[i].department.departmentName +" \n"
							+"ch???c v???: " + abc[i].position.positionName +" \n"
					);	
				};
				i++;
			}
			}
//			//Question 16-15:
//			//In ra c??c s??? ch???n nh??? h??n ho???c b???ng 20
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
//			//In ra th??ng tin c??c account bao g???m: Email, FullName v?? t??n ph??ng ban c???a h??? theo ?????nh d???ng
//			System.out.println("l??m l???i question FOR b???ng DoWhile:");
//			System.out.println("question 10 - DoWhile:");
			public static void question17_10dowhile(Account[] abc) {
				System.out.println("question17_10dowhile");
			int i= 0 ;
			 do{
				System.out.println(
						"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
						+ "Email: " + abc[i].email + " \n"
						+ "Full name: " + abc[i].fullName + " \n"
						+ "Ph??ng ban: " + abc[i].department.departmentName
				);
				i++;
			} while(i<abc.length);
			}
//			//Question 17-11:
//				//In ra th??ng tin c??c ph??ng ban bao g???m: id v?? name theo ?????nh d???ng
			public static void question17_11dowhile(Department[] abc) {
				System.out.println("question17_11dowhile");
			int i= 0 ;
			do {
				System.out.println(
				"th??ng tin department th??? " + (i+1) + " l??: "+" \n"
				+ "Id: " + abc[i].departmentId + " \n"
				+ "Name: " + abc[i].departmentName);
				i++;
			}
			while(i<abc.length);
		}
//			
//			//Question 17-12:
//			//Ch??? in ra th??ng tin 2 department ?????u ti??n theo ?????nh d???ng  nh?? Question 10
//			
			public static void question17_12dowhile(Department[] abc) {
			System.out.println("question17_12dowhile");
			int i= 0 ;
			do{
				System.out.println(
						"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
						+ "Id: " + abc[i].departmentId + " \n"
						+ "Name: " + abc[i].departmentName
				);
				i++;
			}
			while(i<2) ;
		}
//			//Question 17-13:
//				//In ra th??ng tin t???t c??? c??c account ngo???i tr??? account th??? 2
			public static void question17_13dowhile(Account[] abc) {
				System.out.println("question17_13dowhile");
			int i=0;
			do {
				if(i == 1) {i=2;}
				System.out.println(
					"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
					+ "Email: " + abc [i].email + " \n"
				+ "Full name: " + abc[i].fullName + " \n"
					+ "Ph??ng ban: " + abc[i].department.departmentName
				);
			i++;
			}while(i<abc.length); 
		}
			
//			//Question 17-14:
//			//In ra th??ng tin t???t c??? c??c account c?? id < 4;
			public static void question17_14dowhile(Account[] abc) {
				System.out.println("question17_14dowhile");
			int i=0;
			do {
				if(abc[i].accountId<4){
					System.out.println(
							"th??ng tin account th??? " + (i+1) + " l??: "+" \n"
							+"email: " + abc[i].email +" \n"
							+"fullname: " + abc[i].fullName + " \n"
							+"ph??ng: " + abc[i].department.departmentName +" \n"
							+"ch???c v???: " + abc[i].position.positionName +" \n"
					);	
				};
				i++;
			}while(i < abc.length) ;
		}
		
//			//Question 17-15:
//			//In ra c??c s??? ch???n nh??? h??n ho???c b???ng 20
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