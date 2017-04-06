package Travel.Factories;

import java.util.List;

import Travel.ConcreteVehicle;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ConcreteVehicleForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Itineraries.Itinerary;
import Travel.Itineraries.Stop;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class CruiseFactory extends TravelFactory {

	private static CruiseFactory instance;

	private CruiseFactory() {
		// TODO - implement CruiseFactory.CruiseFactory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public Trip createTrip(TripForm f) {
		// TODO - implement CruiseFactory.createTrip
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public TravelFacility createFacility(TravelFacilityForm f) {
		// TODO - implement CruiseFactory.createFacility
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public ConcreteVehicle createConcreteVehicule(ConcreteVehicleForm f) {
		// TODO - implement CruiseFactory.createConcreteVehicule
		throw new UnsupportedOperationException();
	}

	public TransportVehicleModel createVehicleModel() {
		// TODO - implement CruiseFactory.createVehicleModel
		throw new UnsupportedOperationException();
	}

	@Override
	public Itinerary createItinerary(List<Stop> stops) {
		// TODO - implement CruiseFactory.createItinerary
		throw new UnsupportedOperationException();
	}

}