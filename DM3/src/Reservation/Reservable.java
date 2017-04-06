package Reservation;

import java.util.Date;

public class Reservable {

	private ReservableState state;
	Reservation reservation;

	/**
	 * 
	 * @param time
	 * @param r
	 */
	public boolean reserve(Date time, Reservation r) {
		// TODO - implement Reservable.reserve
		throw new UnsupportedOperationException();
	}

	public boolean cancel() {
		// TODO - implement Reservable.cancel
		throw new UnsupportedOperationException();
	}

	public double getPrice() {
		// TODO - implement Reservable.getPrice
		throw new UnsupportedOperationException();
	}

	public boolean isAvailable() {
		// TODO - implement Reservable.isAvailable
		throw new UnsupportedOperationException();
	}

	public ReservableState getState() {
		return this.state;
	}

	public void setState(ReservableState state) {
		this.state = state;
	}

}