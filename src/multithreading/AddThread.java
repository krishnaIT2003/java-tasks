package multithreading;

public class AddThread extends Thread {
    private int[] numbers;
    private final SharedData sharedData;

    AddThread(int[] numbers, SharedData sharedData) {
        if (numbers == null || sharedData == null) {
            throw new IllegalArgumentException("Input array and sharedData cannot be null");
        }
        this.numbers = numbers;
        this.sharedData = sharedData;
    }

    @Override
    public void run() {
        if (numbers.length == 0) {
            System.out.println("AddThread: No numbers to sum.");
            sharedData.sum = 0;
            sharedData.isAddComplete = true;
            return;
        }

        int total = 0;
        try {
            for (int i : numbers) {
                total += i;
            }
            sharedData.sum = total;
            sharedData.isAddComplete = true;
            System.out.println("AddThread: Sum calculated as " + total);
        } catch (Exception e) {
            System.out.println("AddThread: Error during calculation: " + e.getMessage());
            sharedData.isAddComplete = false;
        }
    }
}
