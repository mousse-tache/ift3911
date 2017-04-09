package Travel.Factories;

import Travel.Facilities.Port;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ItineraryForm;
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

	protected static TravelFactory getInstance() {
		return instance;
	}

	@Override
	public Trip createTrip(TripForm f) {
		Trip t = new Cruise(f);
		unusedTripID(t.getId());
		addTripToCompanyAndVehicle(t, f.getCompanyID(), f.getVehicleID());
		return t;
	}

	@Override
	public TravelFacility createFacility(TravelFacilityForm f) {
		Port p = new Port(f);
		unusedTravelFacilityID(p.getId());
		return p;
	}

	@Override
	public TransportVehicleModel createVehicleModel(VehicleModelForm f) {
		TransportVehicleModel tvm = new Cruiser(f);
		unusedVehicleID(tvm.getID());
		return tvm;
	}

	@Override
	public Itinerary createItinerary(ItineraryForm f) {
		Itinerary i = new CruiseRoute(f);
		// Cruise's first and last stop must be the same
		if(i.getDepartureLocation() != i.getArrivalLocation()){
			throw new IllegalArgumentException("Cruise first and last stop must be the same!");
		}
		// Cruise must have more than 2 stops to be valid
		if(i.getStops().size() < 3){
			throw new IllegalArgumentException("Cruise can't have less than 3 stops");
		}
		return i;
	}
}