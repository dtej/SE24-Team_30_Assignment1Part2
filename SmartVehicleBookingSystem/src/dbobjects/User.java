package dbobjects;

import java.util.List;

public class User {
	private UserIdentity id;
	private Wallet wallet;
	private List<Trip> tripHistory;
	private List<Payment> payment;

	public UserIdentity getId() {
		return id;
	}

	public void setId(UserIdentity id) {
		this.id = id;
	}

	public Wallet getWallet() {
		return wallet;
	}

	public void setWallet(Wallet wallet) {
		this.wallet = wallet;
	}

	public List<Trip> getTripHistory() {
		return tripHistory;
	}

	public void setTripHistory(List<Trip> tripHistory) {
		this.tripHistory = tripHistory;
	}

	public List<Payment> getPayment() {
		return payment;
	}

	public void setPayment(List<Payment> payment) {
		this.payment = payment;
	}

}