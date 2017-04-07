package Travel.Factories;

import java.util.List;

import Travel.ConcreteVehicle;
import Travel.Facilities.Port;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ConcreteVehicleForm;
import Travel.Forms.TravelCompanyForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Itineraries.Itinerary;
import Travel.Itineraries.Stop;
import Travel.TravelCompany;
import Travel.Trip.Cruise;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class CruiseFactory extends TravelFactory {

	private static TravelFactory instance = new CruiseFactory();

	private CruiseFactory() {
	
	}

	/**
	 * 
	 * @param f
	 */
	public Trip createTrip(TripForm f) {
		return new Cruise(f);
	}

	/**
	 * 
	 * @param f
	 */
	public TravelFacility createFacility(TravelFacilityForm f) {
		return new Port();
	}

	/**
	 * 
	 * @param f
	 */
	public ConcreteVehicle createConcreteVehicule(ConcreteVehicleForm f) {
		return new ConcreteVehicle();
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

    @Override
    public TravelCompany createCompany(TravelCompanyForm f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}