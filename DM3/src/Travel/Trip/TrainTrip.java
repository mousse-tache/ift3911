package Travel.Trip;

import Travel.Forms.TripForm;
import Travel.Itineraries.TrainLine;
import Utils.TripVisitor.TripVisitor;

public class TrainTrip extends Trip {

	public TrainTrip(TripForm form) {
		super(form);
		// TODO Verifications
		if(!(this.itinerary instanceof TrainLine)){
			throw new IllegalArgumentException("Invalid itinerary for a TrainTrip");
		}
	}
	
	public void accept(TripVisitor v) {
		v.visitTrip(this);
	}
}