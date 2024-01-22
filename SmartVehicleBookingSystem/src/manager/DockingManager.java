package manager;

import java.util.*;

public class DockingManager {
	
	//takes care of the DockingStation. Each docking station contains some n parking slots.
	//Each slot will have one vehicle or is empty.
	
List<String> dockingStation;
Map<String, List<String>> ParkingSlots;


private String parkingSlotIDGenerator()
{
	//When new slot is create in a DockingStation.
	String ID = "";
	
	return ID;
	
}

private String dockingStationIDgenerator()
{
	//When a new docking station is created on Campus.
	String ID = "";
	return ID;
	}

boolean addParkingSlot(String dockStationID, String parkingSlotID)
{
	return true;
}

boolean removeParkingSlot(String dockStationID, String parkingSlotID)
{
	return true;
}

boolean addDockingStation(String dockStationID, String dockStationLocation,int totalCapacity)
{
	return true;
}

boolean removeDockingStation(String dockStationID)
{
	return true;
}

}
