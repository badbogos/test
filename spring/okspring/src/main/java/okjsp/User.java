package okjsp;

public class User {
	private String id;
	private String pwd;
	private String confirmpwd;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	public String getConfirmpwd() {
		return confirmpwd;
	}
	public void setConfirmpwd(String confirmpwd) {
		this.confirmpwd = confirmpwd;
	}

	public boolean isOk()
	{
		boolean isOk = (id != null) && id.equals("admin") && (pwd != null) && pwd.equals("pass"); 				
		return isOk;
	}
	
}
