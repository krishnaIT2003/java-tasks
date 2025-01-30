package multithreading;

public class ConcurrentExample {
public static void main(String[] args) {
	MyThread t1=new MyThread("t-1");
	MyThread t2=new MyThread("t-2");
t1.start();
t2.start();
}
}
