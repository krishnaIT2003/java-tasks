package parkingsystem;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ParkingLot {
	private List<ParkingSlot> bikeSlots;
	private List<ParkingSlot> carSlots;
	public ParkingLot() {
		this.bikeSlots=new ArrayList<ParkingSlot>();
		this.carSlots=new ArrayList<ParkingSlot>();
		for(int i=1;i<=30;i++) {
			bikeSlots.add(new ParkingSlot(i));
			carSlots.add(new ParkingSlot(i));
		}
	
	}
	public String allocateSlot(String vehicleType,String vehicleRegNo) {
		List<ParkingSlot> availableSlots=vehicleType.equalsIgnoreCase("bike")?bikeSlots:carSlots;
		
		for(ParkingSlot slots:availableSlots) {
			if(!slots.isOccupied()) {
				slots.parkVehicle(vehicleType, vehicleRegNo);
				return slots.generateReceipt();
			}
		}
		 return "No available slots for " + vehicleType + ".";
	}
	
	public void generateReceiptToFile() throws IOException {
		try(FileWriter writer=new FileWriter(new File("parking_receipt.txt"))){
			writer.write("Parking slot Allocations \n");
			for(ParkingSlot slot:bikeSlots) {
				if(slot.isOccupied()) {
				writer.write(slot.generateReceipt());
				writer.append("\n");
				}
			}
			for(ParkingSlot slot:carSlots) {
				if(slot.isOccupied()) {
				writer.write(slot.generateReceipt());
				writer.append("\n");
				}
			}
		}
		 catch (IOException e) {
	            e.printStackTrace();
	        }
		
	}
	
}
