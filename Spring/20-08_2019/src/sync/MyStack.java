package sync;

public  class MyStack {
	private int max=26;
	private char[] stackbuff = new char[max];
	private int index=-1;
	public synchronized void push(char item) throws InterruptedException {
			
				if(index==max) {
					System.out.println("stack overflow");
					wait();
				}
				System.out.println("Producer is active now");
				stackbuff[++index]=item;
				System.out.println(stackbuff[index]);
				//System.out.println(index);
				notify();
			
		}
	public synchronized char pop() throws InterruptedException{
		if(index==-1) {
			System.out.println("stack underflow");
			wait();
		}
		notify();
		return stackbuff[index--];
	}
		
	}

