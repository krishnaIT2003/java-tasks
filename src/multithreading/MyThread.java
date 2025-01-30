package multithreading;

public class MyThread extends Thread{
	
	MyThread(String name){
		super(name);
	}
@Override
	public void run() {
		for(int i=0;i<10;i++) {
			  System.out.println(getName() + ": Java is hot, aromatic, and invigorating!");
			  try {
	              
	                Thread.sleep(500); 
	            } catch (InterruptedException e) {
	                System.out.println(getName() + " was interrupted.");
	            }
		}
	}
}
