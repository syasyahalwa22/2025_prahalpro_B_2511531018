package pekan7_2511531018;

public class Akun {
	private String username;
	private String password;
	private String email;
	private int pinAngka;
	
	public void setUsername(String username) {
		this.username=username;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	public void setEmail(String email) {
		this.email=email.toLowerCase();
	}
	public void setPinAngka(int pinAngka) {
		this.pinAngka=pinAngka;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail() {
		return email;
	}
	public int getPinAngka() {
		return pinAngka;
	}
	
	public boolean isPasswordValid() {
		return password != null && password.length() >= 8;
	}
	public boolean isEmailValid() {
		return email != null && email.contains("@") && email.contains(".");
	
		
	}
	
}
