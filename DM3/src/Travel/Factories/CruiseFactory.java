package Travel.Factories;

import Travel.Trip.*;
import Travel.Forms.*;
import Travel.Facilities.*;
import Travel.*;
import Travel.VehicleModels.Vehicle.*;

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

}