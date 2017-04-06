package Travel;

import java.util.List;
import java.util.Map;
import java.util.Set;

import Travel.Trip.Trip;
import Travel.VehicleModels.Places.PassengerSpace;
import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class ConcreteVehicle {

	TravelCompany owner;
	TransportVehicleModel vehicleModel;
	private String id;
	private List<Trip> trips;
	private TravelType type;

	public Map<String, BaseSection> getSections() {
		return this.vehicleModel.getSections();
	}

	/**
	 * 
	 * @param section
	 */
	public Set<PassengerSpace> getPassengerSpaces(String section) {
		return this.vehicleModel.getPassengerSpaces(section);
	}

	public String getId() {
		return this.id;
	}

	public List<Trip> getTrips() {
		return this.trips;
	}

	public TravelType getType() {
		return this.type;
	}

	public String getOwnerID() { return this.owner.getID(); }
	public TravelCompany getOwner() { return this.owner; }

}
