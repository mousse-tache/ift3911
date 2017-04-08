package Travel.Trip;

import Travel.Forms.TripForm;
import Travel.Itineraries.TrainLine;

public class TrainTrip extends Trip {

	public TrainTrip(TripForm form) {
		super(form);
		// TODO Verifications
		if(!(this.itinerary instanceof TrainLine)){
			throw new IllegalArgumentException("Invalid itinerary for a TrainTrip");
		}
	}

}