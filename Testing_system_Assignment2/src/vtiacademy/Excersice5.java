package vtiacademy;

import java.util.Date;
import java.util.Scanner;

public class Excersice5 {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*Question 1: 
			Viết lệnh cho phép người dùng nhập 3 số nguyên vào chương trình
			*/
		Scanner sc1= new Scanner(System.in);
		System.out.println("xin mời nhập vào một số nguyên");
		if(sc1.hasNextInt()) {System.out.println("số bạn vừa nhập là số nguyên");}
		else{System.out.println("số bạn vừa nhập không phải là số nguyên");};
		
		Scanner sc2= new Scanner(System.in);
		System.out.println("xin mời nhập vào một số nguyên");
		if(sc2.hasNextInt()) {System.out.println("số bạn vừa nhập là số nguyên");}
		else{System.out.println("số bạn vừa nhập không phải là số nguyên");};
		
		Scanner sc3= new Scanner(System.in);
		System.out.println("xin mời nhập vào một số nguyên");
		if(sc3.hasNextInt()) {System.out.println("số bạn vừa nhập là số nguyên");}
		else{System.out.println("số bạn vừa nhập không phải là số nguyên");};
		
			/*
			Question 2: 
			Viết lệnh cho phép người dùng nhập 2 số thực vào chương trình*/
		
		Scanner scq21= new Scanner(System.in);
		System.out.println("xin mời nhập vào một số thuc");
		if(scq21.hasNextFloat()) {System.out.println("số bạn vừa nhập là số thực");}
		else{System.out.println("số bạn vừa nhập không phải là số thực");};
		
		Scanner scq22= new Scanner(System.in);
		System.out.println("xin mời nhập vào một số thuc");
		if(scq22.hasNextFloat()) {System.out.println("số bạn vừa nhập là số thực");}
		else{System.out.println("số bạn vừa nhập không phải là số thực");};
		/*
			Question 3: 
			Viết lệnh cho phép người dùng nhập họ và tên
			
			*/
		Scanner scq3= new Scanner(System.in);
		System.out.println("xin mời nhập vào họ tên");
		String hoten = scq3.nextLine();
		System.out.println("họ tên vừa nhập vào là: "+hoten);
		/*
			Question 4: 
			Viết lệnh cho phép người dùng nhập vào ngày sinh nhật của họ*/
		Scanner scq4= new Scanner(System.in);
		System.out.println("xin mời nhập vào ngày sinh nhật theo dạng dd-MM-YYYY");
		String ngaysinh = scq4.nextLine();
		System.out.println("ngày sinh vừa nhập vào là: " + ngaysinh);
		/*
		/*
			Question 5: 
			Viết lệnh cho phép người dùng tạo account (viết thành method)
			Đối với property Position, Người dùng nhập vào 1 2 3 4 và vào 
			chương trình sẽ chuyển thành Position.Dev, Position.Test, 
			Position.ScrumMaster, Position.PM*/
			Scanner scq5= new Scanner(System.in);
			System.out.println("xin mời nhập thông tin dựa vào form bên dưới");
			Account account4 = new Account();
			System.out.println("xin mời nhập vào ngày Account_id");
			account4.accountId = scq5.nextInt();
			System.out.println("xin mời nhập vào email");
			account4.email = scq5.next();
			System.out.println("xin mời nhập vào username ");
			account4.username = scq5.next();
			System.out.println("xin mời nhập vào họ và tên ");
			account4.fullName = scq5.next();
			System.out.println("xin mời nhập vào vị trí công việc tương ứng 1.Dev 2.Test 3.ScrumMaster 4. PM");
			byte positionnum = scq5.nextByte();
				switch(positionnum) {
				case 1:Position	position1 = new Position();
						position1.positionName="Dev";
						account4.position=position1;
				case 2:Position	position2 = new Position();
				position2.positionName="Test";
				account4.position=position2;
				case 3:Position	position3 = new Position();
				position3.positionName="ScrumMaster";
				account4.position=position3;
				case 4:Position	position4 = new Position();
				position4.positionName="PM";
				account4.position=position4;
				}
				System.out.println("tài khoản của bạn là:" + "\n"
						+ "Id: " + account4.accountId + "\n"
						+ "User: " + account4.username + "\n"
						+ "Fullname: " + account4.fullName + "\n"
						+ "Position: " + account4.position.positionName
						);
			/*Question 6: 
			Viết lệnh cho phép người dùng tạo department (viết thành method)
			*/
				System.out.println("xin mời nhập vào phòng:");
				account4.department.departmentName = scq5.next();
				System.out.println("bạn đã nhập vào phòng: " +account4.department.departmentName);
			/*
			Nhập số chẵn từ console
			Question 8: 
			Viết chương trình thực hiện theo flow sau:
			Bước 1: 
			Chương trình in ra text "mời bạn nhập vào chức năng muốn sử 
			dụng"
			Bước 2: 
			Nếu người dùng nhập vào 1 thì sẽ thực hiện tạo account
			Nếu người dùng nhập vào 2 thì sẽ thực hiện chức năng tạo 
			department
			Nếu người dùng nhập vào số khác thì in ra text "Mời bạn nhập 
			lại" và quay trở lại bước 1
			Question 9: 
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
}
