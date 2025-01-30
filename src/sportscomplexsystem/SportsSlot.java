package sportscomplexsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SportsSlot {
	Map<String,Map<Integer,String>> sportsSlots=new HashMap<>();
	
	
	public void bookBadmintonSlot(Scanner sc) {
		Map<Integer, String> badmintonSlots = sportsSlots.get("Badminton");
		while(true) {
			System.out.println(badmintonSlots.values());
			System.out.println("enter slot to book");
			int slotBook=sc.nextInt();
			
			
			if(badmintonSlots.containsKey(slotBook)) {
				String string = badmintonSlots.get(slotBook);
			sportsSlots.remove(badmintonSlots.remove(slotBook));
				System.out.println("sucessfully booked badminton slot  "+string);
				break;
			}
			else {
				System.out.println("unable to find slot please choose the available slots");
			}
		}
		
	}
	public void bookFootBallSlot(Scanner sc) {
		Map<Integer, String> footBallSlots = sportsSlots.get("FootBall");
		while(true) {
			System.out.println(footBallSlots.values());
			System.out.println("enter available slot number to book");
			int slotBook=sc.nextInt();
			if(footBallSlots.containsKey(slotBook)) {
				String string = footBallSlots.get(slotBook);
				sportsSlots.remove(footBallSlots.remove(slotBook));
				System.out.println("sucessfully booked football slot "+string );
				break;
			}
			else {
				System.out.println("unable to find slot please choose the available slots");
			}
		}
	}
	public void bookCricketSlot(Scanner sc) {
		Map<Integer, String> cricketSlots = sportsSlots.get("Cricket");
		while(true) {
			System.out.println(cricketSlots.values());
			System.out.println("enter available slot number to book");
			int slotBook=sc.nextInt();
			if(cricketSlots.containsKey(slotBook)) {
				String string = cricketSlots.get(slotBook);
				sportsSlots.remove(cricketSlots.remove(slotBook));
				System.out.println("sucessfully booked cricket slot "+string);
				break;
			}
			else {
				System.out.println("unable to find slot please choose the available slots");
			}
			
		}
	}
	
	
	public void initializeSlots() {
		Map<Integer,String> badmintonMap=new HashMap<Integer, String>();
		for(int i=1;i<=10;i++) {
			badmintonMap.put(i, "slot"+i+" (9:00 to 10:00)");
		}
		sportsSlots.put("Badminton", badmintonMap);
		Map<Integer,String> footBallMap=new HashMap<Integer, String>();
		for(int i=1;i<=20;i++) {
			footBallMap.put(i, "slot"+i+" (10:00 to 10:30)");
		}
		sportsSlots.put("FootBall", footBallMap);
		Map<Integer,String> cricketMap=new HashMap<Integer, String>();
		for(int i=1;i<=5;i++) {
			cricketMap.put(i, "slot"+i+" (10:30 to 12:30)");
		}
		sportsSlots.put("Cricket", cricketMap);
	}
}
