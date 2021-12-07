package constructors.demo;

public class Student {
	int id;
	String name;
	int soTay;
	int soChan;
	String abc;

	public Student() {

	}

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
		this.soTay = 2;
		this.soChan = 2;
		this.abc = "abc";
	}

	public Student(int id, String name, int soTay, int soChan) {
		super();
		this.id = id;
		this.name = name;
		this.soTay = soTay;
		this.soChan = soChan;
	}

}
