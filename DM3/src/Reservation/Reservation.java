package Reservation;

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
	private ClientPaymentInfo paymentInfo;

	/**
	 * 
	 * @param r
	 * @param c
	 */
	public Reservation(Reservable r, Client c) {
		this.reservable = r;
		this.client = c;
		payment = new Payment(this, r.getPrice());
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
		// TODO - implement Reservation.pay
		payment.pay(reservable.getPrice());
		throw new UnsupportedOperationException();
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

	public ClientPaymentInfo getPaymentInfo() {
		return this.paymentInfo;
	}

}