package Travel;

import java.util.List;

import Travel.Forms.TravelCompanyForm;
import Travel.Trip.Trip;

public class TravelCompany {

	List<ConcreteVehicle> vehicles;
	List<Trip> trips;
	private String id;
	private String name;

	public TravelCompany(TravelCompanyForm f) {
		this.id = f.getID();
		this.name = f.getName();
		this.vehicles = f.getVehicles();
		this.trips = f.getTrips();
	}

	public String getID() { return id; }

	public String getName(){ return name; }
	
	public List<ConcreteVehicle> getVehicles() { return vehicles; }

	public List<Trip> getTrips() { return this.trips; }
	
	public boolean addVehicle(ConcreteVehicle v) {
		if (vehicles.contains(v))
			return false;
		return vehicles.add(v);
	}
	
	public boolean removeVehicle(ConcreteVehicle v){ return vehicles.remove(v); }
	public boolean removeVehicleFromID(String vehicleID){
		return vehicles.removeIf(v -> v.getId() == vehicleID);}

	public boolean addTrip(Trip trip) {
		if (trips.contains(trip)) return false;
		return trips.add(trip);
	}

	public boolean removeTrip(Trip trip){ return trips.remove(trips); }
	public boolean removeTripFromID(String tripID){ 
		return trips.removeIf(t -> t.getId() == tripID);}
}