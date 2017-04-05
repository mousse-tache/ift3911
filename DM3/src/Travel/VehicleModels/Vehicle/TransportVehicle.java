package Travel.VehicleModels.Vehicle;

import Travel.VehicleModels.Sections.*;

public abstract class TransportVehicle {

	private string modelName;
	private List<BaseSection> sections;

	/**
	 * 
	 * @param section
	 */
	public abstract Set<PassengerSpaces> getPassengerSpaces(char section);

}