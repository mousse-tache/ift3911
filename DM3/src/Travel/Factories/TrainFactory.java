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

public class TrainFactory extends TravelFactory {

	private static TrainFactory instance;

	private TrainFactory() {
		// TODO - implement TrainFactory.TrainFactory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public Trip createTrip(TripForm f) {
		// TODO - implement TrainFactory.createTrip
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public TravelFacility createFacility(TravelFacilityForm f) {
		// TODO - implement TrainFactory.createFacility
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public ConcreteVehicle createConcreteVehicule(ConcreteVehicleForm f) {
		// TODO - implement TrainFactory.createConcreteVehicule
		throw new UnsupportedOperationException();
	}

	public TransportVehicleModel createVehicleModel() {
		// TODO - implement TrainFactory.createVehicleModel
		throw new UnsupportedOperationException();
	}

	public Itinerary createItinerary(List<Stop> stops) {
		// TODO Auto-generated method stub
		return null;
	}

}