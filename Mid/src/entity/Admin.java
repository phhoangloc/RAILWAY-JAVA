package entity;

public class Admin extends User {
	public Admin(int id, String fullname, String username, String email, String password,int expInYear) {
		super(id, fullname, username, email, password);
		// TODO Auto-generated constructor stub
		this.expInYear=expInYear;
	}

	public int getExpInYear() {
		return expInYear;
	}

	public void setExpInYear(int expInYear) {
		this.expInYear = expInYear;
	}

	@Override
	public String toString() {
		return "User [id=" + getId() + ", fullName=" + getFullName() + ", userName=" + getUserName() + ", email=" + getEmail()
				+ ", password=" + getPassword() + "]"+"Admin [expInYear=" + expInYear + "]";
	}

	private int expInYear;
}
