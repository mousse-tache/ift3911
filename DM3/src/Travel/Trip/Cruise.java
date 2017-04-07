package Travel.Trip;

import Travel.Forms.TripForm;
import Travel.Itineraries.CruiseRoute;
import Utils.TripVisitor.TripVisitor;

public class Cruise extends Trip {

	public Cruise(TripForm form) {
		super(form);
		// TODO Verifications
		if(!(this.itinerary instanceof CruiseRoute)){
			throw new IllegalArgumentException("Invalid itinerary for a Cruise");
		}
	}

	public void accept(TripVisitor v) {
		v.visitTrip(this);
	}

}