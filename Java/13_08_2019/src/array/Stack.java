package array;

public class Stack {

	private int[] arr= new int[5];
	private static int i=0;
	public int pusharr(int a) {
		if(i>=5) {
			System.out.println("Overflow");
			return 0;
		}
		arr[i]=a;
		i++;
		return 1;
	}
	public int poparr() {
		if(i<0) { 
			System.out.println("underflow");
			return 0;
		}
		i--;
		return 1;
	}
	public void  show() {
		for(int j=0;j<i;j++)
			System.out.println(arr[j]);
	}
}
