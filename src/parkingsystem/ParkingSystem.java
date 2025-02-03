package parkingsystem;

import java.io.IOException;
import java.util.Scanner;

public class ParkingSystem {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        // Dynamic slot allocation from user
        System.out.println("Enter the number of bike slots:");
        int numBikeSlots = getValidSlotCount(scanner);

        System.out.println("Enter the number of car slots:");
        int numCarSlots = getValidSlotCount(scanner);

        // Initialize ParkingLot with user-defined slot counts
        ParkingLot parkingLot = new ParkingLot(numBikeSlots, numCarSlots);

        // Continuously accept vehicle parking requests
        while (true) {
            System.out.println("\nEnter vehicle type (Bike/Car) or type 'exit' to quit:");
            String vehicleType = scanner.nextLine();

            if (vehicleType.equalsIgnoreCase("exit")) {
                System.out.println("Exiting parking system.");
                break;
            }

            // Validate vehicle type
            if (!vehicleType.equalsIgnoreCase("bike") && !vehicleType.equalsIgnoreCase("car")) {
                System.out.println("Invalid vehicle type! Please enter 'Bike' or 'Car'.");
                continue;
            }

            System.out.println("Enter vehicle registration number:");
            String vehicleRegNo = scanner.nextLine();

            // Validate registration number
            if (vehicleRegNo.isEmpty()) {
                System.out.println("Vehicle registration number cannot be empty.");
                continue;
            }

            System.out.println(parkingLot.allocateSlot(vehicleType, vehicleRegNo));
        }

        // Save receipt details to file
        parkingLot.generateReceiptToFile();
        System.out.println("Receipts have been saved to 'parking_receipt.txt'");
    }

    // Helper method to get a valid slot count (positive integer)
    private static int getValidSlotCount(Scanner scanner) {
        int slotCount = -1;
        while (slotCount <= 0) {
            try {
                slotCount = Integer.parseInt(scanner.nextLine());
                if (slotCount <= 0) {
                    System.out.println("Please enter a positive number of slots.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid integer.");
            }
        }
        return slotCount;
    }
}
