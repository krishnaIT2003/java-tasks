package parkingsystem;

import java.util.List;

public class ParkingSlot {
private int slotNumber;
private boolean isOccupied;
private String vehicleType;
private String vehicleRegNo;
public ParkingSlot(int slotNumber) {
	this.slotNumber=slotNumber;
	this.vehicleType="";
	this.vehicleRegNo="";
	this.isOccupied=false;
}


public void parkVehicle(String vehicleType,String vehicleRegNo) {
	this.isOccupied=true;
	this.vehicleType=vehicleType;
	this.vehicleRegNo=vehicleRegNo;
}
public void leaveSlot() {
    this.isOccupied = false;
    this.vehicleType = "";
    this.vehicleRegNo = "";
}
public String generateReceipt() {
    if (isOccupied) {
        return "Slot No: " + slotNumber + " | Vehicle Type: " + vehicleType + " | Vehicle Reg No: " + vehicleRegNo;
    }
    return "Slot No: " + slotNumber + " is empty.";
}


public int getSlotNumber() {
	return slotNumber;
}
public void setSlotNumber(int slotNumber) {
	this.slotNumber = slotNumber;
}
public boolean isOccupied() {
	return isOccupied;
}
public void setOccupied(boolean isOccupied) {
	this.isOccupied = isOccupied;
}
public String getVehicleType() {
	return vehicleType;
}

public String getVehicleRegNo() {
	return vehicleRegNo;
}


}
