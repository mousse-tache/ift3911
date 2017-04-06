package Travel.Factories;

import Travel.Trip.*;
import Travel.Forms.*;
import Travel.Facilities.*;
import Travel.*;
import Travel.VehicleModels.Vehicle.*;

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

}