package dbobjects;

import java.time.LocalDateTime;

public class Payment {

	private String paymentId; // unique ID for each payment
	private LocalDateTime dateTime; // time and date of the payment
	private User user; // user object who made the payment
	private Double amount; // payemnt amount
	private String senderBankAccount; // sender's bank account name
	private String receiverBankAccount; // receiver's bank account name
	private PaymentMode paymentMode; // mode of payment (UPI, WALLET or PAYLATER)
	private TransactionState paymentStatus; // status of the payment (SUCCESS, PROCESSING or FAILED)

	public enum TransactionState {
		SUCCESS, PROCESSING, FAILED
	}

	public enum PaymentMode {
		UPI, WALLET, PAYLATER
	}

	/* getter and setter methods of the class */

	// set paymentId of the payment
	public void setPaymentId(String paymentId) {
		this.paymentId = paymentId;
	}

	// get paymentId
	public String getPaymentId() {
		return null;
	}

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

}
