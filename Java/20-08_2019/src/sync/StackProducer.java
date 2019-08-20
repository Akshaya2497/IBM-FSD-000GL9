package sync;

public class StackProducer implements Runnable {
	private MyStack mystack;
	public StackProducer( MyStack _mystack) {
		super();
		this.mystack= _mystack;
	}
	@Override
	public void run() {
		for(int i=0;i<26;i++)
		{
			try {
				mystack.push((char) ((char)i+65));
				//mystack.push('A');
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
