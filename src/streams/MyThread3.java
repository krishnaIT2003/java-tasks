package streams;

import java.util.ArrayList;
import java.util.Arrays;


public class MyThread3 extends Thread{
	
	ArrayList<Integer>list=new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
	
public void run() {
	for(int i=1;i<=1000;i++) {
		list.add(i);
	}
}

public void display() {
	System.out.println(this.list);
}
}
