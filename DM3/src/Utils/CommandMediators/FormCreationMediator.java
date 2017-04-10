package Utils.CommandMediators;

import Travel.Forms.*;

public class FormCreationMediator {
    
	public BaseForm createVehicleForm(string id) {
        ConcreteVehicle vec = LiveStorage.getInstance().getVehicle(id);
        return vec?ConcreteVehicleForm(vec):null;
	}

	public BaseForm createTripForm(string id) {
        Trip trip = LiveStorage.getInstance().getTripid;
        return itinerary?TripForm(trip):null;
	}

	public BaseForm createItineraryForm(string id) {
        Itinerary itinerary = LiveStorage.getInstance().getItinerary(id);
        return itinerary?ItineraryForm(itinerary):null;
	}

	public BaseForm createClientForm(string id) {
        Client client = LiveStorage.getInstance().getClient(id);
        return client?ClientForm(client):null;
	}

	public BaseForm createFacilityForm(string id) {
        TravelFacility facility = LiveStorage.getInstance().getFacility(id);
        return facility?TravelFacilityForm(facility):null;
	}

	public BaseForm createCompanyForm(string id) {
        TravelCompany company = LiveStorage.getInstance().getCompany(id);
        return company?TravelCompanyForm(company):null;
	}
}
