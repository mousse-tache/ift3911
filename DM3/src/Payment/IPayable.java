package Payment;

public interface IPayable {

	PaymentInfo getPaymentInfo();

	Real getAmount();

	String getConfirmationNumber();

}