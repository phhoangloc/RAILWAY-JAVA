package entity;

public class User {
	private int id;
	private String fullName;
	private String userName;
	private String email;
	private String password;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getFullName() {
		return fullName;
	}


	public void setFullName(String fullName) {
		this.fullName = fullName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", userName=" + userName + ", email=" + email
				+ ", password=" + password + "]";
	}


	public User(int id,String fullname, String username, String email, String password) {
		this.id=id;
		this.fullName=fullname;
		this.userName=username;
		this.email=email;
		this.password=password;
	}
}
