package dbobjects;

import java.time.LocalDateTime;
import java.util.List;

//Each docking station contains some 'n' parking slots.
//Each slot will have one vehicle or is an empty slot.

public class DockingStation {

	String dockingStationID;
	List<SmartVehicle> availableVehicles;
	List<ParkingSlot> parkingSlots;
	int dockingStationCapacity;
	String dockStationLocation;

	public String getDockingStationID() {
		return dockingStationID;
	}

	public void setDockingStationID(String dockingStationID) {
		this.dockingStationID = dockingStationID;
	}

	public List<SmartVehicle> getAvailableVehicles() {
		//returns the List of available vehicles in each docking station.
		return availableVehicles;
	}

	public void setAvailableVehicles(List<SmartVehicle> availableVehicles) {
		this.availableVehicles = availableVehicles;
	}

	public List<ParkingSlot> getParkingSlots() {
		return parkingSlots;
	}

	public void setParkingSlots(List<ParkingSlot> parkingSlots) {
		this.parkingSlots = parkingSlots;
	}

	public int getDockingStationCapacity() {
		return dockingStationCapacity;
	}

	public void setDockingStationCapacity(int dockingStationCapacity) {
		this.dockingStationCapacity = dockingStationCapacity;
	}

	public String getDockStationLocation() {
		return dockStationLocation;
	}

	public void setDockStationLocation(String dockStationLocation) {
		this.dockStationLocation = dockStationLocation;
	}

}
