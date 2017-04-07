package Application;

import java.util.ArrayList;
import java.util.List;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Travel.Facilities.TravelFacility;
import Travel.Itineraries.Itinerary;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class LiveStorage {

	private static LiveStorage instance = new LiveStorage();
	private List<Trip> trips;
	private List<TravelFacility> travelFacilities;
	private List<TravelCompany> companies;
	private List<Itinerary> itineraries;
	private List<TransportVehicleModel> vehicleModels;

	private LiveStorage() {
	}

	public static LiveStorage getInstance() {
		return instance;
	}

	public void populate() {
		// TODO - implement LiveStorage.populate
		throw new UnsupportedOperationException();
	}

	public List<Trip> getTrips() {
		return this.trips;
	}

	public List<TravelFacility> getTravelFacilities() {
		return this.travelFacilities;
	}

	public List<TravelCompany> getCompanies() {
		return this.companies;
	}
	
	public List<ConcreteVehicle> getConcreteVehicles(){
		List<ConcreteVehicle> vehicles = new ArrayList<ConcreteVehicle>();
		this.companies.forEach( c -> vehicles.addAll(c.getVehicles()));
		return vehicles;
	}

	public List<Itinerary> getItineraries() {
		return this.itineraries;
	}
	
	public List<TransportVehicleModel> getVehicleModels(){
		return this.vehicleModels;
	}

}