package Travel.Forms;

import Travel.TravelType;

public abstract class BaseForm {

	protected TravelType type;
	protected String ID;

	public TravelType getType() {
		return this.type;
	}

	public void setType(TravelType type) {
		this.type = type;
	}

	public String getID() {
		return this.ID;
	}

	public void setID(String ID) {
		this.ID = ID;
	}

	public abstract BaseForm createFromPrompt();

	public abstract void modifyFromPrompt();

}