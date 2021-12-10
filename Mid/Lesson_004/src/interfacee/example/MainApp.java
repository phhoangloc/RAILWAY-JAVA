package interfacee.example;

public class MainApp {
	public static void main(String[] args) {
		Pig pig = new Pig();
		Cat cat = new Cat();
		
		//Tiếng kêu
		pig.animalSound();
		cat.animalSound();
		
		System.out.println("");
		
		//Tốc độ đi
		pig.run();
		cat.run();
		
	}
}
