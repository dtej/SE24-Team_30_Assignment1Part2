package manager;

import java.util.*;

import dbobjects.DockingStation;
import dbobjects.ParkingSlot;
import dbobjects.SmartVehicle;

public class DockingStationManager {
	
	//takes care of the DockingStation. Each docking station contains some n parking slots.
	//Each slot will have one vehicle or is empty.
	
String updateVehicleDockStatus(DockingStation dockingStation,SmartVehicle smartVehicle)
{
	//Maps the vehicle to Docking Station when a trip is ended or parked(still reserved
	// by a user).
	return null;
}

String checkVehicleAvailability(DockingStation dockingStation,SmartVehicle smartVehicle)
{
	//check if a particular vehicle is available at a docking station
	return null;
}

String checkParkingSlotAvailable(DockingStation dockingStation,ParkingSlot parkingSlot)
{
	//Returns the number of praking slots available at a docking station to park a vehicle.
	return null;
}

String updateDockingStationDetails(DockingStation dockingStation)
{
	//update vehicle entry and exits to/from a docking station.
	return null;
}
}
