package multithreading;

public class AverageThread extends Thread{
int num[];
private final SharedData sharedData;
public AverageThread(int num[],SharedData sharedData) {
this.num=num;
this.sharedData=sharedData;
}
@Override
public void run() {
	if(!sharedData.isAddComplete) {
		Thread.yield();
	}
	double avg=sharedData.sum/(double)num.length;
	sharedData.average=avg;
	sharedData.isAverageComplete=true;
System.out.println("Average calculate "+avg);
}

}
