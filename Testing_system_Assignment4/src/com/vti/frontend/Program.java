package com.vti.frontend;

import java.text.ParseException;

import java.text.SimpleDateFormat;

import java.util.Date;

import com.vti.entity.Account;
import com.vti.entity.Answer;
import com.vti.entity.CategoryQuestion;
import com.vti.entity.Department;
import com.vti.entity.Exam;
import com.vti.entity.ExamQuestion;
import com.vti.entity.Group;
import com.vti.entity.GroupAccount;
import com.vti.entity.Position;
import com.vti.entity.Question;
import com.vti.entity.TypeQuestion;
import com.vti.entity.enums.PositionName;
import com.vti.entity.enums.Typename;

public class Program {
	
	public static void main(String[] args) throws ParseException {
		
		Department department1 = new Department();
		department1.setDepartmentId((byte) 1);
		department1.setDepartmentName("Marketing");
		System.out.println("departmetnid:" + department1.getDepartmentId());
		System.out.println("position name:" + department1.getDepartmentName());
		
		Department department2 = new Department();
		department2.setDepartmentId((byte) 2);
		department2.setDepartmentName("Nhan Su");
		System.out.println("departmetnid:" + department2.getDepartmentId());
		System.out.println("position name:" + department2.getDepartmentName());
		
		Department department3 = new Department();
		department3.setDepartmentId((byte) 3);
		department3.setDepartmentName("Bao Ve");
		System.out.println("departmetnid:" + department3.getDepartmentId());
		System.out.println("position name:" + department3.getDepartmentName());
		
		
		
		Position position1 = new Position();
		position1.setPositionId((byte) 1);
		position1.setPositionName(PositionName.POSITION_SCRUM_MASTER.getPositionName());
		System.out.println("id:" + position1.getPositionId());
		System.out.println("position name:" + position1.getPositionName());
		
		Position position2 = new Position();
		position2.setPositionId((byte) 2);
		position2.setPositionName(PositionName.POSITION_DEV.getPositionName());
		System.out.println("id:" + position2.getPositionId());
		System.out.println("position name:" + position2.getPositionName());
		
		Position position3 = new Position();
		position3.setPositionId((byte) 2);
		position3.setPositionName(PositionName.POSITION_DEV.getPositionName());
		System.out.println("id:" + position3.getPositionId());
		System.out.println("position name:" + position3.getPositionName());
		
		//Account
		Account account1 = new Account();
		account1.setAccountId(1);
		account1.setEmail("Anguyen@gmail.com");
		account1.setUsername("Anguyen");
		account1.setFullName("Nguyen Van A");
		account1.setDepartment(department1);
		account1.setPosition(position1) ;
		String date_string1 = "20-11-1992";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date1 = formatter.parse(date_string1);
		account1.setCreateDate(date1);
		System.out.println("id:" + account1.getAccountId());
		System.out.println("email:" + account1.getEmail());
		System.out.println("username:" + account1.getUsername());
		System.out.println("fullName:" + account1.getFullName());
		System.out.println("department:" + account1.getDepartment().getDepartmentName());
		System.out.println("position:" + account1.getPosition().getPositionName());
		System.out.println("createDate:" + account1.getCreateDate());
		
		Account account2 = new Account();
		account2.setAccountId(2);
		account2.setEmail("Bnguyen@gmail.com");
		account2.setUsername("Bnguyen");
		account2.setFullName("Nguyen Van B");
		account2.setDepartment(department1);
		account2.setPosition(position1) ;
		String date_string2 = "20-11-1994";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter2 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date2 = formatter2.parse(date_string2);
		account2.setCreateDate(date2);
		System.out.println("id:" + account2.getAccountId());
		System.out.println("email:" + account2.getEmail());
		System.out.println("username:" + account2.getUsername());
		System.out.println("fullName:" + account2.getFullName());
		System.out.println("department:" + account2.getDepartment().getDepartmentName());
		System.out.println("position:" + account2.getPosition().getPositionName());
		System.out.println("createDate:" + account2.getCreateDate());
		
		Account account3 = new Account();
		account3.setAccountId(3);
		account3.setEmail("Cnguyen@gmail.com");
		account3.setUsername("Cnguyen");
		account3.setFullName("Nguyen Van C");
		account3.setDepartment(department1);
		account3.setPosition(position1) ;
		String date_string3 = "20-11-1992";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter3 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date3 = formatter3.parse(date_string3);
		account3.setCreateDate(date3);
		System.out.println("id:" + account3.getAccountId());
		System.out.println("email:" + account3.getEmail());
		System.out.println("username:" + account3.getUsername());
		System.out.println("fullName:" + account3.getFullName());
		System.out.println("department:" + account3.getDepartment().getDepartmentName());
		System.out.println("position:" + account3.getPosition().getPositionName());
		System.out.println("createDate:" + account3.getCreateDate());
		
		//Group
		Group group1 = new Group();
		group1.setGroupId((byte) 1);
		group1.setGroupName("A");
		group1.setCreator(account1);
		String date_string4 = "12-10-2021";
		SimpleDateFormat formatter4 = new SimpleDateFormat("dd-MM-yyyy");
		Date date4 = formatter4.parse(date_string4);
		group1.setCreateDate(date4);
		System.out.println("groupId:" + group1.getGroupId());
		System.out.println("groupName:" + group1.getGroupName());
		System.out.println("creatorId:" + group1.getCreator().getFullName());
		System.out.println("createDate:" + group1.getCreateDate());
		
		Group group2 = new Group();
		group2.setGroupId((byte) 2);
		group2.setGroupName("B");
		group2.setCreator(account3);
		String date_string5 = "11-2-2021";
		SimpleDateFormat formatter5 = new SimpleDateFormat("dd-MM-yyyy");
		Date date5 = formatter5.parse(date_string5);
		group2.setCreateDate(date5);
		System.out.println("groupId:" + group2.getGroupId());
		System.out.println("groupName:" + group2.getGroupName());
		System.out.println("creatorId:" + group2.getCreator().getFullName());
		System.out.println("createDate:" + group2.getCreateDate());
		
		Group group3 = new Group();
		group3.setGroupId((byte) 3);
		group3.setGroupName("C");
		group3.setCreator(account2);
		String date_string6 = "11-8-2021";
		SimpleDateFormat formatter6 = new SimpleDateFormat("dd-MM-yyyy");
		Date date6 = formatter6.parse(date_string6);
		group3.setCreateDate(date6);
		System.out.println("groupId:" + group3.getGroupId());
		System.out.println("groupName:" + group3.getGroupName());
		System.out.println("creatorId:" + group3.getCreator().getFullName());
		System.out.println("createDate:" + group3.getCreateDate());
		
		//GroupAccount
		GroupAccount groupAccount1 = new GroupAccount();
		groupAccount1.setGroup(group1);
		groupAccount1.setAccount(account1);
		String date_string7 = "13-4-2021";
		SimpleDateFormat formatter7 = new SimpleDateFormat("dd-MM-yyyy");
		Date date7 = formatter7.parse(date_string7);
		groupAccount1.setJoinDate(date7);
		System.out.println("groupName:" + groupAccount1.getGroup().getGroupName());
		System.out.println("account:" + groupAccount1.getAccount().getFullName());
		System.out.println("joinDate:" + groupAccount1.getJoinDate() );
		
		GroupAccount groupAccount2 = new GroupAccount();
		groupAccount2.setGroup(group1);
		groupAccount2.setAccount(account3);
		String date_string8 = "13-4-2020";
		SimpleDateFormat formatter8 = new SimpleDateFormat("dd-MM-yyyy");
		Date date8 = formatter8.parse(date_string8);
		groupAccount1.setJoinDate(date8);
		System.out.println("groupName:" + groupAccount2.getGroup().getGroupName());
		System.out.println("account:" + groupAccount2.getAccount().getFullName());
		System.out.println("joinDate:" + groupAccount2.getJoinDate() );
		
		GroupAccount groupAccount3 = new GroupAccount();
		groupAccount3.setGroup(group3);
		groupAccount3.setAccount(account3);
		String date_string9 = "13-4-2020";
		SimpleDateFormat formatter9 = new SimpleDateFormat("dd-MM-yyyy");
		Date date9 = formatter9.parse(date_string9);
		groupAccount3.setJoinDate(date9);
		System.out.println("groupName:" + groupAccount3.getGroup().getGroupName());
		System.out.println("account:" + groupAccount3.getAccount().getFullName());
		System.out.println("joinDate:" + groupAccount3.getJoinDate());
		
		//TypeQuestion
		TypeQuestion typeQuestion1 = new TypeQuestion();
		typeQuestion1.setTypeId((byte) 1);
		typeQuestion1.setTypeName(Typename.ESSAY.getTypename());
		System.out.println("question typeid:" + typeQuestion1.getTypeId());
		System.out.println("question typename:" + typeQuestion1.getTypeName());
		
		TypeQuestion typeQuestion2 = new TypeQuestion();
		typeQuestion2.setTypeId((byte) 2);
		typeQuestion2.setTypeName(Typename.MULTIPLECHOISE.getTypename());
		System.out.println("question typeid:" + typeQuestion2.getTypeId());
		System.out.println("question typename:" + typeQuestion2.getTypeName());
		
		TypeQuestion typeQuestion3 = new TypeQuestion();
		typeQuestion3.setTypeId((byte) 3);
		typeQuestion3.setTypeName(Typename.MULTIPLECHOISE.getTypename());
		System.out.println("question typeid:" + typeQuestion3.getTypeId());
		System.out.println("question typename:" + typeQuestion3.getTypeName());
		
		//CategoryQuestion
		CategoryQuestion categoryQuestion1 = new CategoryQuestion();
		categoryQuestion1.setCategoryId((byte) 1);
		categoryQuestion1.setCategoryName("Java");
		System.out.println("categoryid:" + categoryQuestion1.getCategoryId());
		System.out.println("categoryname:" + categoryQuestion1.getCategoryName());
		
		CategoryQuestion categoryQuestion2 = new CategoryQuestion();
		categoryQuestion2.setCategoryId((byte) 2);
		categoryQuestion2.setCategoryName(".Net");
		System.out.println("categoryid:" + categoryQuestion2.getCategoryId());
		System.out.println("categoryname:" + categoryQuestion2.getCategoryName());
		
		CategoryQuestion categoryQuestion3 = new CategoryQuestion();
		categoryQuestion3.setCategoryId((byte) 2);
		categoryQuestion3.setCategoryName(".Net");
		System.out.println("categoryid:" + categoryQuestion3.getCategoryId());
		System.out.println("categoryname:" + categoryQuestion3.getCategoryName());
		
		//Question
		Question question1 = new Question();
		question1.setQuestionId(1);
		question1.setContent("Java la gi");
		question1.setCategory(categoryQuestion1);
		question1.setType(typeQuestion1);
		question1.setCreator(account3);
		String date_string10 = "20-11-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter10 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date10 = formatter10.parse(date_string10);
		question1.setCreateDate(date10);
		System.out.println("questionId:" + question1.getQuestionId());
		System.out.println("question content:" + question1.getContent());
		System.out.println("categoryname:" + question1.getCategory().getCategoryName());
		System.out.println("typename:" + question1.getType().getTypeName());
		System.out.println("nguoi tao:" + question1.getCreator().getFullName());
		System.out.println("ngay tao:" + question1.getCreateDate());
		
		Question question2 = new Question();
		question2.setQuestionId(2);
		question2.setContent("Java dung vao viec gi");
		question2.setCategory(categoryQuestion1);
		question2.setType(typeQuestion1);
		question2.setCreator(account3);
		String date_string11 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter11 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date11 = formatter11.parse(date_string11);
		question2.setCreateDate(date11);
		System.out.println("questionId:" + question2.getQuestionId());
		System.out.println("question content:" + question2.getContent());
		System.out.println("categoryname:" + question2.getCategory().getCategoryName());
		System.out.println("typename:" + question2.getType().getTypeName());
		System.out.println("nguoi tao:" + question2.getCreator().getFullName());
		System.out.println("ngay tao:" + question2.getCreateDate());
		
		Question question3 = new Question();
		question3.setQuestionId(3);
		question3.setContent("xoa Java nhu the nao");
		question3.setCategory(categoryQuestion3);
		question3.setType(typeQuestion3);
		question3.setCreator(account1);
		String date_string12 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter12 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date12 = formatter12.parse(date_string12);
		question3.setCreateDate(date12);
		System.out.println("questionId:" + question3.getQuestionId());
		System.out.println("question content:" + question3.getContent());
		System.out.println("categoryname:" + question3.getCategory().getCategoryName());
		System.out.println("typename:" + question3.getType().getTypeName());
		System.out.println("nguoi tao:" + question3.getCreator().getFullName());
		System.out.println("ngay tao:" + question3.getCreateDate());
		
		//answer
		Answer answer1 = new Answer();
		answer1.setAnswerId(1);
		answer1.setContent("khong biet");
		answer1.setQuestion(question1);
		answer1.setCorrect(true);
		System.out.println("answerId:" + answer1.getAnswerId());
		System.out.println("answercontent:" + answer1.getContent());
		System.out.println("question:" + answer1.getQuestion().getContent());
		System.out.println("typename:" + answer1.isCorrect());
		
		Answer answer2 = new Answer();
		answer2.setAnswerId(2);
		answer2.setContent("chua biet la gi");
		answer2.setQuestion(question2);
		answer2.setCorrect(true);
		System.out.println("answerId:" + answer2.getAnswerId());
		System.out.println("answercontent:" + answer2.getContent());
		System.out.println("question:" + answer2.getQuestion().getContent());
		System.out.println("typename:" + answer2.isCorrect());
		
		Answer answer3 = new Answer();
		answer3.setAnswerId(2);
		answer3.setContent("chua biet la gi");
		answer3.setQuestion(question3);
		answer3.setCorrect(false);
		System.out.println("answerId:" + answer3.getAnswerId());
		System.out.println("answercontent:" + answer3.getContent());
		System.out.println("question:" + answer3.getQuestion().getContent());
		System.out.println("typename:" + answer3.isCorrect());
		
		Exam exam1 = new Exam();
		exam1.setExamId(1);
		exam1.setCode("THUOQN");
		exam1.setTitle("bai thi JAVA");
		exam1.setCategory(categoryQuestion1);
		exam1.setCreator(account2);
		String date_string13 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter13 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date13 = formatter13.parse(date_string13);
		exam1.setCreateDate(date13);
		System.out.println("examId:" + exam1.getExamId());
		System.out.println("code:" + exam1.getCode());
		System.out.println("title:" + exam1.getTitle());
		System.out.println("categoryQuestion:" + exam1.getCategory().getCategoryId());
		System.out.println("nguoi tao:" + exam1.getCreator().getFullName());
		
		Exam exam2 = new Exam();
		exam2.setExamId(2);
		exam2.setCode("THTOQN");
		exam2.setTitle("bai thi EXCEL");
		exam2.setCategory(categoryQuestion3);
		exam2.setCreator(account2);
		String date_string14 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter14 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date14 = formatter14.parse(date_string14);
		exam2.setCreateDate(date14);
		System.out.println("examId:" + exam2.getExamId());
		System.out.println("code:" + exam2.getCode());
		System.out.println("title:" + exam2.getTitle());
		System.out.println("categoryQuestion:" + exam2.getCategory().getCategoryId());
		System.out.println("nguoi tao:" + exam2.getCreator().getFullName());
		
		Exam exam3 = new Exam();
		exam3.setExamId(3);
		exam3.setCode("THYOQN");
		exam3.setTitle("bai thi EXCEL");
		exam3.setCategory(categoryQuestion3);
		exam3.setCreator(account3);
		String date_string15 = "20-10-2021";
		// Instantiating the SimpleDateFormat class
		SimpleDateFormat formatter15 = new SimpleDateFormat("dd-MM-yyyy");
		// Parsing the given String to Date object
		Date date15 = formatter15.parse(date_string15);
		exam3.setCreateDate(date15);
		System.out.println("examId:" + exam3.getExamId());
		System.out.println("code:" + exam3.getCode());
		System.out.println("title:" + exam3.getTitle());
		System.out.println("categoryQuestion:" + exam3.getCategory().getCategoryId());
		System.out.println("nguoi tao:" + exam3.getCreator().getFullName());
		
		ExamQuestion examQuestion1= new ExamQuestion();
		examQuestion1.setExam(exam1);
		examQuestion1.setQuestion(question1);
		System.out.println("examId:" + examQuestion1.getExam().getExamId());
		System.out.println("questionId:" + examQuestion1.getQuestion().getQuestionId());
		
		ExamQuestion examQuestion2= new ExamQuestion();
		examQuestion2.setExam(exam3);
		examQuestion2.setQuestion(question3);
		System.out.println("examId:" + examQuestion2.getExam().getExamId());
		System.out.println("questionId:" + examQuestion2.getQuestion().getQuestionId());
		
		ExamQuestion examQuestion3= new ExamQuestion();
		examQuestion3.setExam(exam1);
		examQuestion3.setQuestion(question3);
		System.out.println("examId:" + examQuestion3.getExam().getExamId());
		System.out.println("questionId:" + examQuestion3.getQuestion().getQuestionId());
	}
}
