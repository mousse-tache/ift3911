package Payment;

public class CreditPayment extends Payment {

	private String cardNumber;

	public CreditPayment(IPayable payable, double ammount) {
		super(payable, ammount);
	}

}