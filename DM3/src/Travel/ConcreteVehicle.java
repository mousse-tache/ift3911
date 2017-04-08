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
	private String ID;
	private List<Trip> trips;
	private TravelType type;

	public ConcreteVehicle(ConcreteVehicleForm f) {
		this.ID = f.getID();
		this.type = f.getType();
		this.owner = Searcher.getCompanyFromID(f.getOwnerID());
		this.vehicleModel = Searcher.getVehicleModelFromID(f.getModelID());
		this.trips = new ArrayList<Trip>();
		f.getTripsID().forEach(id -> trips.add(Searcher.getTripFromID(id)));
	}

	public Map<String, BaseSection> getSections() {
		return this.vehicleModel.getSections();
	}

	public Set<PassengerSpace> getPassengerSpaces(String section) {
		return this.vehicleModel.getPassengerSpaces(section);
	}

	public String getId() { return this.ID; }

	public List<Trip> getTrips() { return this.trips; }

	public TravelType getType() { return this.type; }

	public TransportVehicleModel getModel() { return vehicleModel; }

	public String getOwnerID() { return this.owner.getID(); }
	public TravelCompany getOwner() { return this.owner; }

	public Set<PassengerSpace> getAllPassengerSpaces() {
		return this.vehicleModel.getAllPassengerSpaces();
	}

	public boolean addTrip(Trip trip) {
		if (trips.contains(trip)) return false;
		return trips.add(trip);
	}


}
