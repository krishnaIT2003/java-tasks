package multithreading;

public class MyThread2 extends Thread{

	
	MyThread2(String name){
		super(name);
	}
	public void run() {
		for(int i=1;i<=5;i++) {
			System.out.println(Thread.currentThread().getName()+" "+i);
			try {
			Thread.sleep(500);	
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
}
