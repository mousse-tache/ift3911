package Travel.Forms;

import java.util.Date;
import java.util.List;

import Travel.Itineraries.Itinerary;

public class ItineraryForm extends BaseForm {

	private List<String> locationIDs;
	private List<Date> times;

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

	public List<Date> getTimes() {
		return this.times;
	}

	public void setTimes(List<Date> times) {
		this.times = times;
	}

}