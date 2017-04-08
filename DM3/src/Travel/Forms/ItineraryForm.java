package Travel.Forms;

import java.util.ArrayList;
import java.util.List;

import Travel.TravelType;
import Travel.Itineraries.Itinerary;

public class ItineraryForm extends BaseForm {

	private List<String> locationIDs;
	private List<Long> times;

	public ItineraryForm(Itinerary i) {
		this.ID = i.getId();
		this.type = i.getType();
		this.locationIDs = new ArrayList<String>();
		this.times = new ArrayList<Long>();
		i.getStops().forEach(s -> {
			locationIDs.add(s.getLocation().getId());
			times.add(s.getTimeFromDeparture());
		});
	}

	public ItineraryForm(TravelType type, String itineraryID, List<String> locationIDs, List<Long> times) {
		this.ID = itineraryID;
		this.type = type;
		this.locationIDs = locationIDs;
		this.times = times;
	}

	public List<String> getLocationIDs() { return this.locationIDs; }

	public void setLocationIDs(List<String> locationIDs) { this.locationIDs = locationIDs; }

	public List<Long> getTimes() { return this.times; }

	public void setTimes(List<Long> times) { this.times = times; }

	public BaseForm createFromPrompt() {
		// TODO - implement ItineraryForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement ItineraryForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}
}