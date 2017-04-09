package Payment;

import Sessions.Client.ClientPaymentInfo;

public interface IPayable {

	String pay(double ammountToPay);

	ClientPaymentInfo getPaymentInfo();

	Double getAmountLeft();
}