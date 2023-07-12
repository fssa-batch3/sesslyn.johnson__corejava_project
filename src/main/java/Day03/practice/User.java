package Day03.practice;

public class User {
	String name;
	String password;
	String email;
	int id;
	
	public User(){
		
	}
	
	public User(String name, String email, String password) {
		this.name = name;
		this.email = email;
	   this.password = password;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

}
