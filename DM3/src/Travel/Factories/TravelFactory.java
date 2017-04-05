package Travel.Factories;

import Travel.*;
import Travel.Trip.*;
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
	 * @param id
	 * @param name
	 */
	public TravelCompany createCompany(string id, string name) {
		// TODO - implement TravelFactory.createCompany
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param departure
	 * @param it
	 * @param v
	 */
	public abstract Trip createTrip(DateTime departure, Itinerary it, ConcreteVehicle v);

	/**
	 * 
	 * @param id
	 * @param name
	 * @param location
	 */
	public abstract TransportFacility createFacility(string id, string name, string location);

	/**
	 * 
	 * @param owner
	 * @param v
	 */
	public abstract ConcreteVehicle createConcreteVehicule(TravelCompany owner, TransportVehicle v);

	/**
	 * 
	 * @param modelName
	 */
	public abstract TransportVehicle createVehicleModel(string modelName);

	/**
	 * 
	 * @param stops
	 */
	public Itinerary createItinerary(List<Stop<T>> stops) {
		// TODO - implement TravelFactory.createItinerary
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param departure
	 * @param it
	 * @param v
	 */
	public abstract Trip createTrip(DateTime departure, Itinerary it, ConcreteVehicle v);

	/**
	 * 
	 * @param departure
	 * @param it
	 * @param v
	 */
	public abstract Trip createTrip(DateTime departure, Itinerary it, ConcreteVehicle v);

	/**
	 * 
	 * @param departure
	 * @param it
	 * @param v
	 */
	public abstract Trip createTrip(DateTime departure, Itinerary it, ConcreteVehicle v);

	/**
	 * 
	 * @param departure
	 * @param it
	 * @param v
	 */
	public abstract Trip createTrip(DateTime departure, Itinerary it, ConcreteVehicle v);

}