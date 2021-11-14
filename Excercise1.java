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
		//question1
		System.out.println("question1:");
		if(account2.department == null) {
			System.out.println("nhan vien nay chua co phong ban");
		}else {
			System.out.println("nhan vien nay co phong ban: " + account2.department.departmentName);
		}
		
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
		
		
		//question2
		System.out.println("question2:");
		account2.groups = new Group[] {group1,group2};
		if(account2.groups == null ) {System.out.println("Nhân viên này chưa có group");}
		else{
		int countGroupInAccount = account2.groups.length;
		switch(countGroupInAccount){
		case 1: System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		break;
		case 2: System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
		break;
		case 3: System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
		break;
		default: System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
		break;
		}
	}
		
		
		//question3
		System.out.println("question3:");
		System.out.println(account2.department == null?"nhan vien nay chua co phong ban":"nhan vien nay co phong ban: " + account2.department.departmentName);
		
		//question4
		System.out.println("question4:");
		System.out.println(account1.position.positionName == "Dev"?"Đây là Developer":"Người này không phải là Developer");
		
		//Question 5
		System.out.println("question5:");
		group1.accounts = new Account[] {account1,account2,account3};
		
		int countAccountInGroup = group1.accounts.length;
		if(group1.accounts == null ) {System.out.println("Nhóm không có thành viên ");}
		else{
		
		switch(countAccountInGroup){
			case 1: System.out.println("Nhóm có một thành viên");
			break;
			case 2: System.out.println("Nhóm có hai thành viên");
			break;
			case 3: System.out.println("Nhóm có ba thành viên");
			break;
			default: System.out.println("Nhóm có nhiều thành viên hoặc không có thành viên");
			break;
			}
		};
		
		
		//Question 6
		System.out.println("question6:");
			account2.groups = new Group[] {group1,group2};
			if(account2.groups == null ) {System.out.println("Nhân viên này chưa có group");}
			else{
			int countGroupInAccount = account2.groups.length;
			switch(countGroupInAccount){
			case 1: System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
			case 2: System.out.println("Group của nhân viên này là Java Fresher, C# Fresher");
			break;
			case 3: System.out.println("Nhân viên này là người quan trọng, tham gia nhiều group");
			break;
			default: System.out.println("Nhân viên này là người hóng chuyện, tham gia tất cả các group");
			break;
			}
		}
			
			
		//question7
		System.out.println("question7:");
			String postionisDEV = account1.position.positionName;
			switch(postionisDEV){
			case "DEV": System.out.println("Đây là Developer");
			break;
			case "TEST": System.out.println("Đây là Tester");
			break;
			case "Scrum Master": System.out.println("Đây là Scrum Master");
			break;
			default: System.out.println("Đây là PM");
			break;
		}
		//question8
		System.out.println("question8:");
			Account [] accounts = {account1,account2,account3};
			for (Account account:accounts) {
			System.out.println("email: " + account.email + " \n"
			+ "FullName: " + account.fullName + " \n"
			+ account.department.departmentName);
		}
			//question9
			System.out.println("question9:");
			Department [] departments = {department1,department2,department3};
			for (Department i:departments) {
				System.out.println("departmentId: " + i.departmentId + " " +"\n"
						+ "departmentName: " + i.departmentName);
			}
			//question10
			System.out.println("question10:");
			Account [] accountfor= {account1,account2};
			for(int i=0;i<accountfor.length;i++) {
				System.out.println(
						"thông tin account thứ " + (i+1) + " là: "+" \n"
						+ "Email: " + accountfor[i].email + " \n"
						+ "Full name: " + accountfor[i].fullName + " \n"
						+ "Phòng ban: " + accountfor[i].department.departmentName
				);
			}
			//question11
			System.out.println("question11:");
			Department [] departmentsfor = {department1,department2};
			for(int i=0;i<departmentsfor.length;i++) {
				System.out.println(
				"thông tin department thứ " + (i+1) + " là: "+" \n"
				+ "Id: " + departmentsfor[i].departmentId + " \n"
				+ "Name: " + departmentsfor[i].departmentName);
			}
			//question12
			System.out.println("question12:");
			for(int i=0;i<2;i++) {
				System.out.println(
						"thông tin account thứ " + (i+1) + " là: "+" \n"
						+ "Email: " + accounts [i].email + " \n"
						+ "Full name: " + accounts[i].fullName + " \n"
						+ "Phòng ban: " + accounts[i].department.departmentName
				);
			}
			//question13
			System.out.println("question13:");
			for(int i=0;i<accounts.length;i++) {
				System.out.println(
				"thông tin account thứ " + (i+1) + " là: "+" \n"
						+ "Email: " + accountfor[i].email + " \n"
						+ "Full name: " + accountfor[i].fullName + " \n"
				);
			};
		}
	}
