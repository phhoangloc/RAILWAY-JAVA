package demo.downcasting;

public class Demo {
	public static void main(String[] args) {
		//Cat cat = new Animal();
		//Cat cat = (Cat) new Animal();
		//cat.run();
		Animal animal = new Cat();
		Cat.run(animal);
		 
	}
}
