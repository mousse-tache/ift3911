package Reservation;

import Payment.*;
import Sessions.Client.*;

public class Reservation implements IPayable {

	private Integer reservationNumber;
	private Client client;

	/**
	 * 
	 * @param r
	 * @param c
	 */
	public Reservation(Reservable r, Client c) {
		// TODO - implement Reservation.Reservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param r
	 */
	public void modify(ReservableForTrip r) {
		// TODO - implement Reservation.modify
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param ClientPaymentInfo
	 */
	public String pay(clientPaymentInfo ClientPaymentInfo) {
		// TODO - implement Reservation.pay
		throw new UnsupportedOperationException();
	}

	public boolean cancelReservation() {
		// TODO - implement Reservation.cancelReservation
		throw new UnsupportedOperationException();
	}

	public PaymentInfo getPaymentInfo() {
		// TODO - implement Reservation.getPaymentInfo
		throw new UnsupportedOperationException();
	}

	public Real getAmount() {
		// TODO - implement Reservation.getAmount
		throw new UnsupportedOperationException();
	}

	public String getConfirmationNumber() {
		// TODO - implement Reservation.getConfirmationNumber
		throw new UnsupportedOperationException();
	}

	public Payment getPayment() {
		// TODO - implement Reservation.getPayment
		throw new UnsupportedOperationException();
	}

}