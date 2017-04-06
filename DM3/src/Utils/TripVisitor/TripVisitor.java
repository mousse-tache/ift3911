package Utils.TripVisitor;

import Travel.Trip.Trip;

public interface TripVisitor {

	/**
	 * 
	 * @param trip
	 */
	String visitTrip(Trip trip);

}