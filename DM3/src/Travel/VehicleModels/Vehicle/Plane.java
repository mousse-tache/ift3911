package Travel.VehicleModels.Vehicle;

import java.util.List;
import java.util.Set;

import Travel.VehicleModels.Places.PassengerSpace;
import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Sections.SectionWithSeats;

public class Plane extends TransportVehicleModel {

	Plane(String ID, String modelName, List<BaseSection> sections) {
		super(ID, modelName, validSections(sections));
	}

	private static List<BaseSection> validSections(List<BaseSection> sections) {
		for (BaseSection s : sections)
			if (!(s instanceof SectionWithSeats))
				throw new IllegalArgumentException("A plane can't have section of type " + s.typeToString());
			
		return sections;
	}

	/**
	 * 
	 * @param section
	 */
	public Set<PassengerSpace> getPassengerSpaces(char section) {
		// TODO - implement Plane.getPassengerSpaces
		throw new UnsupportedOperationException();
	}
}