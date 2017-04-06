package Reservation;

import java.util.Date;

public abstract class Reservable {

	private ReservableState state;
	private Double price;

	public Reservable(double price){
		this.state = new Free();
		this.price = price;
	}

	public boolean reserve(Date time, Reservation r) {
		if(this.state.isAvailable()) {
			state.reserve(this, r);
			return true;
		}
		return false;
	}

	public boolean cancel() {
		if(state instanceof Assigned || state instanceof Reserved) {
			state.cancel(this);
			return true;
		}
		return false;
	}
	
	public Reservation getReservation(){
		return state.getReservation();
	}

	public double getPrice() {
		return this.price;
	}

	public ReservableState getState() {
		return this.state;
	}

	public void setState(ReservableState state) {
		this.state = state;
	}

}