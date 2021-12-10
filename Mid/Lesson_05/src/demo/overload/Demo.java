package demo.overload;

public class Demo {

	public static void main(String[] args) {
		PhepToan phepToan = new PhepToan();

		// Tổng 2 chữ số
		
		int tong2 = phepToan.tinhTong(1, 2);
		System.out.println("Tổng 2 chữ số: "+ tong2);
		
		// Tổng 3 chữ số
		int tong3 =phepToan.tinhTong(1, 2, 3);
		System.out.println("Tổng 3 chữ số: " + tong3);
		

		// Tổng 4 chữ số 
		int tong4 = phepToan.tinhTong(1, 2, 3, 4);
		System.out.println("Tổng 4 chữ số: " + tong4);
	}

}
