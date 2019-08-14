package exception;
import java.io.Serializable;


public class NameCheck implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -1879965609119614730L;
	public String fName;
	private String lName;
	public NameCheck() {
		
	}
	public NameCheck(String _fname, String _lname) {
		this.fName=_fname;
		this.lName=_lname;
		//System.out.println(this.lName.charAt(0)=='S');
		
	}
	
	
	public void checkname() throws NameNotValidException {
		//System.out.println(lName.charAt(0)=='S');
		if(!(fName.charAt(0)<='Z' && fName.charAt(0)>='A')) {
		throw new NameNotValidException("First name not valid");
		
	    }
		else if(!(lName.charAt(0)<='Z' && lName.charAt(0)>='A')) {
			throw new NameNotValidException("Last name not valid");
		} 
		
		else
			System.out.println("Name added successfully");
		
	}
	
	
	public void checkduplicate(Object obj1, Object obj2) throws OjectSameException {
		if(obj1.equals(obj2))
			throw new OjectSameException("Account already exists");
		else 
			System.out.println("Account created successfully");
	}
	
	public boolean equals(Object obj)  {
		NameCheck nc =  (NameCheck) obj;
		System.out.println("this"+this.fName);
		System.out.println("nc"+nc.fName);
		
		if(this.fName.equals(nc.fName)  && this.lName.equals(nc.lName)) {			
			return true;			
		}		
		return false;
	}

}
