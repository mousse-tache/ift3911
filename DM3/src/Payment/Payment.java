package Payment;

public class Payment {

	IPayable payable;
	private String status;
	private String confirmationNumber;
	private Real amountLeft;
	private DateTime transactionTime;

	/**
	 * 
	 * @param iPayable
	 */
	public String pay(IPayable iPayable) {
		// TODO - implement Payment.pay
		throw new UnsupportedOperationException();
	}

}