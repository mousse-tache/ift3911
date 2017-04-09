package Reservation;

import Payment.CreditPayment;
import Payment.IPayable;
import Payment.Payment;
import Sessions.Client.Client;
import Sessions.Client.ClientPaymentInfo;
import Utils.DateUtils;

public class Reservation implements IPayable {

	Reservable reservable;
	private Client client;
	private ClientPaymentInfo paymentInfo;
	Payment payment;
	private String confirmationString;
	private Double amount;

	public Reservation(Reservable r, Client c) {
		this.reservable = r;
		this.client = c;
	}

	public boolean changeFor(Reservable r) {
		if(!this.reservable.cancel())
			return false;
		this.reservable = r;
		return this.reservable.reserve(DateUtils.now(), this);
	}

	public String pay(ClientPaymentInfo clientPaymentInfo) {
		payment = new CreditPayment(this, amount);
		payment.pay(reservable.getPrice());
		return payment.getConfirmationNumber();
	}

	public boolean cancelReservation() {
		if(this.reservable.getState() instanceof Assigned && !this.reservable.isCancelable())
			return false;
		// TODO Refund client !
		return this.reservable.cancel();
	}

	public Client getClient() { return this.client; }

	public Payment getPayment() { return this.payment; }

	public Double getAmount() { return this.amount; }

	public String getConfirmationString() { return this.confirmationString; }

	public boolean isFullyPaid() {
		if (this.payment == null)
			return false;
		return this.payment.getStatus() == Payment.Status.PAID;
	}

	@Override
	public Double getAmountLeft(){
		if (this.payment == null)
			return this.amount;
		return this.payment.getAmountLeft(); 
	}

	@Override
	public ClientPaymentInfo getPaymentInfo() { return this.paymentInfo; }

	@Override
	public String pay(double ammountToPay) {
		this.payment = new CreditPayment(this, this.amount);;
		return this.payment.pay(ammountToPay);
	}
}