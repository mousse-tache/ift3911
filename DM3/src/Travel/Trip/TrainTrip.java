package Travel.Trip;

import Travel.Forms.TripForm;
import Utils.TripVisitor.TripVisitor;

public class TrainTrip extends Trip {

	public TrainTrip(TripForm form) {
		super(form);
		// TODO Verifications
	}
	
	public void accept(TripVisitor v) {
		// TODO - implement TrainTrip.accept
		throw new UnsupportedOperationException();
	}

}