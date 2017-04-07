package Travel.Forms;

import java.sql.Time;
import java.util.List;

import Travel.Itineraries.Itinerary;

public class ItineraryForm extends BaseForm {

	private List<String> locationIDs;
	private List<Time> times;

	/**
	 * 
	 * @param i
	 */
	public ItineraryForm(Itinerary i) {
		this.locationIDs.add(i.getId());
		this.times.add(i.getTripTime());
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