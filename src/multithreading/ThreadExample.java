package multithreading;

public class ThreadExample {
	 private static void printThreadDetails(Thread thread) {
	        System.out.println("Thread Name: " + thread.getName());
	        System.out.println("Thread ID: " + thread.getId());
	        System.out.println("Thread State: " + thread.getState());
	        System.out.println("Thread Priority: " + thread.getPriority());
	        System.out.println("Is Daemon: " + thread.isDaemon());
	        System.out.println("Is Alive: " + thread.isAlive());
	        System.out.println("----------------------------------------");
	    }
public static void main(String[] args) {
	MyThread2 t1=new MyThread2("krishna");
	MyThread2 t2=new MyThread2("thread2");
	MyThread2 t3=new MyThread2("thread3");
	t1.setDaemon(true);
	 t1.start();
	 t2.start();
	 t3.start();
	  printThreadDetails(t1);
	     printThreadDetails(t2);
	     printThreadDetails(t3);
     try {
         t1.join();
         t2.join();
         t3.join();
     } catch (InterruptedException e) {
         e.printStackTrace();
     }
   
 }
	 
}

