package Reservation;

public abstract class ReservableState {
	
	protected Reservation reservation;

	public abstract void reserve(Reservable ctx, Reservation r);

	public abstract void cancel(Reservable ctx);

	public abstract boolean isAvailable();
	
	public Reservation getReservation(){
		return this.reservation;
	}
}