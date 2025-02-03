package sportscomplexsystem;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SportsSlot {
    Map<String, Map<Integer, String>> sportsSlots = new HashMap<>();

    public void bookBadmintonSlot(Scanner sc) {
        bookSlot(sc, "Badminton");
    }

    public void bookFootBallSlot(Scanner sc) {
        bookSlot(sc, "FootBall");
    }

    public void bookCricketSlot(Scanner sc) {
        bookSlot(sc, "Cricket");
    }

    private void bookSlot(Scanner sc, String sport) {
        Map<Integer, String> slots = sportsSlots.get(sport);
        if (slots == null || slots.isEmpty()) {
            System.out.println("No available slots for " + sport + ". Please try another sport.");
            return;
        }

        while (true) {
            System.out.println("Available slots: " + slots.values());
            System.out.println("Enter the slot number to book:");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Please enter a valid slot number.");
                sc.next(); // Consume invalid input
                continue;
            }

            int slotNumber = sc.nextInt();

            if (slots.containsKey(slotNumber)) {
                String slotDetails = slots.get(slotNumber);
                slots.remove(slotNumber); // Remove the slot after booking
                System.out.println("Successfully booked " + sport + " slot: " + slotDetails);
                break;
            } else {
                System.out.println("Slot not available. Please choose from the available slots.");
            }
        }
    }

    public void initializeSlots() {
        Map<Integer, String> badmintonMap = new HashMap<>();
        for (int i = 1; i <= 10; i++) {
            badmintonMap.put(i, "Slot " + i + " (9:00 to 10:00)");
        }
        sportsSlots.put("Badminton", badmintonMap);

        Map<Integer, String> footBallMap = new HashMap<>();
        for (int i = 1; i <= 20; i++) {
            footBallMap.put(i, "Slot " + i + " (10:00 to 10:30)");
        }
        sportsSlots.put("FootBall", footBallMap);

        Map<Integer, String> cricketMap = new HashMap<>();
        for (int i = 1; i <= 5; i++) {
            cricketMap.put(i, "Slot " + i + " (10:30 to 12:30)");
        }
        sportsSlots.put("Cricket", cricketMap);
    }
}
