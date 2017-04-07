package Travel.Forms;

import Travel.TravelType;
import Travel.Facilities.TravelFacility;

public class TravelFacilityForm extends BaseForm {

	private String id;
	private String location;
	private String name;
	private TravelType type;

	public TravelFacilityForm(TravelFacility tf) {
		this.ID = tf.getId();
		this.location = tf.getLocation();
		this.name = tf.getName();
		this.type = tf.getType();
	}

	public String getLocation() { return this.location; }

	public void setLocation(String location) { this.location = location; }

	public String getName() { return this.name; }

	public void setName(String name) { this.name = name; }

	public String getId() { return id; }

	public void setId(String id) { this.id = id; }

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