package com.vti.backend;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

import com.vti.entity.CanBo;
import com.vti.entity.KySu;
import com.vti.entity.NhanVien;


public class Exercise5 {
	private static CanBo[] Canboarr;
	private static Scanner sc;

	public Exercise5() {
		setCanboarr(new CanBo[] {});
		sc = new Scanner(System.in);
	}
	
	
	public void question2() {
			System.out.println("nhập vào sô tương ứng với các chứng năng bạn muốn");
			System.out.println("1.Thêm mới cán bộ.\r\n"
					+ "2.Tìm kiếm theo họ tên.\r\n"
					+ "3.Hiện thị thông tin về danh sách các cán bộ.\r\n"
					+ "4.Nhập vào tên của cán bộ và delete cán bộ đó\r\n"
					+ "5.Thoát khỏi chương trình.");
			byte num = sc.nextByte();
			switch (num) {
			case 1: themmoi();break;
			case 2: timkiem();break;
			case 3: hiendanhsach();break;
			case 4: xoa();break;
			case 5: System.out.println("thoát chương trình");
			default: System.out.println("bạn đã nhập sai cú pháp, xin mời nhập lại"); question2();
			}
		}

	private void xoa() {

		System.out.println("xóa danh sách");
		System.out.println("nhập tên cán bộ cần xóa");
		String name = sc.nextLine();
		int i = 0;
		int [] iArr = new int[] {};
		if(getCanboarr().length>0){
			for(CanBo arr:getCanboarr()) {
				if(arr.getHoTen().equals(name)) {
					iArr = ArrayUtils.add(iArr, i);
				}
				i++;
			}
			if(iArr.length>0) {
				Canboarr = ArrayUtils.removeAll(Canboarr, iArr);
			}
		}
	}

	private void hiendanhsach() {
		if (getCanboarr().length > 0) {
			for (CanBo canbo : getCanboarr()) { 
				System.out.println(canbo); 
			}
		}else {
			System.out.println("không có cán bộ nào!");
			question2();
		}
		question2();
	}

	private static void timkiem() {
		sc.nextLine();
		System.out.println("nhập vào tên cán bộ cần tìm");
		String name = sc.nextLine();
		if(getCanboarr().length>0){
			for (CanBo arr:getCanboarr()) {
			if(arr.getHoTen().equals(name)) {
				System.out.println(arr);
				}
			}
		}else {
			System.out.println("không có danh sách cán bộ nào!");
		}
	}

	private void themmoi() {
	
		System.out.println("nhập vào bộ phận tương ứng");
		System.out.println("1.Công Nhân");
		System.out.println("2.Kỹ Sư");
		System.out.println("3.Nhân Viên");
		byte num= sc.nextByte();
		switch(num) {
		case 1: themmoicongnhan();break;
		case 2: themmoikysu();break;
		case 3: themmoinhanvien();break;
		default: System.out.println("bạn đã nhập sai cú pháp, xin mời nhập lại");
				themmoi();
		}
	}


	private void themmoinhanvien() {
		sc.nextLine();
		System.out.println("nhập tên nhân viên");
		String tencb= sc.nextLine();
		System.out.println("nhập tuổi nhân viên");
		Byte tuoicb= sc.nextByte();
		sc.nextLine();
		System.out.println("nhập giới tính nhân viên");
		String gioitinhcb= sc.nextLine();
			switch(gioitinhcb) {
			case "Nam": gioitinhcb="Male";break;
			case "nam": gioitinhcb="Male";break;
			case "Nữ": gioitinhcb="FeMale";break;
			case "nữ": gioitinhcb="FeMale";break;
			default: gioitinhcb="không xác định";break;
			}
		System.out.println("nhập địa chỉ nhân viên");
		String diachi= sc.nextLine();
		System.out.println("nhập công việc nhân viên");
		String congviecnv= sc.nextLine();
		CanBo cb = new NhanVien(tencb, tuoicb, gioitinhcb , diachi, congviecnv);
		setCanboarr(Arrays.copyOf(getCanboarr(), getCanboarr().length + 1));
		getCanboarr()[getCanboarr().length - 1] = cb; 
		question2() ;
	}

	private void themmoikysu() {

		System.out.println("thêm mới kỹ sư");
		sc.nextLine();
		System.out.println("nhập tên kỹ sư");
		String tencb= sc.nextLine();
		System.out.println("nhập tuổi kỹ sư");
		Byte tuoicb= sc.nextByte();
		sc.nextLine();
		System.out.println("nhập giới tính kỹ sư");
		String gioitinhcb= sc.nextLine();
			switch(gioitinhcb) {
			case "Nam": gioitinhcb="Male";break;
			case "nam": gioitinhcb="Male";break;
			case "Nữ": gioitinhcb="FeMale";break;
			case "nữ": gioitinhcb="FeMale";break;
			default: gioitinhcb="không xác định";break;
			}
		System.out.println("nhập địa chỉ kỹ sư");
		String diachi= sc.nextLine();
		System.out.println("nhập chuyên ngành kỹ sư");
		String congviecnv= sc.nextLine();
		CanBo cb = new KySu(tencb, tuoicb, gioitinhcb , diachi, congviecnv);
		setCanboarr(Arrays.copyOf(getCanboarr(), getCanboarr().length + 1));
		getCanboarr()[getCanboarr().length - 1] = cb; 
		question2() ;
	}

	private void themmoicongnhan() {
		System.out.println("thêm mới công nhân");
		System.out.println("nhập tên công nhân");
		sc.nextLine();
		String tencb= sc.nextLine();
		System.out.println("nhập tuổi công nhân");
		Byte tuoicb= sc.nextByte();
		sc.nextLine();
		System.out.println("nhập giới tính công nhân");
		String gioitinhcb= sc.nextLine();
			switch(gioitinhcb) {
			case "Nam": gioitinhcb="Male";break;
			case "nam": gioitinhcb="Male";break;
			case "Nữ": gioitinhcb="FeMale";break;
			case "nữ": gioitinhcb="FeMale";break;
			default: gioitinhcb="không xác định";break;
			}
		System.out.println("nhập địa chỉ công nhân");
		String diachi= sc.nextLine();
		System.out.println("nhập cấp bậc công nhân");
		String congviecnv= sc.nextLine();
		CanBo cb = new KySu(tencb, tuoicb, gioitinhcb , diachi, congviecnv);
		setCanboarr(Arrays.copyOf(getCanboarr(), getCanboarr().length + 1));
		getCanboarr()[getCanboarr().length - 1] = cb; 
		question2() ;
	}

//	Exercise 5: Inheritance
//	Chú ý: áp dụng cả encapsulation cho các question ở dưới


	public static CanBo[] getCanboarr() {
		return Canboarr;
	}


	public static void setCanboarr(CanBo[] canboarr) {
		Canboarr = canboarr;
	}
	
//	Question 1: inheritance
//	Một đơn vị sản xuất gồm có các cán bộ là công nhân, kỹ sư, nhân viên. 
//	Mỗi cán bộ cần quản lý các dữ liệu: Họ tên, tuổi, giới tính(name, nữ, 
//	khác), địa chỉ.
//	Cấp công nhân sẽ có thêm các thuộc tính riêng: Bậc (1 đến 10).
//	Cấp kỹ sư có thuộc tính riêng: Nghành đào tạo.
//	Các nhân viên có thuộc tính riêng: công việc.
//	Hãy xây dựng các lớp CongNhan, KySu, NhanVien kế thừa từ lớp 
//	CanBo.
//	Question 2: Tiếp tục Question 1
//	Xây dựng lớp QLCB(quản lý cán bộ) cài đặt các phương thức thực 
//	hiện các chức năng sau:
//	a) Thêm mới cán bộ.
//	b) Tìm kiếm theo họ tên.
//	c) Hiện thị thông tin về danh sách các cán bộ.
//	d) Nhập vào tên của cán bộ và delete cán bộ đó
//	e) Thoát khỏi chương trình.

}