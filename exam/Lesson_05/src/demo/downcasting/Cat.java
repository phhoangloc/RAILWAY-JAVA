package demo.downcasting;

public class Cat extends Animal {
	static void run(Animal animal) {
		  if (animal instanceof Cat) {
		   Cat c = (Cat) animal;// downcasting
		   System.out.println("downcasting is ok");
		   c.run();
		}
	}
}
