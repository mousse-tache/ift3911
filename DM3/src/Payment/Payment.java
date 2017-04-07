package Payment;

import java.util.Date;

public abstract class Payment {

	public enum Status {
		PAID,
		PENDING,
		INPART,
		NOTPAID
	}

	IPayable payable;
	protected Status status;
	protected String confirmationNumber;
	protected double  amountLeft;
	protected Date transactionTime;

	public Payment(IPayable payable, double ammount){
		this.amountLeft = ammount;
		this.status = Status.NOTPAID;
		this.payable = payable;
	}

	public abstract String pay(double ammount);

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