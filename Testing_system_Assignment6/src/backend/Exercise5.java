package backend;

import java.util.Scanner;

import entity.QLCB;

public class Exercise5 {

	public void question1_2() {
		Scanner scanner = new Scanner(System.in);
		QLCB qlcb = new QLCB();

		System.out.println("Mời bạn nhập v�?o chức năng muốn dùng\n" + "1.Thêm mới cán bộ\n" + "2.Tìm kiếm theo h�? tên\n"
				+ "3.Hiện th�? thông tin v�? danh sách các cán b�?.\n" + "4.Nhập v�?o tên của cán b�? v�? delete cán b�? đó\n"
				+ "5.Thoát khỏi chương trình.");
		System.out.print("Mời bạn chọn chức năng: ");

		int choose = scanner.nextInt();
		while (true) {
			switch (choose) {
			case 1:
				qlcb.addCanBo();
				break;
			case 2:
				qlcb.findByName();
				break;
			case 3:
				qlcb.printListCanBo();
				break;
			case 4:
				qlcb.deleteCanBo();
				break;
			case 5:
				return;
			default:
				System.out.println("Bạn đã nhập sai. Bạn ch�? được nhập từ 1 tới 5 thôi!");
				break;
			}
		}
	}
}
