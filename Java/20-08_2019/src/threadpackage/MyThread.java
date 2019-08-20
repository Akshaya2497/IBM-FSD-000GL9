package threadpackage;

public class MyThread implements Runnable{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread Thread1 =  new MyThread();
		MyThread Thread2 =  new MyThread();
		Thread t1 =  new Thread(Thread1);
		Thread t2 =  new Thread(Thread2);
		t1.start();
		System.out.println("new");
		t2.start();
	}
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println(i);
			if(i==10)
				//Thread.sleep(2000);
				Thread.yield();
		}
	}

}
