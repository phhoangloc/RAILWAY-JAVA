package interfacee.example;

public class Pig implements Animal{

	@Override
	public void animalSound() {
		System.out.println("Con heo kêu: wee wee!");
	}

	@Override
	public void run() {
		System.out.println("Con heo chạy chậm!");
	}

}
