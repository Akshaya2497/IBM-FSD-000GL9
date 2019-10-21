package userpack;

import comm.users.UserDao;

public class Users {
	private String name,pass;
	public Users() {
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}
	public String validate(String _name,String _pass) {
		UserDao user = new UserDao();
		
		if(user.isValid(_name, _pass)==1)
			return "VALID";
		return "INVALID";			
	}
	
}
