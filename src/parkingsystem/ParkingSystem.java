package parkingsystem;

import java.io.IOException;

public class ParkingSystem {
public static void main(String[] args) throws IOException {
	 ParkingLot parkingLot = new ParkingLot();
	 System.out.println(parkingLot.allocateSlot("Bike", "KA234"));
     System.out.println(parkingLot.allocateSlot("Car", "KD5678"));
     System.out.println(parkingLot.allocateSlot("Bike", "F9101"));
     parkingLot.generateReceiptToFile();
     System.out.println("Receipts have been saved to 'parking_receipt.txt'");
}
}
