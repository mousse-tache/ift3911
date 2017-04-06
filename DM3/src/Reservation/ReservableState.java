package Reservation;

public abstract class ReservableState {

	/**
	 * 
	 * @param ctx
	 */
	public abstract void reserve(Reservable ctx);

	/**
	 * 
	 * @param ctx
	 */
	public abstract void cancel(Reservable ctx);

}