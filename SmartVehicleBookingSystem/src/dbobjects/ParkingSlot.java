package dbobjects;

//Parking Slot takes care of ParkingSlots in a DockingStation.
//Each Parking Slot is associated with a Smart Vehicle or is empty
public class ParkingSlot {
	int parkingSlotID;
	SmartVehicle vehicle; //Create a vehicle object and use it to access vehicle details

	public int getParkingSlotID() {
		return parkingSlotID;
	}

	public void setParkingSlotID(int parkingSlotID) {
		this.parkingSlotID = parkingSlotID;
	}

	public SmartVehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(SmartVehicle vehicle) {
		this.vehicle = vehicle;
	}

}
