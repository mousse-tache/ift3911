package Travel.Itineraries;

import Travel.TravelType;
import Travel.Forms.ItineraryForm;

public class TrainLine extends Itinerary {

	TrainLine(ItineraryForm form) {
		super(form);
		if (form.getType() != TravelType.Train)
			throw new IllegalArgumentException("Wrong form type for TrainItinerary");
	}

}