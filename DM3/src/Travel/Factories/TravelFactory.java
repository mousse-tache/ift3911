package Travel.Factories;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Travel.TravelType;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ConcreteVehicleForm;
import Travel.Forms.ItineraryForm;
import Travel.Forms.TravelCompanyForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Forms.VehicleModelForm;
import Travel.Itineraries.Itinerary;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;
import Utils.Searcher.Searcher;

public abstract class TravelFactory {
        
	public static TravelFactory getInstance(TravelType type) {
		switch (type) {
			case Plane:
				return PlaneFactory.getInstance();
			case Train:
				return TrainFactory.getInstance();
			case Cruise:
				return CruiseFactory.getInstance();
			default:
				return null;
		}
	}

	public abstract Trip createTrip(TripForm f);

	public abstract TravelFacility createFacility(TravelFacilityForm f);

	public abstract TransportVehicleModel createVehicleModel(VehicleModelForm f);

	public abstract Itinerary createItinerary(ItineraryForm f);

	public TravelCompany createCompany(TravelCompanyForm f){
		TravelCompany tc = new TravelCompany(f);
		unusedTravelCompanyID(tc.getID());
		return tc;
	}

	public ConcreteVehicle createConcreteVehicule(ConcreteVehicleForm f) {
		ConcreteVehicle cv = new ConcreteVehicle(f);
		unusedVehicleID(cv.getId());
		addVehicleToCompany(f.getOwnerID(), cv);
		return cv;
	}

	protected void addVehicleToCompany(String travelCompanyID, ConcreteVehicle cv){
		Searcher.getCompanyFromID(travelCompanyID).addVehicle(cv);
	}
	
	protected void addTripToCompanyAndVehicle(Trip trip, String travelCompanyID, String vehicleID){
		Searcher.getCompanyFromID(travelCompanyID).addTrip(trip);
		Searcher.getVehicleFromID(vehicleID).addTrip(trip);
	}

	protected void unusedTravelCompanyID(String ID){
		if(Searcher.getCompanyFromID(ID) != null)
			throw new IllegalArgumentException("TravelCompany ID=" + ID +" already exists!");
	}

	protected void unusedTripID(String ID){
		if(Searcher.getTripFromID(ID) != null)
			throw new IllegalArgumentException("Trip ID=" + ID +" already exists!");
	}

	protected void unusedTravelFacilityID(String ID){
		if(Searcher.getTravelFacilityFromID(ID) != null)
			throw new IllegalArgumentException("TravelFacility ID=" + ID +" already exists!");
	}

	protected void unusedVehicleID(String ID){
		if(Searcher.getVehicleFromID(ID) != null)
			throw new IllegalArgumentException("Vehicle ID=" + ID +" already exists!");
	}

	protected void unusedItineraryID(String ID){
		if(Searcher.getItineraryFromID(ID) != null)
			throw new IllegalArgumentException("Itinerary ID=" + ID +" already exists!");
	}

	protected void unused(String ID){
		if(Searcher.getVehicleModelFromID(ID) != null)
			throw new IllegalArgumentException("VehicleModel ID=" + ID +" already exists!");
	}
}