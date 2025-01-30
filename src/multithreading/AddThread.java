package multithreading;

public class AddThread extends Thread{
private int numbers[];
	private final SharedData sharedData;
	
	AddThread(int numbers[],SharedData sharedData){
		this.numbers=numbers;
		this.sharedData=sharedData;
	}
	@Override
	public void run() {
		int total=0;
		for(int i:numbers) {
			total+=i;
		}
		sharedData.sum=total;
		sharedData.isAddComplete=true;
		System.out.println("AddThread: Sum calculated as " + total);
	}
}
