package Sessions.Client;

import java.util.Date;
import java.util.List;

import Reservation.Reservable;
import Sessions.Session;
import Travel.ReservableForTrip;
import Travel.Facilities.TravelFacility;
import Travel.Trip.Trip;

public class ClientSession extends Session {

	public ClientSession(String userID) {
		super(userID);
	}

	public List<Trip> findTrips(String type, TravelFacility from, TravelFacility to, Date date) {
		// TODO - implement ClientSession.findTrips
		throw new UnsupportedOperationException();
	}

	public List<Reservable> getTripAvailability(String id, char section) {
		// TODO - implement ClientSession.getTripAvailability
		throw new UnsupportedOperationException();
	}

	public String reservePlace(ReservableForTrip r) {
		// TODO - implement ClientSession.reservePlace
		throw new UnsupportedOperationException();
	}

	public boolean cancelReservation(String reservationNumber) {
		// TODO - implement ClientSession.cancelReservation
		throw new UnsupportedOperationException();
	}

	public boolean modifyReservation(String reservationNumber) {
		// TODO - implement ClientSession.modifyReservation
		throw new UnsupportedOperationException();
	}

	public void showReservation(String reservationNumber) {
		// TODO - implement ClientSession.showReservation
		throw new UnsupportedOperationException();
	}

	public String payReservation(String reservationNumber) {
		// TODO - implement ClientSession.payReservation
		throw new UnsupportedOperationException();
	}

}