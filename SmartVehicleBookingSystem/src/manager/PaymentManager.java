package manager;

import SmartVehicleBookingSystem.src.dbobjects.User;
import SmartVehicleBookingSystem.src.dbobjects.Payment;

public class PaymentManager {

    // default constructor for PaymentManager class
    PaymentManager() {

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
