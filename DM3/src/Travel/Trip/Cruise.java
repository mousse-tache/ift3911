package Travel.Trip;

import Travel.Itineraries.CruiseRoute;
import Utils.TripVisitor.TripVisitor;

public class Cruise extends Trip {

	private CruiseRoute itinerary;

	/**
	 * 
	 * @param v
	 */
	public void accept(TripVisitor v) {
		// TODO - implement Cruise.accept
		throw new UnsupportedOperationException();
	}

}