package manager;

import dbobjects.Payment;
import dbobjects.User;

public class PaymentManager {

	// add money to User wallet
	public void addMoney(Double amount) {

	}

	// show the user wallet balance
	public Double showBalance(User user) {
		return null;

	}

	// process the payment for the trip / adding money to wallet
	public Payment.TransactionState processPayment(String paymentId, Double amount) {
		return null;

	}

	// store the transaction to db
	public boolean updatePaymentDetails(Payment payment) {
		return false;

	}
}
