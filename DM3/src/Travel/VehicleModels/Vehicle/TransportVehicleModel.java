package Travel.VehicleModels.Vehicle;

import java.util.List;
import java.util.Set;

import Travel.VehicleModels.Places.PassengerSpace;
import Travel.VehicleModels.Sections.BaseSection;

public abstract class TransportVehicleModel {

	protected String ID;
	protected String modelName;
	protected List<BaseSection> sections;

	/**
	 * 
	 * @param section
	 */
	public abstract Set<PassengerSpace> getPassengerSpaces(char section);

	public String getID() {
		return this.ID;
	}

	public String getModelName() {
		return this.modelName;
	}

	public List<BaseSection> getSections() {
		return this.sections;
	}

}