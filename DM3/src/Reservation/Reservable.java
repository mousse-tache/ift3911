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
            try {
                state.reserve(this);
                this.reservation = r;
                return true;
            }
            catch (Exception ex) {
                return false;
            }
	}

	public boolean cancel() {
                try{
                    state.cancel(this);
                    return true;
                }
                catch (Exception ex) {
                return false;
            }
                
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