package Travel.Trip;

import Travel.Forms.TripForm;
import Travel.Itineraries.CruiseRoute;

public class Cruise extends Trip {

	public Cruise(TripForm form) {
		super(form);
		// TODO Verifications
		if(!(this.itinerary instanceof CruiseRoute)){
			throw new IllegalArgumentException("Invalid itinerary for a Cruise");
		}
	}
}