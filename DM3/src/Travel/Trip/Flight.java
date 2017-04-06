package Travel.Trip;

import Travel.Itineraries.*;
import Utils.TripVisitor.*;

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