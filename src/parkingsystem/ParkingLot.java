package parkingsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
    private List<ParkingSlot> bikeSlots;
    private List<ParkingSlot> carSlots;

    public ParkingLot(int numBikeSlots, int numCarSlots) {
        if (numBikeSlots <= 0 || numCarSlots <= 0) {
            throw new IllegalArgumentException("Number of slots must be positive.");
        }
        this.bikeSlots = new ArrayList<>();
        this.carSlots = new ArrayList<>();
        
        for (int i = 1; i <= numBikeSlots; i++) {
            bikeSlots.add(new ParkingSlot(i));
        }
        for (int i = 1; i <= numCarSlots; i++) {
            carSlots.add(new ParkingSlot(i));
        }
    }

    public String allocateSlot(String vehicleType, String vehicleRegNo) {
        List<ParkingSlot> availableSlots = vehicleType.equalsIgnoreCase("bike") ? bikeSlots : carSlots;

        // Check available slot
        for (ParkingSlot slot : availableSlots) {
            if (!slot.isOccupied()) {
                slot.parkVehicle(vehicleType, vehicleRegNo);
                return slot.generateReceipt();
            }
        }

        return "No available slots for " + vehicleType + ". Please try again later.";
    }

    public void generateReceiptToFile() throws IOException {
        try (FileWriter writer = new FileWriter(new File("parking_receipt.txt"))) {
            writer.write("Parking slot Allocations \n");
            for (ParkingSlot slot : bikeSlots) {
                if (slot.isOccupied()) {
                    writer.write(slot.generateReceipt());
                    writer.append("\n");
                }
            }
            for (ParkingSlot slot : carSlots) {
                if (slot.isOccupied()) {
                    writer.write(slot.generateReceipt());
                    writer.append("\n");
                }
            }
        }
    }
}
