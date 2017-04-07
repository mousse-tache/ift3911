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
	
	protected static TravelFactory instance;
	
	protected static TravelFactory getInstance(){
		return instance;
	}
        
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

	public abstract TravelCompany createCompany(TravelCompanyForm f);

	public abstract Trip createTrip(TripForm f);

	public abstract TravelFacility createFacility(TravelFacilityForm f);

	public abstract ConcreteVehicle createConcreteVehicule(ConcreteVehicleForm f);

	public abstract TransportVehicleModel createVehicleModel(VehicleModelForm f);

	public abstract Itinerary createItinerary(ItineraryForm f);

	public void unusedTripID(String ID){
		if(Searcher.findTripFromID(ID) != null)
			throw new IllegalArgumentException("Trip ID=" + ID +" already exists!");
	}

	public void unusedTravelFacilityID(String ID){
		if(Searcher.getTravelFacilityFromID(ID) != null)
			throw new IllegalArgumentException("TravelFacility ID=" + ID +" already exists!");
	}

	public void unusedVehicleID(String ID){
		if(Searcher.getVehicleFromID(ID) != null)
			throw new IllegalArgumentException("Vehicle ID=" + ID +" already exists!");
	}

	public void unusedItineraryID(String ID){
		if(Searcher.getItineraryFromID(ID) != null)
			throw new IllegalArgumentException("Itinerary ID=" + ID +" already exists!");
	}

	public void unused(String ID){
		if(Searcher.getVehicleModelFromID(ID) != null)
			throw new IllegalArgumentException("VehicleModel ID=" + ID +" already exists!");
	}
}