package Reservation;

import java.util.Date;

public abstract class Reservable {

	private ReservableState state;
	Reservation reservation;
	private Double price;

	/**
	 * 
	 * @param time
	 * @param r
         * @return 
	 */
	public boolean reserve(Date time, Reservation r) {
            if(this.isAvailable()) {
                this.reservation = r;
                state.reserve(this);
                return true;
            }
            else {return false;}
	}

	public boolean cancel() {
            if(state instanceof Assigned || state instanceof Reserved) {
                state.cancel(this);
                return true;
            }
            else {return false;}
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