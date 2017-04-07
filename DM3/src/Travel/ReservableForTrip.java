package Travel;

import Reservation.Reservable;
import Travel.Trip.Trip;
import Travel.VehicleModels.Places.PassengerSpace;

public class ReservableForTrip extends Reservable {

	Trip trip;
	private PassengerSpace passengerSpace;

	public ReservableForTrip(Trip trip, PassengerSpace space, double basePrice) {
		super(basePrice*space.getPriceRatio());
		this.trip = trip;
		this.passengerSpace = space;
	}

	public Trip getTrip() {
		return trip;
	}
	public void setTrip(Trip trip) {
		this.trip = trip;
	}
	public PassengerSpace getPassengerSpace() {
		return passengerSpace;
	}
	public void setPassengerSpace(PassengerSpace passengerSpace) {
		this.passengerSpace = passengerSpace;
	}

}