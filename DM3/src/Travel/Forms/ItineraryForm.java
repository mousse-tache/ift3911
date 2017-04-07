package Travel.Forms;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

import Travel.Itineraries.Itinerary;

public class ItineraryForm extends BaseForm {

	private List<String> locationIDs;
	private List<Time> times;

	public ItineraryForm(Itinerary i) {
		this.locationIDs = new ArrayList<String>();
		this.times = new ArrayList<Time>();
		i.getStops().forEach(s -> {
			locationIDs.add(s.getLocation().getId());
			times.add(s.getTimeFromDeparture());
		});
	}

	public BaseForm createFromPrompt() {
		// TODO - implement ItineraryForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement ItineraryForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}

	public List<String> getLocationIDs() {
		return this.locationIDs;
	}

	public void setLocationIDs(List<String> locationIDs) {
		this.locationIDs = locationIDs;
	}

	public List<Time> getTimes() {
		return this.times;
	}

	public void setTimes(List<Time> times) {
		this.times = times;
	}

}