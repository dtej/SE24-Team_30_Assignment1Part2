package dbobjects;

import java.time.LocalDateTime;

public class Trip {

	private int tripId;
	private LocalDateTime startTime;
	private LocalDateTime endTime;
	private String startLocation;
	private String endLocation;
	private SmartVehicle vehicleInUse;
	private Float distance;
	private TripFeedback tripFeedback;
	private Float tripCost;

	public enum tripStatus {
		INPROGRESS, COMPLETED
	}

	public int getTripId() {
		return tripId;
	}

	public void setTripId(int tripId) {
		this.tripId = tripId;
	}

	public LocalDateTime getStartTime() {
		return startTime;
	}

	public void setStartTime(LocalDateTime startTime) {
		this.startTime = startTime;
	}

	public LocalDateTime getEndTime() {
		return endTime;
	}

	public void setEndTime(LocalDateTime endTime) {
		this.endTime = endTime;
	}

	public String getStartLocation() {
		return startLocation;
	}

	public void setStartLocation(String startLocation) {
		this.startLocation = startLocation;
	}

	public String getEndLocation() {
		return endLocation;
	}

	public void setEndLocation(String endLocation) {
		this.endLocation = endLocation;
	}

	public SmartVehicle getVehicleInUse() {
		return vehicleInUse;
	}

	public void setVehicleInUse(SmartVehicle vehicleInUse) {
		this.vehicleInUse = vehicleInUse;
	}

	public Float getDistance() {
		return distance;
	}

	public void setDistance(Float distance) {
		this.distance = distance;
	}

	public TripFeedback getTripFeedback() {
		return tripFeedback;
	}

	public void setTripFeedback(TripFeedback tripFeedback) {
		this.tripFeedback = tripFeedback;
	}

	public Float getTripCost() {
		return tripCost;
	}

	public void setTripCost(Float tripCost) {
		this.tripCost = tripCost;
	}

}
