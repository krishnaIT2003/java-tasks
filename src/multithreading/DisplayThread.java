package multithreading;

public class DisplayThread extends Thread{
private final SharedData sharedData;
public DisplayThread(SharedData sharedData) {
	this.sharedData=sharedData;
	
}
public void run() {
	if(!sharedData.isAddComplete || !sharedData.isAverageComplete) {
		Thread.yield();
	}
	 System.out.println("DisplayThread: Final Results");
     System.out.println("Sum: " + sharedData.sum);
     System.out.println("Average: " + sharedData.average);
}
}
