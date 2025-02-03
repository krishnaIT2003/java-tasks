package task;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();

       
        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 100; i++) {
                vector.add(i);
                System.out.println("Thread 1 added: " + i);
            }
        });

      
        Thread thread2 = new Thread(() -> {
            for (int i = 5; i < 100; i++) {
                vector.add(i);
                System.out.println("Thread 2 added: " + i);
            }
        });

        thread1.start();
        thread2.start();
    }
}
