package Travel.Trip;

import Travel.Forms.TripForm;
import Travel.Itineraries.FlightRoute;

public class Flight extends Trip {

	public Flight(TripForm form) {
		super(form);
		// TODO Verifications
		if(!(this.itinerary instanceof FlightRoute)){
			throw new IllegalArgumentException("Invalid itinerary for a Flight");
		}
	}
}