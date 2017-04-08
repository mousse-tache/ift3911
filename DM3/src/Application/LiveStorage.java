package Application;

import java.text.ParseException;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Travel.TravelType;
import Travel.Facilities.TravelFacility;
import Travel.Factories.TravelFactory;
import Travel.Forms.ConcreteVehicleForm;
import Travel.Forms.ItineraryForm;
import Travel.Forms.TravelCompanyForm;
import Travel.Forms.TravelFacilityForm;
import Travel.Forms.TripForm;
import Travel.Forms.VehicleModelForm;
import Travel.Forms.VehicleSectionForm;
import Travel.Itineraries.FlightRoute;
import Travel.Itineraries.Itinerary;
import Travel.Trip.Trip;
import Travel.VehicleModels.Sections.BusinessSection;
import Travel.VehicleModels.Sections.EconomicSection;
import Travel.VehicleModels.Sections.FirstClassSection;
import Travel.VehicleModels.Sections.Row.RowType;
import Travel.VehicleModels.Vehicle.Plane;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;
import Utils.DateUtils;

public class LiveStorage {

	private static LiveStorage instance = new LiveStorage();
	private List<Trip> trips;
	private List<TravelFacility> travelFacilities;
	private List<TravelCompany> companies;
	private List<Itinerary> itineraries;
	private List<TransportVehicleModel> vehicleModels;

	private LiveStorage() {
		trips = new ArrayList<Trip>();
		travelFacilities = new ArrayList<TravelFacility>();
		companies = new ArrayList<TravelCompany>();
		itineraries = new ArrayList<Itinerary>();
		vehicleModels = new ArrayList<TransportVehicleModel>();
	}

	public static LiveStorage getInstance() {
		return instance;
	}
	
	// Basic populate of LiveStorage for testing purposes
	public void populate() {
		TravelFactory factory = TravelFactory.getInstance(TravelType.Plane);

		// A COMPANY
		TravelCompanyForm travelCompanyForm = new TravelCompanyForm("AIRCAN", "Air Canada");
		TravelCompany airCanada = factory.createCompany(travelCompanyForm);
		this.companies.add(airCanada);
		if (airCanada == null) System.out.println("OOPS");
		
		// TWO AIRPORTS
		TravelFacilityForm travelFacilityForm1 = new TravelFacilityForm(TravelType.Plane, "YUL", "Montreal", "Aeroport Pierre-Elliott Trudeau");
		TravelFacility aeroportMontreal = factory.createFacility(travelFacilityForm1);
		TravelFacilityForm travelFacilityForm2 = new TravelFacilityForm(TravelType.Plane, "JFK", "New York", "John F. Kennedy International Airport");
		TravelFacility aeroportNewYork = factory.createFacility(travelFacilityForm2);
		this.travelFacilities.add(aeroportMontreal);
		this.travelFacilities.add(aeroportNewYork);
		
		// THREE VEHICLE SECTIONS
		List<VehicleSectionForm> sectionForms = new ArrayList<VehicleSectionForm>();
		sectionForms.add(VehicleSectionForm.createPlaneSection(FirstClassSection.type, RowType.COMFORT, 10));
		sectionForms.add(VehicleSectionForm.createPlaneSection(BusinessSection.type, RowType.MEDIUM, 15));
		sectionForms.add(VehicleSectionForm.createPlaneSection(EconomicSection.type, RowType.LARGE, 25));
		
		// A VEHICLEMODEL
		VehicleModelForm vehicleModelForm = new VehicleModelForm(TravelType.Plane, "AB123", "AIRBUS123", sectionForms);
		TransportVehicleModel airbusModel = new Plane(vehicleModelForm);
		this.vehicleModels.add(airbusModel);
		
		// A VEHICLE
		ConcreteVehicleForm concreteVehicleForm = new ConcreteVehicleForm(airbusModel.getType(), "6354",airbusModel.getID(), airCanada.getID()); 
		ConcreteVehicle airbus = factory.createConcreteVehicule(concreteVehicleForm);

		// AN ITINERARY FROM MONTREAL TO NEW YORK IN TWO HOURS
		String[] locationIDs = {"YUL", "JFK"};
		Long[] times = { (long) 0 , (long) (1000*60*60*2) };
		ItineraryForm itineraryForm = new ItineraryForm(airbus.getType(), "AC123", Arrays.asList(locationIDs), Arrays.asList(times));
		Itinerary flightMontrealNewYork = new FlightRoute(itineraryForm);
		this.itineraries.add(flightMontrealNewYork);

		// A TRIP
		String tripDate = DateUtils.toString(Date.from(Instant.now()));
		TripForm tripForm;
		try { 
			tripForm = new TripForm(flightMontrealNewYork.getType(), "AC720",airCanada.getID(), airbus.getId(), flightMontrealNewYork.getId(), tripDate, "600.00");
			Trip trip = factory.createTrip(tripForm);
			this.trips.add(trip);
		} catch (ParseException e) { e.printStackTrace(); }
		
	}

	public List<Trip> getTrips() { return this.trips; }

	public List<TravelFacility> getTravelFacilities() { return this.travelFacilities; }

	public List<TravelCompany> getCompanies() { return this.companies; }
	
	public List<ConcreteVehicle> getConcreteVehicles(){
		List<ConcreteVehicle> vehicles = new ArrayList<ConcreteVehicle>();
		this.companies.forEach( c -> vehicles.addAll(c.getVehicles()));
		return vehicles;
	}

	public List<Itinerary> getItineraries() { return this.itineraries; }
	
	public List<TransportVehicleModel> getVehicleModels(){ return this.vehicleModels; }

}