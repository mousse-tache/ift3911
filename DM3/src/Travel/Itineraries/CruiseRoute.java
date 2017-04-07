package Travel.Itineraries;

import Travel.TravelType;
import Travel.Forms.ItineraryForm;

public class CruiseRoute extends Itinerary {

	public CruiseRoute(ItineraryForm form) {
		super(form);
		if (form.getType() != TravelType.Cruise)
			throw new IllegalArgumentException("Wrong form type for CruiseRoute");
	}
}