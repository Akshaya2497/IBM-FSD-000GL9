package account;

public class Accounteq {
	private int num;
	public Accounteq(int n) {
		this.num = n;
	}
	public boolean equals(Object obj) {
		Accounteq acc =  (Accounteq) obj;
		if(this.num == acc.num) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		num = 100;
		return "Accounteq [num=" + num + "]";
	}
	
}
