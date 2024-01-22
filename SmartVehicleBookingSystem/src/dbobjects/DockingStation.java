package dbobjects;

import java.time.LocalDateTime;
import java.util.List;


public class DockingStation {
// Docking station will have some functionalities. Those are mentioned here.
	
	String dockStationID;
	List<String> availableVehicles;
	int totalCapacity;
	String dockStationLocation;
	LocalDateTime vehicleAssignTime;
	LocalDateTime vehicleReturnTime;
	
// At any point in time it is assumed that either the DockingStationID or DockingStationLocation
	//is always known.
String getDockingStationID(String dockStationLocation)
	{
		String ID = "";
	    return ID;	
	}

String getDockingStationLocation(String dokcStationID)
{
	String location = "";
    return location;	
}

boolean setDockingStationID(String dockStatoinID)
{
	return true;
}

int monitorCapacity(String dockingStaionID)
{
	int count =0;
	return count;
}

List<String> getParkingSlotsList(String dockingStationID)
{
	List slots = null;
	
	return slots;
}

boolean assignVehicle(String vID, String UID, String parkingSlotID, String dockStationID, LocalDateTime vehicleAssignTime)
{
	return true;
}

boolean unassignVehicle(String vID, String UID, String parkingSlotID, String dockStationID, LocalDateTime vehicleReturnTime)
{
	return true;
}


}
