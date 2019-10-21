package greaterlesser;

public class Calculate extends Model {
	private int startpt, endpt;
	public Calculate() {
		
	}
	public Calculate(int a, int b) {
		this.startpt=a;
		this.endpt=b;
	}
	public int getend() {
		return this.endpt;
	}
	public int calculateLen(Object obj) {
		System.out.println(obj.startpt);
		System.out.println(obj.endpt);
		return this.endpt- this.startpt;
	}
	
	@Override
	public boolean isGreater(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		Calculate c1 = (Calculate)obj1;
		Calculate c2 = (Calculate)obj2;
		return calculateLen(c1)>calculateLen(c2);
	}

	@Override
	public boolean isLesser(Object obj1, Object obj2) {
		// TODO Auto-generated method stub
		return false;
	}
	
}
