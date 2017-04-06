package Travel.VehicleModels.Vehicle;

import Travel.VehicleModels.Sections.*;

public abstract class TransportVehicleModel {

	protected string ID;
	protected string modelName;
	protected List<BaseSection> sections;

	/**
	 * 
	 * @param section
	 */
	public abstract Set<PassengerSpaces> getPassengerSpaces(char section);

	public string getID() {
		return this.ID;
	}

	public string getModelName() {
		return this.modelName;
	}

	public List<BaseSection> getSections() {
		return this.sections;
	}

}