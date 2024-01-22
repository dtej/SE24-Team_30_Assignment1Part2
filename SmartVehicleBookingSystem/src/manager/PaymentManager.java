package manager;


import SmartVehicleBookingSystem.src.dbobjects.User;
import SmartVehicleBookingSystem.src.dbobjects.Payment;

import dbobjects.PaymentDetails;

public class PaymentManager {

    // default constructor for PaymentManager class
    PaymentManager() {

    }

    /* getter and setter methods of the class */

    // set paymentID of the payment
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    // get paymentID
    public String getPaymentID() {
    	return null;
    }

    // set the transaction details
    public void setTransaction(String paymentID, PaymentDetails paymentDetails) {

    }

    // get the transaction details
    public PaymentDetails getTransaction(String paymentID) {

    }

    /* additional methods of the class */

    // add money to User wallet
    public void addMoney(Double amount) {

    }

    // show the user wallet balance 
    public Double showBalance(User user) {

    }

    // process the payment for the trip / adding money to wallet
    public Payment.TransactionState processPayment(String paymentId, Double amount) {
        
    }

    // store the transaction to db
    public void storeToDB(String paymentId, Payment payment) {

    }
}
