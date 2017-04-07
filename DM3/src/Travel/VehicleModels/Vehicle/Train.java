package Travel.VehicleModels.Vehicle;

import Travel.Forms.VehicleModelForm;
import java.util.List;

import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Sections.EconomicSection;
import Travel.VehicleModels.Sections.PremiumSection;

public class Train extends TransportVehicleModel {

	Train(String ID, String modelName, List<BaseSection> listSections) {
		super(ID, modelName, validSections(listSections));
	}
        
        public Train(VehicleModelForm form) {
		super(form);
	}
        
        
	private static List<BaseSection> validSections(List<BaseSection> sections) {
		for (BaseSection s : sections)
			if (!(s instanceof PremiumSection || s instanceof EconomicSection))
				throw new IllegalArgumentException("A train can't have section of type " + s.typeToString());
			
		return sections;
	}
}