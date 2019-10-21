package sync;

public class ProducerConsumerTester {
	private final static MyStack myStack=new MyStack();	
	public static void main(String[] args) {
		 Thread prodThread = new Thread(new StackProducer(myStack), "Producer");
	      Thread consThread = new Thread(new StackConsumer(myStack), "Consumer");
	        prodThread.start();
	        consThread.start();

	}

}
