package Application;

import java.util.List;

import Travel.TravelCompany;
import Travel.Facilities.TravelFacility;
import Travel.Trip.Trip;

public class LiveStorage {

	private static LiveStorage instance = new LiveStorage();
	private List<Trip> trips;
	private List<TravelFacility> travelFacilities;
	private List<TravelCompany> companies;

	private LiveStorage() {
		// TODO - implement LiveStorage.LiveStorage
		throw new UnsupportedOperationException();
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

}