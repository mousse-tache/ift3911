package Travel.Factories;

import Travel.*;
import Travel.Forms.*;
import Travel.Trip.*;
import Travel.Facilities.*;
import Travel.VehicleModels.Vehicle.*;
import Travel.Itineraries.*;

public abstract class TravelFactory {

	/**
	 * 
	 * @param type
	 */
	public TravelFactory getInstance(TravelType type) {
		// TODO - implement TravelFactory.getInstance
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public TravelCompany createCompany(TravelCompanyForm f) {
		// TODO - implement TravelFactory.createCompany
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public abstract Trip createTrip(TripForm f);

	/**
	 * 
	 * @param f
	 */
	public abstract TravelFacility createFacility(TravelFacilityForm f);

	/**
	 * 
	 * @param f
	 */
	public abstract ConcreteVehicle createConcreteVehicule(ConcreteVehicleForm f);

	public abstract TransportVehicleModel createVehicleModel();

	/**
	 * 
	 * @param stops
	 */
	public Itinerary createItinerary(List<Stop<T>> stops) {
		// TODO - implement TravelFactory.createItinerary
		throw new UnsupportedOperationException();
	}

}