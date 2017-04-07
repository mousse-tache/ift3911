package Travel.Itineraries;

import Travel.TravelType;
import Travel.Forms.ItineraryForm;
import java.util.*;

public class CruiseRoute extends Itinerary {

	CruiseRoute(ItineraryForm form) {
		super(form);
		if (form.getType() != TravelType.Cruise)
			throw new IllegalArgumentException("Wrong form type for TrainItinerary");
	}

	public java.util.List<Stop> getStops() {
		// TODO - implement CruiseRoute.getStops
		throw new UnsupportedOperationException();
	}

	private Collection<List<Stop>> stops;
}