package abstractclass.example2;

public class Motorbike extends Vehicle{

	public Motorbike() {
		WheelAmount = 2;// xe máy có số bánh = 2
	}
	@Override
	public void di() {
		System.out.println("Đi bằng 2 bánh");
	} 
}
