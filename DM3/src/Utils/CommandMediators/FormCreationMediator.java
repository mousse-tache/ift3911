package Utils.CommandMediators;

import Application.LiveStorage;
import Travel.ConcreteVehicle;
import Travel.Forms.*;
import Travel.Trip.Trip;

public class FormCreationMediator {
    
	public BaseForm createVehicleForm(String id) {
        //ConcreteVehicle vec = LiveStorage.getInstance().getVehicle(id);
        //return vec?ConcreteVehicleForm(vec):null;
        return null;
	}

	public BaseForm createTripForm(String id) {
        //Trip trip = LiveStorage.getInstance().getTrip(id);
        //return itinerary?TripForm(trip):null;
        return null;
	}

	public BaseForm createItineraryForm(String id) {
        //Itinerary itinerary = LiveStorage.getInstance().getItinerary(id);
        //return itinerary?ItineraryForm(itinerary):null;
        return null;
	}

	public BaseForm createClientForm(String id) {
        //Client client = LiveStorage.getInstance().getClient(id);
        //return client?ClientForm(client):null;
        return null;
	}

	public BaseForm createFacilityForm(String id) {
        //TravelFacility facility = LiveStorage.getInstance().getFacility(id);
        //return facility?TravelFacilityForm(facility):null;
        return null;
	}

	public BaseForm createCompanyForm(String id) {
        //TravelCompany company = LiveStorage.getInstance().getCompany(id);
        //return company?TravelCompanyForm(company):null;
        return null;
	}
}
