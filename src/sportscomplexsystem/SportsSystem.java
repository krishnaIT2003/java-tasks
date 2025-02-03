package sportscomplexsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SportsSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        SportsSlot slots = new SportsSlot();
        slots.initializeSlots();

        while (true) {
            System.out.println("\nEnter username (enter 'exit' to quit):");
            String username = sc.next();
            if (username.equalsIgnoreCase("exit")) {
                System.out.println("Exited successfully. Thank you!");
                break;
            }

            if (!isValidUsername(username)) {
                System.out.println("Invalid username. Please enter a username without numbers.");
                continue;
            }

            displaySports();
            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number (1/2/3).");
                sc.next(); // Clear invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    slots.bookBadmintonSlot(sc);
                    break;
                case 2:
                    slots.bookCricketSlot(sc);
                    break;
                case 3:
                    slots.bookFootBallSlot(sc);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter 1, 2, or 3.");
            }
        }
        sc.close();
    }

    private static boolean isValidUsername(String username) {
        return username.matches("[a-zA-Z]+");
    }

    public static void displaySports() {
        System.out.println("\nAvailable Sports:");
        System.out.println("1. Badminton");
        System.out.println("2. Cricket");
        System.out.println("3. Football");
        System.out.println("Enter your choice (1/2/3):");
    }
}
