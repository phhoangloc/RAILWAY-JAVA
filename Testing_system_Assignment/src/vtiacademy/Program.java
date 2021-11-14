package vtiacademy;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

import vti.academy.enums.PositionName;
import vti.academy.enums.Typename;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Department department1 = new Department();
		department1.departmentId=1;
		department1.departmentName="Marketing";
		System.out.println("departmetnid:" + department1.departmentId);
		System.out.println("position name:" + department1.departmentName);
		
		Department department2 = new Department();
		department2.departmentId=2;
		department2.departmentName="Nhan Su";
		System.out.println("departmetnid:" + department2.departmentId);
		System.out.println("position name:" + department2.departmentName);
		
		Department department3 = new Department();
		department3.departmentId=3;
		department3.departmentName="Bao Ve";
		System.out.println("departmetnid:" + department3.departmentId);
		System.out.println("position name:" + department3.departmentName);
		
		
		
		Position position1 = new Position();
		position1.positionId = 1;
		position1.positionName = PositionName.POSITION_SCRUM_MASTER.getPositionName();
		System.out.println("id:" + position1.positionId);
		System.out.println("position name:" + position1.positionName);
		
		Position position2 = new Position();
		position2.positionId = 2;
		position2.positionName = PositionName.POSITION_DEV.getPositionName();
		System.out.println("id:" + position2.positionId);
		System.out.println("position name:" + position2.positionName);
		
		Position position3 = new Position();
		position3.positionId = 2;
		position3.positionName = PositionName.POSITION_DEV.getPositionName();
		System.out.println("id:" + position3.positionId);
		System.out.println("position name:" + position3.positionName);
		
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
		System.out.println("id:" + account1.accountId);
		System.out.println("email:" + account1.email);
		System.out.println("username:" + account1.username);
		System.out.println("fullName:" + account1.fullName);
		System.out.println("department:" + account1.department.departmentName);
		System.out.println("position:" + account1.position.positionName);
		System.out.println("createDate:" + account1.createDate);
		
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
		System.out.println("id:" + account2.accountId);
		System.out.println("email:" + account2.email);
		System.out.println("username:" + account2.username);
		System.out.println("fullName:" + account2.fullName);
		System.out.println("department:" + account2.department.departmentName);
		System.out.println("position:" + account2.position.positionName);
		System.out.println("createDate:" + account2.createDate);
		
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
		System.out.println("id:" + account3.accountId);
		System.out.println("email:" + account3.email);
		System.out.println("username:" + account3.username);
		System.out.println("fullName:" + account3.fullName);
		System.out.println("department:" + account3.department.departmentName);
		System.out.println("position:" + account3.position.positionName);
		System.out.println("createDate:" + account3.createDate);
		
		Account account4 = new Account();
		account4.accountId=3;
		account4.email="Cnguyen@gmail.com";
		account4.username="Cnguyen";
		account4.fullName="Nguyen Van C";
		account4.department=department1;
		account4.position=position1 ;
		account4.createDate = new Date();
		
		Account account5 = new Account();
		account5.accountId=3;
		account5.email="Cnguyen@gmail.com";
		account5.username="Cnguyen";
		account5.fullName="Nguyen Van C";
		account5.department=department1;
		account5.position=position1 ;
		account5.createDate = new Date();
		//Group
		Group group1 = new Group();
		group1.groupId=1;
		group1.groupName="A";
		group1.creator=account1;
		String date_string4 = "12-10-2021";
		SimpleDateFormat formatter4 = new SimpleDateFormat("dd-MM-yyyy");
		Date date4 = formatter4.parse(date_string4);
		group1.createDate = date4;
		System.out.println("groupId:" + group1.groupId);
		System.out.println("groupName:" + group1.groupName);
		System.out.println("creatorId:" + group1.creator.fullName);
		System.out.println("createDate:" + group1.createDate);
		
		Group group2 = new Group();
		group2.groupId=2;
		group2.groupName="B";
		group2.creator=account3;
		String date_string5 = "11-2-2021";
		SimpleDateFormat formatter5 = new SimpleDateFormat("dd-MM-yyyy");
		Date date5 = formatter5.parse(date_string5);
		group2.createDate = date5;
		System.out.println("groupId:" + group2.groupId);
		System.out.println("groupName:" + group2.groupName);
		System.out.println("creatorId:" + group2.creator.fullName);
		System.out.println("createDate:" + group2.createDate);
		
		Group group3 = new Group();
		group3.groupId=3;
		group3.groupName="C";
		group3.creator=account2;
		String date_string6 = "11-8-2021";
		SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MM-yyyy");
		Date date6 = formatter6.parse(date_string6);
		group3.createDate = date6;
		System.out.println("groupId:" + group3.groupId);
		System.out.println("groupName:" + group3.groupName);
		System.out.println("creatorId:" + group3.creator.fullName);
		System.out.println("createDate:" + group3.createDate);
		
		//GroupAccount
		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.group = group1;
		groupAccount1.account = account1;
		String date_string7 = "13-4-2021";
		SimpleDateFormat formatter7 = new SimpleDateFormat("dd-MM-yyyy");
		Date date7 = formatter7.parse(date_string7);
		groupAccount1.joinDate = date7;
		System.out.println("groupName:" + groupAccount1.group.groupName);
		System.out.println("account:" + groupAccount1.account.fullName);
		System.out.println("joinDate:" + groupAccount1.joinDate );
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.group = group1;
		groupAccount2.account = account3;
		String date_string8 = "13-4-2020";
		SimpleDateFormat formatter8 = new SimpleDateFormat("dd-MM-yyyy");
		Date date8 = formatter8.parse(date_string8);
		groupAccount1.joinDate = date8;
		System.out.println("groupName:" + groupAccount2.group.groupName);
		System.out.println("account:" + groupAccount2.account.fullName);
		System.out.println("joinDate:" + groupAccount2.joinDate );
		
		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.group = group3;
		groupAccount3.account = account3;
		String date_string9 = "13-4-2020";
		SimpleDateFormat formatter9 = new SimpleDateFormat("dd-MM-yyyy");
		Date date9 = formatter9.parse(date_string9);
		groupAccount3.joinDate = date9;
		System.out.println("groupName:" + groupAccount3.group.groupName);
		System.out.println("account:" + groupAccount3.account.fullName);
		System.out.println("joinDate:" + groupAccount3.joinDate);
		
		GroupAccount groupAccount4 = new GroupAccount();
		groupAccount4.group = group2;
		groupAccount4.account = account4;
		groupAccount4.joinDate = new Date();
		
		GroupAccount groupAccount5 = new GroupAccount();
		groupAccount5.group = group2;
		groupAccount5.account = account5;
	
		groupAccount4.joinDate = new Date();
		
		//TypeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.typeId = 1;
		typeQuestion1.typeName = Typename.ESSAY.getTypename();
		System.out.println("question typeid:" + typeQuestion1.typeId);
		System.out.println("question typename:" + typeQuestion1.typeName);
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.typeId = 2;
		typeQuestion2.typeName = Typename.MULTIPLECHOISE.getTypename();
		System.out.println("question typeid:" + typeQuestion2.typeId);
		System.out.println("question typename:" + typeQuestion2.typeName);
		
		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.typeId = 3;
		typeQuestion3.typeName = Typename.MULTIPLECHOISE.getTypename();
		System.out.println("question typeid:" + typeQuestion3.typeId);
		System.out.println("question typename:" + typeQuestion3.typeName);
		
		//CategoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.categoryId = 1;
		categoryQuestion1.categoryName="Java";
		System.out.println("categoryid:" + categoryQuestion1.categoryId);
		System.out.println("categoryname:" + categoryQuestion1.categoryName);
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.categoryId = 2;
		categoryQuestion2.categoryName=".Net";
		System.out.println("categoryid:" + categoryQuestion2.categoryId);
		System.out.println("categoryname:" + categoryQuestion2.categoryName);
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.categoryId = 2;
		categoryQuestion3.categoryName=".Net";
		System.out.println("categoryid:" + categoryQuestion3.categoryId);
		System.out.println("categoryname:" + categoryQuestion3.categoryName);
		
		//Question
		Question question1 = new Question();
		question1.questionId = 1;
		question1.content="Java la gi";
		question1.category = categoryQuestion1;
		question1.type = typeQuestion1;
		question1.creator=account3;
		String date_string10 = "20-11-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter10 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date10 = formatter10.parse(date_string10);
		question1.createDate=date10;
		System.out.println("questionId:" + question1.questionId);
		System.out.println("question content:" + question1.content);
		System.out.println("categoryname:" + question1.category.categoryName);
		System.out.println("typename:" + question1.type.typeName);
		System.out.println("nguoi tao:" + question1.creator.fullName);
		System.out.println("ngay tao:" + question1.createDate);
		
		Question question2 = new Question();
		question2.questionId = 2;
		question2.content="Java dung vao viec gi";
		question2.category = categoryQuestion1;
		question2.type = typeQuestion1;
		question2.creator=account3;
		String date_string11 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter11 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date11 = formatter11.parse(date_string11);
		question2.createDate=date11;
		System.out.println("questionId:" + question2.questionId);
		System.out.println("question content:" + question2.content);
		System.out.println("categoryname:" + question2.category.categoryName);
		System.out.println("typename:" + question2.type.typeName);
		System.out.println("nguoi tao:" + question2.creator.fullName);
		System.out.println("ngay tao:" + question2.createDate);
		
		Question question3 = new Question();
		question3.questionId = 3;
		question3.content="xoa Java nhu the nao";
		question3.category = categoryQuestion3;
		question3.type = typeQuestion3;
		question3.creator=account1;
		String date_string12 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter12 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date12 = formatter12.parse(date_string12);
		question3.createDate=date12;
		System.out.println("questionId:" + question3.questionId);
		System.out.println("question content:" + question3.content);
		System.out.println("categoryname:" + question3.category.categoryName);
		System.out.println("typename:" + question3.type.typeName);
		System.out.println("nguoi tao:" + question3.creator.fullName);
		System.out.println("ngay tao:" + question3.createDate);
		
		//answer
		Answer answer1 = new Answer();
		answer1.answerId=1;
		answer1.content="khong biet";
		answer1.question = question1;
		answer1.isCorrect = true;
		System.out.println("answerId:" + answer1.answerId);
		System.out.println("answercontent:" + answer1.content);
		System.out.println("question:" + answer1.question.content);
		System.out.println("typename:" + answer1.isCorrect);
		
		Answer answer2 = new Answer();
		answer2.answerId=2;
		answer2.content="chua biet la gi";
		answer2.question = question2;
		answer2.isCorrect = true;
		System.out.println("answerId:" + answer2.answerId);
		System.out.println("answercontent:" + answer2.content);
		System.out.println("question:" + answer2.question.content);
		System.out.println("typename:" + answer2.isCorrect);
		
		Answer answer3 = new Answer();
		answer3.answerId=2;
		answer3.content="chua biet la gi";
		answer3.question = question3;
		answer3.isCorrect = false;
		System.out.println("answerId:" + answer3.answerId);
		System.out.println("answercontent:" + answer3.content);
		System.out.println("question:" + answer3.question.content);
		System.out.println("typename:" + answer3.isCorrect);
		
		Exam exam1 = new Exam();
		exam1.examId=1;
		exam1.code="THUOQN";
		exam1.title="bai thi JAVA";
		exam1.category = categoryQuestion1;
		exam1.creator = account2;
		String date_string13 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter13 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date13 = formatter13.parse(date_string13);
		exam1.createDate=date13;
		System.out.println("examId:" + exam1.examId);
		System.out.println("code:" + exam1.code);
		System.out.println("title:" + exam1.title);
		System.out.println("categoryQuestion:" + exam1.category.categoryId);
		System.out.println("nguoi tao:" + exam1.creator.fullName);
		
		Exam exam2 = new Exam();
		exam2.examId=2;
		exam2.code="THTOQN";
		exam2.title="bai thi EXCEL";
		exam2.category = categoryQuestion3;
		exam2.creator = account2;
		String date_string14 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter14 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date14 = formatter14.parse(date_string14);
		exam2.createDate=date14;
		System.out.println("examId:" + exam2.examId);
		System.out.println("code:" + exam2.code);
		System.out.println("title:" + exam2.title);
		System.out.println("categoryQuestion:" + exam2.category.categoryId);
		System.out.println("nguoi tao:" + exam2.creator.fullName);
		
		Exam exam3 = new Exam();
		exam3.examId=3;
		exam3.code="THYOQN";
		exam3.title="bai thi EXCEL";
		exam3.category = categoryQuestion3;
		exam3.creator = account3;
		String date_string15 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter15 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date15 = formatter15.parse(date_string15);
		exam3.createDate=date15;
		System.out.println("examId:" + exam3.examId);
		System.out.println("code:" + exam3.code);
		System.out.println("title:" + exam3.title);
		System.out.println("categoryQuestion:" + exam3.category.categoryId);
		System.out.println("nguoi tao:" + exam3.creator.fullName);
		
		ExamQuestion examQuestion1= new ExamQuestion();
		examQuestion1.exam = exam1;
		examQuestion1.question = question1;
		System.out.println("examId:" + examQuestion1.exam.examId);
		System.out.println("questionId:" + examQuestion1.question.questionId);
		
		ExamQuestion examQuestion2= new ExamQuestion();
		examQuestion2.exam = exam3;
		examQuestion2.question = question3;
		System.out.println("examId:" + examQuestion2.exam.examId);
		System.out.println("questionId:" + examQuestion2.question.questionId);
		
		ExamQuestion examQuestion3= new ExamQuestion();
		examQuestion3.exam = exam1;
		examQuestion3.question = question3;
		System.out.println("examId:" + examQuestion3.exam.examId);
		System.out.println("questionId:" + examQuestion3.question.questionId);
	}
}
