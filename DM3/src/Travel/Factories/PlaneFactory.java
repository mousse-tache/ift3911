package Travel.Factories;

import Travel.Facilities.Airport;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ItineraryForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Forms.VehicleModelForm;
import Travel.Itineraries.FlightRoute;
import Travel.Itineraries.Itinerary;
import Travel.Trip.Flight;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.Plane;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class PlaneFactory extends TravelFactory {

	private static TravelFactory instance = new PlaneFactory();

	private PlaneFactory() { }

	protected static TravelFactory getInstance() {
		return instance;
	}

	@Override
	public Trip createTrip(TripForm f) {
		Trip t = new Flight(f);
		unusedTripID(t.getId());
		addTripToCompanyAndVehicle(t, f.getCompanyID(), f.getVehicleID());
		return t;
	}

	@Override
	public TravelFacility createFacility(TravelFacilityForm f) {
		TravelFacility tf = new Airport(f);
		unusedTravelFacilityID(tf.getId());
		return tf;
	}

	@Override
	public TransportVehicleModel createVehicleModel(VehicleModelForm f) {
		TransportVehicleModel tvm = new Plane(f);
		unusedVehicleID(tvm.getID());
		return tvm;
	}

	@Override
	public Itinerary createItinerary(ItineraryForm f) {
		Itinerary i = new FlightRoute(f);
		// Flight must have exactly 2 stops to be valid
		if(i.getDepartureLocation() != i.getArrivalLocation() && i.getStops().size() != 2){
			throw new IllegalArgumentException("Flight must have exactly 2 different stops to be valid");
		}
		return i;
	}

}