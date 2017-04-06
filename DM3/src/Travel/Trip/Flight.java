package Travel.Trip;

import Travel.Itineraries.FlightRoute;
import Utils.TripVisitor.TripVisitor;

public class Flight extends Trip {

	private FlightRoute itinerary;

	/**
	 * 
	 * @param v
	 */
	public void accept(TripVisitor v) {
		// TODO - implement Flight.accept
		throw new UnsupportedOperationException();
	}

}