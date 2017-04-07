package Travel.Factories;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Travel.Facilities.Port;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ConcreteVehicleForm;
import Travel.Forms.ItineraryForm;
import Travel.Forms.TravelCompanyForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Forms.VehicleModelForm;
import Travel.Itineraries.CruiseRoute;
import Travel.Itineraries.Itinerary;
import Travel.Trip.Cruise;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.Cruiser;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class CruiseFactory extends TravelFactory {

	private static TravelFactory instance = new CruiseFactory();

	private CruiseFactory() { }

	public Trip createTrip(TripForm f) {
		Cruise c = new Cruise(f);
		unusedTripID(c.getId());
		return c;
	}

	public TravelFacility createFacility(TravelFacilityForm f) {
		Port p = new Port(f);
		unusedTravelFacilityID(p.getId());
		return p;
	}

	public ConcreteVehicle createConcreteVehicule(ConcreteVehicleForm f) {
		ConcreteVehicle cv = new ConcreteVehicle(f);
		unusedVehicleID(cv.getId());
		return cv;
	}

	public TransportVehicleModel createVehicleModel(VehicleModelForm f) {
		TransportVehicleModel tvm = new Cruiser(f);
		unusedVehicleID(tvm.getID());
		return tvm;
	}

	@Override
	public Itinerary createItinerary(ItineraryForm f) {
		Itinerary i = new CruiseRoute(f);
		// Cruise first and last stop must be the same
		if(i.getDepartureLocation() != i.getArrivalLocation()){
			throw new IllegalArgumentException("Cruise first and last stop must be the same!");
		}
		// Cruise must have more than 2 stops to be valid
		if(i.getDepartureLocation() != i.getArrivalLocation()){
			throw new IllegalArgumentException("Cruise first and last stop must be the same!");
		}
		return i;
	}

    @Override
    public TravelCompany createCompany(TravelCompanyForm f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}