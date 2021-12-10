package interfacee.example;

public class Cat implements Animal {

	@Override
	public void animalSound() {
		System.out.println("Con mèo kêu: Meo meo!");
	}

	@Override
	public void run() {
		System.out.println("Con mèo chạy nhanh!");
	}

}
