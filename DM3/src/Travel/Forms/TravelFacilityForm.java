package Travel.Forms;

import Travel.Facilities.TravelFacility;

public class TravelFacilityForm extends BaseForm {

	private String location;
	private String name;

	/**
	 * 
	 * @param tf
	 */
	public TravelFacilityForm(TravelFacility tf) {
		this.location = tf.getLocation();
		this.name = tf.getName();
	}

	public BaseForm createFromPrompt() {
		// TODO - implement TravelFacilityForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement TravelFacilityForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}