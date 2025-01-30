package datetime;

import java.time.LocalTime;

public class LocalTimeExample {
public static void main(String[] args) {
	LocalTime now = LocalTime.now();
    System.out.println("Current Time: " + now);

    
    // Creating a specific time
    LocalTime noon = LocalTime.of(12, 0);
    System.out.println("Noon: " + noon);

    // Comparing times
    boolean isBefore = now.isAfter(noon);
    System.out.println("Is it After noon? " + isBefore);
    
}
}
