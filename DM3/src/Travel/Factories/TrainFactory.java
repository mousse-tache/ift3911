package Travel.Factories;

import java.util.List;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Travel.Facilities.TravelFacility;
import Travel.Forms.ConcreteVehicleForm;
import Travel.Forms.ItineraryForm;
import Travel.Forms.TravelCompanyForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Forms.VehicleModelForm;
import Travel.Itineraries.Itinerary;
import Travel.Itineraries.Stop;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;

public class TrainFactory extends TravelFactory {

	private static TravelFactory instance = new TrainFactory();

	private TrainFactory() { }

	public Trip createTrip(TripForm f) {
		// TODO - implement TrainFactory.createTrip
		throw new UnsupportedOperationException();
	}

	public TravelFacility createFacility(TravelFacilityForm f) {
		// TODO - implement TrainFactory.createFacility
		throw new UnsupportedOperationException();
	}

	public ConcreteVehicle createConcreteVehicule(ConcreteVehicleForm f) {
		// TODO - implement TrainFactory.createConcreteVehicule
		throw new UnsupportedOperationException();
	}

	public TransportVehicleModel createVehicleModel() {
		// TODO - implement TrainFactory.createVehicleModel
		throw new UnsupportedOperationException();
	}

	public Itinerary createItinerary(List<Stop> stops) {
		// TODO Auto-generated method stub
		return null;
	}

    @Override
    public TravelCompany createCompany(TravelCompanyForm f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public TransportVehicleModel createVehicleModel(VehicleModelForm f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Itinerary createItinerary(ItineraryForm f) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}