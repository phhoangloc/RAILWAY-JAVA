package constructors.demo;

public class Programm {

	public static void main(String[] args) {
		// hàm khởi tạo không tham số

		Student student = new Student();
		student.id = 1;
		student.name = "nguyen c";
		System.out.println(student.id);
		System.out.println(student.name);

		System.out.println("//////////////////");
		
		// hàm khởi tạo 2 tham số

		Student student1 = new Student(1, "nguyen a");
		System.out.println(student1.id);
		System.out.println(student1.name);
		System.out.println(student1.soTay);
		System.out.println(student1.soChan);
		System.out.println(student1.abc);

		System.out.println("//////////////////");
		// hàm khởi tạo 4 tham số

		Student student2 = new Student(1, "nguyen b", 1, 1);

		System.out.println(student2.id);
		System.out.println(student2.name);
		System.out.println(student2.soTay);
		System.out.println(student2.soChan);

	}

}
