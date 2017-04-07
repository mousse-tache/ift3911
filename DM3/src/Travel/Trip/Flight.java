package Travel.Trip;

import Travel.Forms.TripForm;
import Utils.TripVisitor.TripVisitor;

public class Flight extends Trip {

	public Flight(TripForm form) {
		super(form);
		// TODO Verifications
	}

	public void accept(TripVisitor v) {
		// TODO - implement Flight.accept
		throw new UnsupportedOperationException();
	}

}