package abstractclass.example2;

public class MainAppDii {

	public static void main(String[] args) {
		Ford ford = new Ford();
		Motorbike motorbike = new Motorbike();

		// Cách di chuyển
		System.out.print("ford: ");
		ford.di();
		System.out.print("motorbike: ");
		motorbike.di();
	}
}
