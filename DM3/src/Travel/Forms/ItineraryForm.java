package Travel.Forms;

import Travel.Itineraries.*;

public class ItineraryForm extends BaseForm {

	private List<String> locationIDs;
	private List<DateTime> times;

	/**
	 * 
	 * @param i
	 */
	public ItineraryForm(Itinerary i) {
		// TODO - implement ItineraryForm.ItineraryForm
		throw new UnsupportedOperationException();
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

	public List<DateTime> getTimes() {
		return this.times;
	}

	public void setTimes(List<DateTime> times) {
		this.times = times;
	}

}