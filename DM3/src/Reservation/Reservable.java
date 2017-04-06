package Reservation;

import java.util.Date;

public class Reservable {

	private ReservableState state;
	Reservation reservation;
	private Double price;

	/**
	 * 
	 * @param time
	 * @param r
	 */
	public boolean reserve(Date time, Reservation r) {
		state.reserve(this);
		this.reservation = r;
		throw new UnsupportedOperationException();
	}

	public boolean cancel() {
		// TODO - implement Reservable.cancel
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		return this.price;
	}

	public boolean isAvailable() {
		return state instanceof Free;
	}

	public ReservableState getState() {
		return this.state;
	}

	public void setState(ReservableState state) {
		this.state = state;
	}

}