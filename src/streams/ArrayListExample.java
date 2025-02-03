package streams;

import java.util.ArrayList;
import java.util.Arrays;


public class ArrayListExample {
public static void main(String[] args) {
	MyThread3 thread=new MyThread3();
	MyThread3 thread2=new MyThread3();
	MyThread3 thread3=new MyThread3();
	thread.start();
	thread2.start();
	thread3.start();
	thread.setName("t1");
	thread2.setName("t2");
	thread3.setName("t3");
	try {
		thread.join();
		thread2.join();
		thread3.join();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}
	thread.display();
}
}
