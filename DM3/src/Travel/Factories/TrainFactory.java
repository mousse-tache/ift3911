package Travel.Factories;

import Travel.Facilities.TrainStation;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ItineraryForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Forms.VehicleModelForm;
import Travel.Itineraries.Itinerary;
import Travel.Itineraries.TrainLine;
import Travel.Trip.TrainTrip;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.Train;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class TrainFactory extends TravelFactory {

	private static TravelFactory instance = new TrainFactory();

	private TrainFactory() { }

	protected static TravelFactory getInstance() {
		return instance;
	}

	public Trip createTrip(TripForm f) {
		Trip t = new TrainTrip(f);
		unusedTripID(t.getId());
		addTripToCompanyAndVehicle(t, f.getCompanyID(), f.getVehicleID());
		return t;
	}

	@Override
	public TravelFacility createFacility(TravelFacilityForm f) {
		TravelFacility tf = new TrainStation(f);
		unusedTravelFacilityID(tf.getId());
		return tf;
	}

	@Override
	public TransportVehicleModel createVehicleModel(VehicleModelForm f) {
		TransportVehicleModel tvm = new Train(f);
		unusedVehicleID(tvm.getID());
		return tvm;
	}

	@Override
	public Itinerary createItinerary(ItineraryForm f) {
		Itinerary i = new TrainLine(f);
		return i;
	}
}