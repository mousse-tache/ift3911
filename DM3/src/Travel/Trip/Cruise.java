package Travel.Trip;

import Travel.Forms.TripForm;
import Utils.TripVisitor.TripVisitor;

public class Cruise extends Trip {

	public Cruise(TripForm form) {
		super(form);
		// TODO Verifications
	}

	public void accept(TripVisitor v) {
		// TODO - implement Cruise.accept
		throw new UnsupportedOperationException();
	}

}