package Travel.Factories;

import java.util.List;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ConcreteVehicleForm;
import Travel.Forms.TravelCompanyForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Itineraries.Itinerary;
import Travel.Itineraries.Stop;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class PlaneFactory extends TravelFactory {

	private static TravelFactory instance = new PlaneFactory();

	private PlaneFactory() {
		
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

	public Itinerary createItinerary(List<Stop> stops) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public TravelCompany createCompany(TravelCompanyForm f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}