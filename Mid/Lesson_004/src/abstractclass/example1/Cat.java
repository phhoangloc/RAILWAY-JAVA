package abstractclass.example1;

public class Cat extends  Animal{ 
	//tạo một lớp Cat/Con Mèo kế thừa từ lớp abstract Animal
	@Override
	public void animalSound() {
		System.out.println("Con mèo kêu: Meo meo!");
	}

}
