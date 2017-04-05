package Sessions.Client;

import Sessions.*;
import Travel.Trip.*;
import Travel.Facilities.*;
import Reservation.*;

public class ClientSession extends Session {

	public boolean updateClientInformations() {
		// TODO - implement ClientSession.updateClientInformations
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param type
	 * @param from
	 * @param to
	 * @param date
	 */
	public List<Trip> findTrips(String type, TravelFacility from, TravelFacility to, Date date) {
		// TODO - implement ClientSession.findTrips
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param id
	 * @param section
	 */
	public List<Reservable> getTripAvailability(String id, Char section) {
		// TODO - implement ClientSession.getTripAvailability
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param r
	 */
	public String reservePlace(ReservableForTrip r) {
		// TODO - implement ClientSession.reservePlace
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationNumber
	 */
	public boolean cancelReservation(String reservationNumber) {
		// TODO - implement ClientSession.cancelReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationNumber
	 */
	public boolean modifyReservation(String reservationNumber) {
		// TODO - implement ClientSession.modifyReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationNumber
	 */
	public void showReservation(String reservationNumber) {
		// TODO - implement ClientSession.showReservation
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param reservationNumber
	 */
	public String payReservation(String reservationNumber) {
		// TODO - implement ClientSession.payReservation
		throw new UnsupportedOperationException();
	}

}