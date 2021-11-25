package vtiacademy;

import java.util.Date;
import java.util.Scanner;

import vtiacademy.enums.PositionName;

public class Excersice5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Question 1: 
			Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
			*/
		Scanner sc= new Scanner(System.in);
//		question1(sc);
//		question2(sc);
//		question3(sc);
//		question4(sc);
//		question5(sc);
//		question6(sc);
		question7(sc);
	}		
		public static void question1(Scanner scan) {
			System.out.println("xin mời nhập vào một số nguyên");
			int sothu1 = scan.nextInt();
			System.out.println("xin mời nhập vào một số nguyên");
			int sothu2 = scan.nextInt();
			System.out.println("xin mời nhập vào một số nguyên");
			int sothu3 = scan.nextInt();
			System.out.println("các số đã nhập tuần tự là " + sothu1 + "," + sothu2 + ","+ sothu3);
		};
//			/*
//			Question 2: 
//			Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình*/
		public static void question2(Scanner scan) {
				System.out.println("Xin mời nhập bào một số thực");
			float sothu1 = scan.nextFloat();
				System.out.println("Xin mời nhập bào một số thực");
			float sothu2 = scan.nextFloat();
				System.out.println("số bạn vừa nhập là: " + sothu1 + "," + sothu2);
			scan.nextLine();
		}
//			Question 3: 
//			Viết lệnh cho phép người dùng nhập họ và tên
			public static void question3(Scanner scan) {
				System.out.println("xin mời nhập vào họ tên");
				String hoten = scan.nextLine();
				System.out.println("họ tên vừa nhập vào là: "+ hoten);
			}
//			Question 4: 
//			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ*/
			public static void question4(Scanner scan) {
				System.out.println("xin mời nhập vào ngày sinh nhật theo dạng dd-MM-YYYY");
				String ngaysinh = scan.nextLine();
				System.out.println("ngày sinh vừa nhập vào là: " + ngaysinh);
			}
//		/*
//		/*
//			Question 5: 
//			Viết lệnh cho phép người dùng tạo account (viết thành method)
//			Đối với property Position, Người dùng nhập vào 1 2 3 4 và vào 
//			chương trình sẽ chuyển thành Position.Dev, Position.Test, 
//			Position.ScrumMaster, Position.PM*/
		public static void question5(Scanner scan)	{
			System.out.println("xin mời nhập thông tin dựa vào form bên dưới");
			
			Account account4 = new Account();
			
			Position position4=new Position();
			account4.position=position4;
			System.out.println("xin mời nhập vào ngày Account_id");
			account4.accountId = scan.nextInt();
			System.out.println("xin mời nhập vào email");
			account4.email = scan.next();
			System.out.println("xin mời nhập vào username ");
			account4.username = scan.next();
			System.out.println("xin mời nhập vào họ và tên ");
			account4.fullName = scan.nextLine();
			System.out.println("xin mời nhập vào vị trí công việc tương ứng 1.Dev 2.Test 3.ScrumMaster 4. PM");
			byte positionnum = scan.nextByte();
				switch(positionnum) {
				case 1:position4.positionName=PositionName.POSITION_DEV.getPositionName();break;
				case 2:position4.positionName=PositionName.POSITION_TEST.getPositionName();break;
				case 3:position4.positionName=PositionName.POSITION_SCRUM_MASTER.getPositionName();break;
				case 4:position4.positionName=PositionName.POSITION_PM.getPositionName();break;
				}
			System.out.println("bạn đã tạo một account với: "+"/n"
				+ "accountid: "+account4.accountId +"\n"
				+ "email: "+account4.email +"\n"
				+ "username: "+account4.username +"\n"
				+ "fullname: "+account4.fullName +"\n"
				+ "position: "+account4.position.positionName +"\n");
		}
//			/*Question 6: 
//			Viết lệnh cho phép người dùng tạo department (viết thành method);
		public static void question6(Scanner scan) {
				Account account4 = new Account();
				Department department4= new Department();
				account4.department=department4;
				System.out.println("xin mời tạo id phòng:");
				department4.departmentId = (byte) scan.nextInt();
				System.out.println("xin mời tạo tên phòng:");
				department4.departmentName = scan.nextLine();
				System.out.println("bạn đã tạo phòng: " + "Id: " + department4.departmentId + " tên phòng là " + department4.departmentName);
		}
//			Question 7: 
//			Nhập số chẵn từ console
			public static void question7(Scanner scan) {
				System.out.println("xin mời nhập vào một số chẵn");
				int i=scan.nextInt();
				if(i%2==0) {System.out.println("số bạn vừa nhập là: " + i);}
				else{System.out.println("số bạn nhập không phải là số chẵn");};
			}
//			Question 8: 
//			Viết chương trình thực hiện theo flow sau:
//			Bước 1: 
//			Chương trình in ra text "mời bạn nhập vào chức năng muốn sử 
//			dụng"
//			Bước 2: 
//			Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
//			Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo 
//			department
//			Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập 
//			lại" và quay trở lại bước 1
			public static void question8(Scanner scan) {
				int num = scan.nextInt();
				switch (num)
			}
			
			/*Question 9: 
			Viết method cho phép người dùng thêm group vào account theo flow sau:
			Bước 1: 
			In ra tên các usernames của user cho người dùng xem
			Bước 2: 
			Yêu cầu người dùng nhập vào username của account
			Bước 3: 
			In ra tên các group cho người dùng xem
			Bước 4: 
			Yêu cầu người dùng nhập vào tên của group
			Bước 5: 
			Dựa vào username và tên của group người dùng vừa chọn, hãy 
			thêm account vào group đó .
			Question 10: Tiếp tục Question 8 và Question 9
			Bổ sung thêm vào bước 2 của Question 8 như sau:
			Nếu người dùng nhập vào 3 thì sẽ thực hiện chức năng thêm group vào 
			account 
			Bổ sung thêm Bước 3 của Question 8 như sau: 
			Sau khi người dùng thực hiện xong chức năng ở bước 2 thì in ra dòng 
			text để hỏi người dùng "Bạn có muốn thực hiện chức năng khác 
			không?". Nếu người dùng chọn "Có" thì quay lại bước 1, nếu người 
			dùng chọn "Không" thì kết thúc chương trình (sử dụng lệnh return để 
			kết thúc chương trình)
			Question 11: Tiếp tục Question 10
			Bổ sung thêm vào bước 2 của Question 8 như sau:
			Nếu người dùng nhập vào 4 thì sẽ thực hiện chức năng thêm account 
			vào 1 nhóm ngẫu nhiên, chức năng sẽ được cài đặt như sau:
			Bước 1: 
			In ra tên các usernames của user cho người dùng xem
			6
			Bước 2: 
			Yêu cầu người dùng nhập vào username của account
			Bước 3: 
			Sau đó chương trình sẽ chọn ngẫu nhiên 1 group
			Bước 4: 
			Thêm account vào group chương trình vừa chọn ngẫu 
			nhiên*/
	}
