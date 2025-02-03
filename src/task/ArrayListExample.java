package task;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        // Thread 1: Adds values
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 500; i++) {
                list.add(i);
                System.out.println("Thread 1 added: " + i);
            }
        });

        // Thread 2: Adds values
        Thread thread2 = new Thread(() -> {
            for (int i = 5; i < 100; i++) {
                list.add(i);
                System.out.println("Thread 2 added: " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}
