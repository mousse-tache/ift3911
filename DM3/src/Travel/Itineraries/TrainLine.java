package Travel.Itineraries;

import Travel.TravelType;
import Travel.Forms.ItineraryForm;
import java.util.*;

public class TrainLine extends Itinerary {

	TrainLine(ItineraryForm form) {
		super(form);
		if (form.getType() != TravelType.Train)
			throw new IllegalArgumentException("Wrong form type for TrainItinerary");
	}

	public java.util.List<Stop> getStops() {
		// TODO - implement TrainLine.getStops
		throw new UnsupportedOperationException();
	}

	private Collection<List<Stop>> stops;

}