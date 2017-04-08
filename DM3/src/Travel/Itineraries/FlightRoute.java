package Travel.Itineraries;

import Travel.TravelType;
import Travel.Forms.ItineraryForm;

public class FlightRoute extends Itinerary {

	public FlightRoute(ItineraryForm form) {
		super(form);
		if (form.getType() != TravelType.Plane)
			throw new IllegalArgumentException("Wrong form type for FlightRoute");
	}
}