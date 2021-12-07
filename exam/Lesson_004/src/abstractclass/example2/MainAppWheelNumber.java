package abstractclass.example2;

public class MainAppWheelNumber {

	public static void main(String[] args) {
		Ford ford = new Ford();
		Motorbike motorbike = new Motorbike();
		
		//hiển thị số bánh
		System.out.println("ford - số bánh: " + ford.WheelAmount);
		System.out.println("motorbike - số bánh: " + motorbike.WheelAmount);	
	}
}
