package Payment;

import java.time.Instant;
import java.util.Date;

import Sessions.Client.ClientPaymentInfo;

public class Payment {

	public enum Status {
		PAID,
		PENDING,
		INPART,
		NOTPAID
	}

	IPayable payable;
	private Status status;
	private String confirmationNumber;
	private double  amountLeft;
	private Date transactionTime;

	public Payment(IPayable payable, double ammount){
		this.amountLeft = ammount;
		this.status = Status.NOTPAID;
		this.payable = payable;
	}
	/**
	 * 
	 * @param iPayable
	 */
	public String pay(double ammount) { 
		ClientPaymentInfo paymentInfo = this.payable.getPaymentInfo();
		this.status = Status.PAID;
		this.transactionTime = Date.from(Instant.now());
		this.amountLeft = 0.0;
		this.confirmationNumber = "23462346";
		return confirmationNumber;
	}

	public Status getStatus() {
		return this.status;
	}

	public String getConfirmationNumber() {
		return this.confirmationNumber;
	}

	public double getAmountLeft() {
		return this.amountLeft;
	}

	public Date getTransactionTime() {
		return this.transactionTime;
	}

}