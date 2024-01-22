package manager;

import dbobjects.SmartVehicle;
import dbobjects.Trip;
import dbobjects.User;

public class TripManager {

	// For starting the trip
	String startTrip(Trip trip, User user, SmartVehicle smartVehicle) {
		// To Do
		return null;
	}

	// For ending the trip
	String endTrip(Trip trip, User user, SmartVehicle smartVehicle) {
		// To Do
		return null;
	}

	// For Updating the trip details
	String updateTripDetails(Trip trip) {
		// To Do
		return null;
	}

	// For calculating and sending the charges after the trip gets over
	Float getTripCharges(Trip trip) {
		// To Do
		return null;
	}

	// For calculating and sending the estimate of the ride between location for
	// shortest distance
	Float getTripCostEstimate(String startLocation, String endLocation) {
		// To Do
		return null;
	}

	// Returns on-going trip of the user
	Trip getActiveTripDetails(User user) {
		// To Do
		return null;
	}
}
