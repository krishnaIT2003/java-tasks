package datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateExample {
public static void main(String[] args) {
	 LocalDate today = LocalDate.now();
	 System.out.println("Today's Date: " + today);
	 
	 //my fixed birthday
	 LocalDate myBirthday = LocalDate.of(2003, 4, 10);
	 System.out.println("Birthday "+myBirthday);
	 
	 //adding subtracting dates
	 LocalDate nextWeek = today.plusDays(7);
     System.out.println("Next Week: " + nextWeek);
     
     //formatdate
     DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("dd/MM/yyyy");
     System.out.println("Formatted Date: " + today.format(dateTimeFormatter));
     
     
     //comparing dates
     boolean before = myBirthday.isBefore(today);
     System.out.println("isBefore "+before);
     
}
}
