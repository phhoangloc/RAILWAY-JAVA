package abstractclass.example2;

public abstract class Car extends Vehicle{
	public Car() {
		WheelAmount = 4;// xe Car có số bánh = 4
	}
	@Override
	public void di() {
		System.out.println("Đi bằng 4 bánh");
	}
	
	public abstract void napNhienLieu();

}
