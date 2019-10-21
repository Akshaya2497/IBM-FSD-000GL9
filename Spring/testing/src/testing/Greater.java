package testing;

import junit.textui.TestRunner;

public class Greater {

	private int x,y;
	
	public Greater() {
		
	}
	public Greater(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	public boolean findGreater() {
		if(this.x>this.y)
			return true;
		return false;
	}
	public boolean findLesser() {
		if(this.x<this.y)
			return true;
		return false;
	}
	public int add() {
		return this.x+this.y;
	}
	public int sub() {
		return this.x-this.y;
		
	}

	
}
