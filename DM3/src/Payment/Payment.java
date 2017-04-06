package Payment;

import java.util.Date;

public class Payment {

	IPayable payable;
	private String status;
	private String confirmationNumber;
	private double  amountLeft;
	private Date transactionTime;

	/**
	 * 
	 * @param iPayable
	 */
	public String pay(IPayable iPayable) {
		// TODO - implement Payment.pay
		throw new UnsupportedOperationException();
	}

	public String getStatus() {
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