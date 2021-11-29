package com.vti.backend;

import java.util.Arrays;
import java.util.Scanner;

import org.apache.commons.lang3.ArrayUtils;

import com.vti.entity.Canbo;
import com.vti.entity.Kysu;
import com.vti.enums.Gioitinh;

public class Exercise5 {
	private Canbo[] canBoArr;
	private Scanner sc;

	public Exercise5() {
		canBoArr = new Canbo[] {};
		sc = new Scanner(System.in);
	}

	public void question1() {
		while (true) {
			System.out.println("======================================================================");

			System.out.println("=================Lựa chọn chức năng bạn muốn sử dụng==================");

			System.out.println("=== 1. Thêm mới cán bộ. ===");

			System.out.println("=== 2. Tìm kiếm theo họ tên. ===");

			System.out.println("=== 3. Hiện thị thông tin về danh sách các cán bộ. ===");

			System.out.println("=== 4. Nhập vào tên của cán bộ và delete cán bộ đó ===");

			System.out.println("=== 5. Thoát khỏi chương trình. ===");
			System.out.println("======================================================================");

			int menuChoose = sc.nextInt();
			switch (menuChoose) {
			case 1:
				themCanBo();
				break;

			case 2:
				timTheoTen();
				break;
			case 3:
				hienThiDanhSachCanBo();
				break;
			case 4:
				xoaTheoTen();
				break;
			case 5:
				return;
			default:
				System.out.println("Lựa chọn đúng số trên menu");
				break;
			}
		}
	}

	// thêm cán bộ
	private void themCanBo() {
		System.out.println("----------------------------------------------------");

		System.out.println("--------Lựa chọn chức năng bạn muốn sử dụng---------");

		System.out.println("--- 1. Thêm Kỹ Sư---");

		System.out.println("--- 2. Thêm Công nhân ---");

		System.out.println("--- 3. Thêm nhân viên ---");

		System.out.println("----------------------------------------------------");

		int choose1 = sc.nextInt();
		switch (choose1) {
		case 1:
			sc.nextLine();
			System.out.println("Nhập vào tên Kỹ Sư: ");
			String tenKySu = sc.nextLine();
			System.out.println("Nhập vào tuổi Kỹ Sư: ");
			Byte tuoiKySu = sc.nextByte();
			
			
			System.out.println("Nhập vào giới tính Kỹ Sư 1.Nam, 2.Nữ, 3.Chưa xác định: ");
			int flagGioitinh = sc.nextInt();
			String gioiTinhKysu = null;
			switch (flagGioitinh) {
			case 1:
				gioiTinhKysu = Gioitinh.GENDER_NAM.getGioitinh();
				break;
			case 2:
				gioiTinhKysu = Gioitinh.GENDER_NU.getGioitinh();
				break;
			case 3:
				gioiTinhKysu = Gioitinh.GENDER_CHUA_XAC_DINH.getGioitinh();
				break;
			}
			sc.nextLine();
			System.out.println("Nhập vào địa chỉ Kỹ Sư: ");
			String diaChiKysu = sc.nextLine();
			System.out.println("Nhập vào chuyên ngành Kỹ Sư: ");
			String chuyenNganhKySu = sc.nextLine();
			
			Canbo canbo = new Kysu(tenKySu, tuoiKySu, gioiTinhKysu, diaChiKysu, chuyenNganhKySu);
			canBoArr = Arrays.copyOf(canBoArr, canBoArr.length + 1);
			canBoArr[canBoArr.length - 1] = canbo;
			break;
		default:
			break;
		}
	}

	// Tim theo ten
	private void timTheoTen() {
		System.out.println("Nhập vào tên muốn tìm kiếm: ");
		String ten = sc.next();
		if (canBoArr.length > 0) {
			for (Canbo canbo : canBoArr) {
				if (canbo.getTen().equals(ten)) {
					System.out.println(canbo);
				}
			}
		}
	}

	// Hiển thị danh sách cán bộ
	private void hienThiDanhSachCanBo() {
		if (canBoArr.length > 0) {
			for (Canbo canbo : canBoArr) { 
				System.out.println(canbo); 
			}
		}else {
			System.out.println("Không có cán bộ để hiển thị!");
		}
	}
	
	// Hiển thị danh sách cán bộ
	private void xoaTheoTen() {
		System.out.println("Nhập tên cần xóa thông tin: ");
		String ten = sc.next();
		int index = 0;
		int [] indexArr = new int[] {};
		if(canBoArr.length>0) {
			for (Canbo canbo : canBoArr) {
				if(canbo.getTen().equals(ten)) {
					indexArr = ArrayUtils.add(indexArr, index);
				}
				index++;
			}
			//xóa Cán bộ theo indexArr(danh sách index)
			if(indexArr.length>0) {
				canBoArr = ArrayUtils.removeAll(canBoArr, indexArr);
			}
			
			 
		}
	}

}
