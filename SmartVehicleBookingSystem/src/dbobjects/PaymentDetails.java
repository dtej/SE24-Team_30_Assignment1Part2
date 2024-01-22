package dbobjects;

import java.time.LocalDateTime;

import SmartVehicleBookingSystem.src.dbobjects.User;

enum TransactionState {
    SUCCESS,
    PROCESSING,
    FAILED
}

enum PaymentMode {
    UPI,
    WALLET,
    PAYLATER
}

public class PaymentDetails {

    private LocalDateTime dateTime;
    private User user;
    private Double amount;
    private String senderBankAccount;
    private String receiverBankAccount;
    private PaymentMode paymentMode;
    private TransactionState paymentStatus;

    // default constructor for PaymentDetails class
    PaymentDetails() {

    }

    /* getter and setter methods of the class */    

    // set the date and time of the payment
    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    // get the date and time of the payment
    public LocalDateTime getDateTime() {
        return null;
    }    

    // set the user who made the payment
    public void setUser(User user) {
        this.user = user;
    }

    // get the user who made the payment
    public User getUser() {
        return null;
    }  

    // set the amount of the payment
    public void setAmount(Double amount) {
        this.amount = amount;
    }

    // get the amount of the payment
    public Double getAmount() {
        return null;
    }

    // set the sender's bank account name
    public void setSenderBankAccount(String senderBankAccount) {
        this.senderBankAccount = senderBankAccount;
    }

    // get the sender's bank account name
    public String getSenderBankAccount() {
        return null;
    }

    // set the receiver's bank account name
    public void setReceiverBankAccount(String receiverBankAccount) {
        this.receiverBankAccount = receiverBankAccount;
    }

    // get the receiver's bank account name
    public String getReceiverBankAccount() {
        return null;
    }

    // set the payment mode
    public void setPaymentMode(PaymentMode paymentMode) {
        this.paymentMode = paymentMode;
    }

    // get the payment mode
    public PaymentMode getPaymentMode() {
        return null;
    }

    // set the payment status
    public void setPaymentStatus(TransactionState transactionState) {
        this.paymentStatus = transactionState;
    }

    // get the payment status
    public TransactionState getPaymentStatus() {
        return null;
    }

    /* additional methods of the class */

    // method to update transaction
    public void updateTransaction() {

    }
}
