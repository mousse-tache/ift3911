package Travel;

import Travel.VehicleModels.Sections.*;
import Travel.VehicleModels.Places.*;

public class ConcreteVehicle {

	private string id;
	private TravelCompany owner;
	private List trips;
	private TravelType type;

	public Set<BaseSection> getSections() {
		// TODO - implement ConcreteVehicle.getSections
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param section
	 */
	public Set<PassengerSpace> getPassengerSpaces(char section) {
		// TODO - implement ConcreteVehicle.getPassengerSpaces
		throw new UnsupportedOperationException();
	}

}