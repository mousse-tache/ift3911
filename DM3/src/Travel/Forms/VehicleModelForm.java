package Travel.Forms;

import Travel.VehicleModels.Vehicle.*;

public class VehicleModelForm extends BaseForm {

	private String modelName;
	private List<VehicleSectionForm> sections;

	/**
	 * 
	 * @param tv
	 */
	public VehicleModelForm(TransportVehicleModel tv) {
		// TODO - implement VehicleModelForm.VehicleModelForm
		throw new UnsupportedOperationException();
	}

	public BaseForm createFromPrompt() {
		// TODO - implement VehicleModelForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement VehicleModelForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}

	public String getModelName() {
		return this.modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public List<VehicleSectionForm> getSections() {
		return this.sections;
	}

	public void setSections(List<VehicleSectionForm> sections) {
		this.sections = sections;
	}

}