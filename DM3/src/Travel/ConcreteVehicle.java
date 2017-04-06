package Travel;

import java.util.List;
import java.util.Set;

import Travel.VehicleModels.Places.PassengerSpace;
import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class ConcreteVehicle {

	TravelCompany owner;
	TransportVehicleModel vehicleModel;
	private String id;
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

	public String getId() {
		return this.id;
	}

	public List getTrips() {
		return this.trips;
	}

	public TravelType getType() {
		return this.type;
	}

	public String getOwnerID() {
		return this.owner.getID();
	}

}
