package commonexample;

public class Date {
	private int day;
	private int month;
	private int year;
	
	public void createDate(int d, int m, int y) {
		if(d>30) {
			System.out.println("Day can not be greater than 30");
			System.exit(0);
		}
		if(m>12) {
			System.out.println("Month can not be  greater than 12");
			System.exit(0);
		}
		if(y > 1996 && y < 2019) {
			System.out.println(y);
			System.out.println("year must be between 1996 to 2019 ");
			System.exit(0);
		}
		day = d;
		month = m;
		year = y;
		
	}
	public String getDetails() {
		return day+"-"+month + "-" + year;
	}
	public int getDate() { 
		return day;
	}
	public int getMonth() {
		return month;
	}
	public int getYear() {
		return year;
	}
	public boolean setdate(int d) {
		if(d>30) {
			
			System.out.println("Day can not be greater than 30");
			return false;
		}
		day = d;
		return true;
	}
	public boolean setMonth(int m) {
		if(m>12) {
			
			System.out.println("Month can not be  greater than 12");
			return false;
		}
		month = m;
		return true;
		
	}
	public boolean setYear(int y) {
		if(y > 1996 && y < 2019) {
			
			System.out.println("year must be between 1996 to 2019 year must be between 1996 to 2019 ");
			return false;
		}
		year = y;
		return true;
		
	}



}
