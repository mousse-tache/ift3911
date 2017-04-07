package Travel.Trip;

import Travel.Forms.TripForm;
import Travel.Itineraries.FlightRoute;
import Utils.TripVisitor.TripVisitor;

public class Flight extends Trip {

	public Flight(TripForm form) {
		super(form);
		// TODO Verifications
		if(!(this.itinerary instanceof FlightRoute)){
			throw new IllegalArgumentException("Invalid itinerary for a Flight");
		}
	}

	public void accept(TripVisitor v) {
		v.visitTrip(this);
	}

}