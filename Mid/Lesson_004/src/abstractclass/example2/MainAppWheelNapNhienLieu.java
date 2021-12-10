package abstractclass.example2;

public class MainAppWheelNapNhienLieu {

	public static void main(String[] args) {
		Ford ford = new Ford();
		Toyota toyota = new Toyota();
		 
		//Cách nạp nhiên liệu
		System.out.print("ford: ");
		ford.napNhienLieu();
		System.out.print("toyota: ");
		toyota.napNhienLieu();
	}
}
