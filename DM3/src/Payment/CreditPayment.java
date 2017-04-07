package Payment;

import java.time.Instant;
import java.util.Date;

import Sessions.Client.ClientPaymentInfo;

public class CreditPayment extends Payment {

	public CreditPayment(IPayable payable, double ammount) {
		super(payable, ammount);
	}

	public String pay(double ammount) { 
		@SuppressWarnings("unused")
		ClientPaymentInfo paymentInfo = this.payable.getPaymentInfo();
		this.status = Status.PAID;
		this.transactionTime = Date.from(Instant.now());
		this.amountLeft = 0.0;
		this.confirmationNumber = "23462346";
		return confirmationNumber;
	}

}