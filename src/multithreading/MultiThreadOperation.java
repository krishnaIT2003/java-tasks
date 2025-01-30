package multithreading;

public class MultiThreadOperation {
public static void main(String[] args) {
	int[] numbers= {10,20,30,40,50};
	SharedData sharedData=new SharedData();
	AddThread addThread=new AddThread(numbers, sharedData);
	AverageThread averageThread=new AverageThread(numbers, sharedData);
	DisplayThread displayThread=new DisplayThread(sharedData);
	
	addThread.start();
	averageThread.start();
	displayThread.start();
	try {
		addThread.join();
		averageThread.join();
		displayThread.join();
	}
	catch(InterruptedException e) {
		System.out.println(e.getMessage());
	}
}
}
