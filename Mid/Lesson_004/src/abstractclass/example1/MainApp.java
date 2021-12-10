package abstractclass.example1;

public class MainApp {
	public static void main(String[] args) {
		Pig pig = new Pig();
		pig.sleep();
		pig.animalSound();
		
		System.out.println("");
		
		Cat cat = new Cat();
		cat.sleep();
		cat.animalSound();
		
	}
}

