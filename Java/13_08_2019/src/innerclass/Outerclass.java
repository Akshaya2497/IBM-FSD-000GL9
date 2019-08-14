package innerclass;

public class Outerclass {
	private int x=10,y=20;
	public void show(int a,int b) {
		this.x=a;
		this.y=b;
		System.out.println("x= "+x+" y="+y);
	}
	public class Innerclass{
		public void showinner() {
			x=5;
			y=5;
			show(x,y);			
		}
		public class Innerclass2{
			public void showinner2() {
				x=0;
				y=0;
				show(x,y);
			}
		}
	}
}
