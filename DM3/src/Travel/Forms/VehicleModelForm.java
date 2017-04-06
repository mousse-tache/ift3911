package Travel.Forms;

import java.util.Map;

import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class VehicleModelForm extends BaseForm {

	private String modelName;
	private Map<String, BaseSection> sections;

	/**
	 * 
	 * @param tv
	 */
	public VehicleModelForm(TransportVehicleModel tv) {
		this.modelName = tv.getModelName();
		this.sections = tv.getSections();
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

	public Map<String, BaseSection> getSections() {
		return this.sections;
	}

	public void setSections(Map<String, BaseSection> sections) {
		this.sections = sections;
	}

}