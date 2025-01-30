package sportscomplexsystem;

import java.util.Scanner;

public class SportsSystem {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	SportsSlot slots=new SportsSlot();
	slots.initializeSlots();
	
	while(true) {
		System.out.println("enter username (enter exit to quit)");
		String username=sc.next();
		if(username.equalsIgnoreCase("exit")) {
			System.out.println("exited sucessfully");
			break;
		}
		displaySports();
		int choice=sc.nextInt();
		switch(choice) {
		case 1:
			slots.bookBadmintonSlot(sc);
			break;
		case 2:
			slots.bookCricketSlot(sc);
			break;
			
		case 3:
			slots.bookFootBallSlot(sc);
			break;
			default: System.out.println("please enter valid choice");
		}
		
		
	}
}



public static void displaySports() {
	System.out.println("1.Badminton");
	System.out.println("2.FootBall");
	System.out.println("3.Cricket");
	System.out.println("enter your choice 1/2/3");
}
}
