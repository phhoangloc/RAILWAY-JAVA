package entity;

public class Employee extends User{
	public Employee(int id, String fullname, String username, String email, String password,String proskill) {
		super(id, fullname, username, email, password);
		// TODO Auto-generated constructor stub
		this.proSkill=proskill;
	}

	public String getProSkill() {
		return proSkill;
	}

	public void setProSkill(String proSkill) {
		this.proSkill = proSkill;
	}

	private String proSkill;

	@Override
	public String toString() {
		return "User [id=" + getId() + ", fullName=" + getFullName() + ", userName=" + getUserName() + ", email=" + getEmail()
				+ ", password=" + getPassword() + "]"+"Employee [proSkill=" + proSkill + "]";
	}
	
	
}
