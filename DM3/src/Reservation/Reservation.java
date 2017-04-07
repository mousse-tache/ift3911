package Reservation;

import Payment.CreditPayment;
import Payment.IPayable;
import Payment.Payment;
import Sessions.Client.Client;
import Sessions.Client.ClientPaymentInfo;
import Travel.ReservableForTrip;

public class Reservation implements IPayable {

	private Integer reservationNumber;
	private Client client;
	Reservable reservable;
	Payment payment;
	private Double amount;
	private ClientPaymentInfo attribute;
	public ClientPaymentInfo paymentInfo;

	/**
	 * 
	 * @param r
	 * @param c
	 */
	public Reservation(Reservable r, Client c) {
		this.reservable = r;
		this.client = c;
	}

	/**
	 * 
	 * @param r
	 */
	public void changeFor(ReservableForTrip r) {
		// TODO - implement Reservation.modify
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ClientPaymentInfo
	 */
	public String pay(ClientPaymentInfo clientPaymentInfo) {
		payment = new CreditPayment(this, amount);
		payment.pay(reservable.getPrice());
		return payment.getConfirmationNumber();
	}

	public boolean cancelReservation() {
		// TODO - implement Reservation.cancelReservation
		throw new UnsupportedOperationException();
	}

	public String getConfirmationNumber() {
		// TODO - implement Reservation.getConfirmationNumber
		throw new UnsupportedOperationException();
	}

	public Integer getReservationNumber() {
		return this.reservationNumber;
	}

	public Client getClient() {
		return this.client;
	}

	@Override
	public Payment getPayment() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException();
	}

	public Double getAmount() {
		return this.amount;
	}

	public ClientPaymentInfo getAttribute() {
		return this.attribute;
	}

	public ClientPaymentInfo getPaymentInfo() {
		return this.paymentInfo;
	}

}