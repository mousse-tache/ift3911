package Travel.Forms;

import Travel.TravelType;
import Travel.Facilities.TravelFacility;

public class TravelFacilityForm extends BaseForm {

	private String location;
	private String name;

	public TravelFacilityForm(TravelFacility tf) {
		this.ID = tf.getId();
		this.type = tf.getType();
		this.location = tf.getLocation();
		this.name = tf.getName();
	}

	public TravelFacilityForm(TravelType type, String facilityID, String location, String name) {
		this.ID = facilityID;
		this.type = type;
		this.location = location;
		this.name = name;
	}

	public String getLocation() { return this.location; }

	public void setLocation(String location) { this.location = location; }

	public String getName() { return this.name; }

	public void setName(String name) { this.name = name; }

	public String getId() { return ID; }

	public void setId(String id) { this.ID = id; }

	public TravelType getType() { return type; }

	public void setType(TravelType type) { this.type = type; }

	public BaseForm createFromPrompt() {
		// TODO - implement TravelFacilityForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement TravelFacilityForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}

}