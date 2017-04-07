package Travel.VehicleModels.Vehicle;

import java.util.List;

import Travel.Forms.VehicleModelForm;
import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Sections.SectionWithCabins;

public class Cruiser extends TransportVehicleModel {

	Cruiser(String ID, String modelName, List<BaseSection> sections) {
		super(ID, modelName, validSections(sections));
	}

	public Cruiser(VehicleModelForm f) {
		// TODO Auto-generated constructor stub
	}

	private static List<BaseSection> validSections(List<BaseSection> sections) {
		for (BaseSection s : sections)
			if (!(s instanceof SectionWithCabins))
				throw new IllegalArgumentException("A cruiser can't have a section of type " + s.typeToString());
			
		return sections;
	}
}