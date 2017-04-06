package Payment;

public interface IPayable {

	Payment getPayment();

	PaymentInfo getPaymentInfo();

	Real getAmount();

	String getConfirmationNumber();

}