package ch.bbcag.ch.User;

public class User {
	private int id;
	private String vorname;
	private String name;
	private String email;
	private String username;
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getVorname() {
		return vorname;
	}

	public void setVorname(String vorname) {
		this.vorname = vorname;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String toString() {
		String result = "";
		result += "****************User "+ getId() + "****************\n\n";
		result += "Id: " + getId() + "\n";
		result += "Vorname: " + getVorname() + "\n";
		result += "Name: " +getName() + "\n";
		result += "E-Mail: " + getEmail() + "\n";
		result += "Username: " + getUsername() + "\n";
		result += "Password: " + getPassword() + "\n\n" ;
		result += "**************************************\n";
		return result;
	}
}
