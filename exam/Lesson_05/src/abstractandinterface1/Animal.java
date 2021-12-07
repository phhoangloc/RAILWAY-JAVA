package abstractandinterface1;

public abstract class Animal {
	
	//Có phương thức abstract (không có thân hàm) 
	public abstract void run();
	
	//Có phương thức non-abstract (có thân hàm)
	public void smile() {
		System.out.println("Động vật cười hahaha");
	}
}
