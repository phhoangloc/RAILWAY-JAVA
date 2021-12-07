package bin.entity;

public class Department {
	private int id;
	private String name;
	
	public Department(int idd,String named) {
		this.id=idd;
		this.name=named;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", name=" + name + "]";
	}
	
}
