package Travel.Factories;

import java.util.List;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Travel.TravelType;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ConcreteVehicleForm;
import Travel.Forms.TravelCompanyForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Itineraries.Itinerary;
import Travel.Itineraries.Stop;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public abstract class TravelFactory {
        
    
        private static TravelFactory instance;
	/**
	 * 
	 * @param type
	 */
	public TravelFactory getInstance(TravelType type) {
		return instance;
	}

	/**
	 * 
	 * @param f
	 */
	public abstract TravelCompany createCompany(TravelCompanyForm f);

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
	public abstract Itinerary createItinerary(List<Stop> stops);

}