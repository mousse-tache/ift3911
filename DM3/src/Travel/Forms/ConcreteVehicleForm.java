package Travel.Forms;

import Travel.*;

public class ConcreteVehicleForm extends BaseForm {

	private String modelID;
	private String ownerID;

	/**
	 * 
	 * @param cv
	 */
	public ConcreteVehicleForm(ConcreteVehicle cv) {
		// TODO - implement ConcreteVehicleForm.ConcreteVehicleForm
		throw new UnsupportedOperationException();
	}

	public BaseForm createFromPrompt() {
		// TODO - implement ConcreteVehicleForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement ConcreteVehicleForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}

	public String getModelID() {
		return this.modelID;
	}

	public void setModelID(String modelID) {
		this.modelID = modelID;
	}

	public String getOwnerID() {
		return this.ownerID;
	}

	public void setOwnerID(String ownerID) {
		this.ownerID = ownerID;
	}

}
