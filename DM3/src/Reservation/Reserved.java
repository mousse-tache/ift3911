package Reservation;

import java.util.Date;
import java.util.Timer;

public class Reserved extends ReservableState {

	private Date reservationDateTime;
	private Timer timer;

	/**
	 * 
	 * @param ctx
	 */
	public void event(Reservable ctx) {
		// TODO - implement Reserved.event
		throw new UnsupportedOperationException();
	}

}