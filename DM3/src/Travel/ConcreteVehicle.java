package Travel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import Travel.Forms.ConcreteVehicleForm;
import Travel.Trip.Trip;
import Travel.VehicleModels.Places.PassengerSpace;
import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;
import Utils.Searcher.Searcher;

public class ConcreteVehicle {

	TravelCompany owner;
	TransportVehicleModel vehicleModel;
	private String id;
	private List<Trip> trips;
	private TravelType type;

	public ConcreteVehicle(ConcreteVehicleForm f) {
		this.owner = Searcher.getCompanyFromID(f.getID());
		this.vehicleModel = Searcher.getVehicleModelFromID(f.getID());
		this.id = f.getID();
		this.trips = new ArrayList<Trip>();
		f.getTripsID().forEach(id -> trips.add(Searcher.findTripFromID(id)));
		this.type = f.getType();
	}

	public Map<String, BaseSection> getSections() {
		return this.vehicleModel.getSections();
	}

	public Set<PassengerSpace> getPassengerSpaces(String section) {
		return this.vehicleModel.getPassengerSpaces(section);
	}

	public String getId() { return this.id; }

	public List<Trip> getTrips() { return this.trips; }

	public TravelType getType() { return this.type; }

	public String getOwnerID() { return this.owner.getID(); }
	public TravelCompany getOwner() { return this.owner; }

	public Set<PassengerSpace> getAllPassengerSpaces() {
		return this.vehicleModel.getAllPassengerSpaces();
	}

}
