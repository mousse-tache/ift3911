package Utils.CommandMediators;

import Travel.Forms.*;

public class CreationMediator {

	public string createVehicle(ConcreteVehicleForm specs) {
        TravelFactory fac = TravelFactory.getInstance(specs.type);
        ConcreteVehicle vec = fac.createConcreteVehicle(specs);
        LiveStorage.getInstance().addVehicle(vec);
        return vec.getID();
	}

	public string createTrip(TripForm specs) {
        TravelFactory fac = TravelFactory.getInstance(specs.type);
        Trip trip = fac.createTrip(specs);
        LiveStorage.getInstance().addTrip(trip);
        return vec.getID();
	}

	public string createCompany(TravelCompanyForm specs) {
        TravelFactory fac = TravelFactory.getInstance(specs.type);
        Company company = fac.createCompany(specs);
        LiveStorage.getInstance().addCompany(company);
        return company.getID();
	}

	public string createClient(ClientForm specs) {
        TravelFactory fac = TravelFactory.getInstance(specs.type);
        Client client = fac.createClient(specs);
        LiveStorage.getInstance().addClient(client);
        return client.getID();
	}

	public string createFacility(TravelFacilityForm specs) {
        TravelFactory fac = TravelFactory.getInstance(specs.type);
        TravelFacility facility = fac.createFacility(specs);
        LiveStorage.getInstance().addFacility(facility);
        return facility.getID();
	}

	public string createItinerary(ItineraryForm specs) {
        TravelFactory fac = TravelFactory.getInstance(specs.type);
        Itinerary itinerary = fac.createItinerary(specs);
        LiveStorage.getInstance().addItinerary(itinerary);
        return itinerary.getID();
	}
}
