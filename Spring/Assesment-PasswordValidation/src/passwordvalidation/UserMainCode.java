package passwordvalidation;

public class UserMainCode {
	public static boolean checkPassword(String password){
		if(password.length()<8) {
			return false;
		}
		int lc=0,uc=0,di=0,sp=0;
		for(int i=0;i<password.length();i++) {
			char c=password.charAt(i);
			if(Character.isLowerCase(c))
				lc++;
			else if(Character.isUpperCase(c))
				uc++;
			else if(Character.isDigit(c))
				di++;
			else 
				sp++;
		}
		if(lc>=1 && uc>=1 && di>=1 && sp>=1)
			return true;
		return false;
	}
}
