package Payment;

import Sessions.Client.ClientPaymentInfo;

public interface IPayable {

	Payment getPayment();

	ClientPaymentInfo getPaymentInfo();

	Double getAmount();

	String getConfirmationNumber();

}