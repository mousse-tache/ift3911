package Travel.Forms;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import Travel.TravelType;
import Travel.Factories.VehicleSectionFactory;
import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class VehicleModelForm extends BaseForm {

	private String modelName;
	private Map<String, VehicleSectionForm> sections;

	public VehicleModelForm(TransportVehicleModel tv) {
		this.ID = tv.getID();
		this.type = tv.getType();
		this.modelName = tv.getModelName();
		this.sections = new HashMap<String, VehicleSectionForm>();
		tv.getSections().forEach((k,v) -> sections.put(k, new VehicleSectionForm(v)));
	}

	public VehicleModelForm(TravelType type, String modelID, String modelName, List<VehicleSectionForm> sectionsForms) {
		this.ID = modelID;
		this.type = type;
		this.modelName = modelName;
		this.sections = new HashMap<String, VehicleSectionForm>();
		for(VehicleSectionForm vsf : sectionsForms){
			this.sections.put(vsf.getSectionType(), vsf);
		}
	}

	public String getModelName() { return this.modelName; }

	public void setModelName(String modelName) { this.modelName = modelName; }

	public Map<String, VehicleSectionForm> getSections() { return this.sections; }

	public void setSections(Map<String, VehicleSectionForm> sections) { this.sections = sections; }

	public List<BaseSection> getBaseSections() {
		List<BaseSection> sections = new ArrayList<BaseSection>();
		this.sections.forEach((k,form) -> sections.add(VehicleSectionFactory.createSection(form)));
		return sections;
	}

	public BaseForm createFromPrompt() {
		// TODO - implement VehicleModelForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement VehicleModelForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}

}