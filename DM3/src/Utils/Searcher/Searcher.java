package Utils.Searcher;

import java.util.Date;
import java.util.List;

import Reservation.Reservable;
import Travel.Facilities.TravelFacility;
import Travel.Trip.Trip;

public class Searcher {

	/**
	 * 
	 * @param from
	 * @param to
	 * @param date
	 */
	public static List<Trip> getTripsFromLocationToLocationAtDate(TravelFacility from, TravelFacility to, Date date) {
		// TODO - implement TripSearcher.getTripsFromLocationToLocationAtDate
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param tripID
	 */
	public static Trip findTrip(String tripID) {
		// TODO - implement TripSearcher.findTrip
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param trip
	 * @param section
	 * @param preferences
	 */
	public static List<Reservable> findAvailableReservables(Trip trip, char section, String preferences) {
		// TODO - implement TripSearcher.findAvailableReservables
		throw new UnsupportedOperationException();
	}

}