package sync;

public class StackConsumer implements Runnable{
	private MyStack mystack;
	public StackConsumer( MyStack _mystack) {
		super();
		this.mystack= _mystack;
	}
	@Override
	public void run() {
		for(int i=0;i<26;i++)
		{
			try {
				System.out.println(mystack.pop());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
