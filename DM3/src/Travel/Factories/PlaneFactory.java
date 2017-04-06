package Travel.Factories;

import Travel.Trip.*;
import Travel.Forms.*;
import Travel.Facilities.*;
import Travel.*;
import Travel.VehicleModels.Vehicle.*;

public class PlaneFactory extends TravelFactory {

	private static PlaneFactory instance;

	private PlaneFactory() {
		// TODO - implement PlaneFactory.PlaneFactory
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public Trip createTrip(TripForm f) {
		// TODO - implement PlaneFactory.createTrip
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public TravelFacility createFacility(TravelFacilityForm f) {
		// TODO - implement PlaneFactory.createFacility
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param f
	 */
	public ConcreteVehicle createConcreteVehicule(ConcreteVehicleForm f) {
		// TODO - implement PlaneFactory.createConcreteVehicule
		throw new UnsupportedOperationException();
	}

	public TransportVehicleModel createVehicleModel() {
		// TODO - implement PlaneFactory.createVehicleModel
		throw new UnsupportedOperationException();
	}

}