package constructor.chaining;

public class ConstructorChaining {
	private int x;
	private int y;
	private int z;
	public ConstructorChaining() {
		this(10);
	}
	public ConstructorChaining(int a) {
		this(a,20);
	}
	public ConstructorChaining(int a,int b) {
		this.x=a;
		this.y=b;
		this.z=30;
	}
	public void getConsDetails() {
		System.out.println(x);
		System.out.println(y);
		System.out.println(z);
	}
	
}
