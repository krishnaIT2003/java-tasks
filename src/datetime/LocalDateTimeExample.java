package datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeExample {
public static void main(String[] args) {
	 LocalDateTime now = LocalDateTime.now();
     System.out.println("Current Date and Time: " + now);
     
     
     //Adding/Subtracting  time
     LocalDateTime nextmonth=now.plusMonths(2).plusHours(3);
     System.out.println("next 2 months + 3 Hours "+nextmonth);
     
     
     //Formatting 
     DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");
     LocalDateTime meeting = LocalDateTime.of(2025, 2, 4, 10, 30);
     
     System.out.println("Formatted DateTime: " + meeting.format(formatter));
     
}
}
