package abstractandinterface1;

public interface IFAnimal {
	
	//Có phương thức abstract (không có thân hàm) 
	public abstract void run();
	
	//phương thức default 
	default void smile() {
		System.out.println("Động vật cười hahaha");
	}
	//phương thức static
	static void sleep() {
		System.out.println("Động vật ngủ zzzz");
	}
}
