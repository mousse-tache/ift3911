package Utils.CommandMediators;

import Travel.Facilities.TravelFacility;
import Travel.Factories.TravelFactory;
import Travel.Forms.ConcreteVehicleForm;
import Travel.Forms.ItineraryForm;
import Travel.Forms.TravelCompanyForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Itineraries.Itinerary;

public class CreationMediator {

	public String createVehicle(ConcreteVehicleForm specs) {
        //TravelFactory fac = TravelFactory.getInstance(specs.getType());
        //ConcreteVehicle vec = fac.createConcreteVehicle(specs);
        //LiveStorage.getInstance().addVehicle(vec);
        //return vec.getID();
        return null;
	}

	public String createTrip(TripForm specs) {
            /*
        TravelFactory fac = TravelFactory.getInstance(specs.getType());
        Trip trip = fac.createTrip(specs);
        LiveStorage.getInstance().addTrip(trip);
        return vec.getID();
        */
        return null;
	}

	public String createCompany(TravelCompanyForm specs) {
            /*
        TravelFactory fac = TravelFactory.getInstance(specs.getType());
        Company company = fac.createCompany(specs);
        LiveStorage.getInstance().addCompany(company);
        return company.getID();
        */
        return null;
	}
        /*
	public String createClient(ClientForm specs) {
        TravelFactory fac = TravelFactory.getInstance(specs.getType());
        Client client = fac.createClient(specs);
        LiveStorage.getInstance().addClient(client);
        return client.getID();
        return null;
	}
        */

	public String createFacility(TravelFacilityForm specs) {
            
        TravelFactory fac = TravelFactory.getInstance(specs.getType());
        TravelFacility facility = fac.createFacility(specs);
        //LiveStorage.getInstance().addFacility(facility);
        return facility.getId();
	}

	public String createItinerary(ItineraryForm specs) {
        TravelFactory fac = TravelFactory.getInstance(specs.getType());
        Itinerary itinerary = fac.createItinerary(specs);
        //LiveStorage.getInstance().addItinerary(itinerary);
        return itinerary.getId();
       
	}
}
