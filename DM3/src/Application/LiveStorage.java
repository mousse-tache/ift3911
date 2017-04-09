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
	public void populatePlaneTravels() {
		TravelFactory factory = TravelFactory.getInstance(TravelType.Plane);

		// A COMPANY
		TravelCompanyForm travelCompanyForm = new TravelCompanyForm("AIRCAN", "Air Canada");
		TravelCompany airCanada = factory.createCompany(travelCompanyForm);
		this.companies.add(airCanada);
		
		// TWO AIRPORTS
		TravelFacilityForm travelFacilityForm1 = new TravelFacilityForm(TravelType.Plane, "YUL", "Montreal", "Aeroport Pierre-Elliott Trudeau");
		TravelFacility aeroportMontreal = factory.createFacility(travelFacilityForm1);
		TravelFacilityForm travelFacilityForm2 = new TravelFacilityForm(TravelType.Plane, "JFK", "New York", "John F. Kennedy International Airport");
		TravelFacility aeroportNewYork = factory.createFacility(travelFacilityForm2);
		TravelFacilityForm travelFacilityForm3 = new TravelFacilityForm(TravelType.Plane, "ORY", "Paris", "Aeroport de Paris-Charles-de-Gaulle");
		TravelFacility aeroportParis = factory.createFacility(travelFacilityForm3);
		this.travelFacilities.add(aeroportMontreal);
		this.travelFacilities.add(aeroportNewYork);
		this.travelFacilities.add(aeroportParis);
		
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

		// AN ITINERARY FROM MONTREAL TO NEW YORK IN 2 HOURS
		String[] locationIDs1 = {"YUL", "JFK"};
		Long[] times1 = { (long) 0 , (long) (1000*60*60*2) };
		ItineraryForm itineraryForm = new ItineraryForm(airbus.getType(), "AC123", Arrays.asList(locationIDs1), Arrays.asList(times1));
		Itinerary flightMontrealNewYork = new FlightRoute(itineraryForm);
		this.itineraries.add(flightMontrealNewYork);
		
		// AN ITINERARY FROM PARIS TO MONTREAL IN 7 HOURS
		String[] locationIDs2 = {"ORY", "YUL"};
		Long[] times2 = { (long) 0 , (long) (1000*60*60*7) };
		ItineraryForm itineraryForm2 = new ItineraryForm(airbus.getType(), "AC425", Arrays.asList(locationIDs2), Arrays.asList(times2));
		Itinerary flightParisMontreal = new FlightRoute(itineraryForm2);
		this.itineraries.add(flightParisMontreal);

		// AN ITINERARY FROM NEW YORK TO MONTREAL IN 2 HOURS
		String[] locationIDs3 = {"JFK", "YUL"};
		Long[] times3 = { (long) 0 , (long) (1000*60*60*2) };
		ItineraryForm itineraryForm3 = new ItineraryForm(airbus.getType(), "AC125", Arrays.asList(locationIDs3), Arrays.asList(times3));
		Itinerary flightNewYorkMontreal = new FlightRoute(itineraryForm3);
		this.itineraries.add(flightNewYorkMontreal);

		// 3 TRIPS
		try { 
			String tripDate1 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 436534));
			String tripDate2 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 4534));
			String tripDate3 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 43645325));
			TripForm tripForm1 = new TripForm(flightMontrealNewYork.getType(), "AC720",airCanada.getID(), airbus.getId(), flightMontrealNewYork.getId(), tripDate1, "600.00");
			TripForm tripForm2 = new TripForm(flightParisMontreal.getType(), "AC720",airCanada.getID(), airbus.getId(), flightParisMontreal.getId(), tripDate2, "900.00");
			TripForm tripForm3 = new TripForm(flightNewYorkMontreal.getType(), "AC720",airCanada.getID(), airbus.getId(), flightNewYorkMontreal.getId(), tripDate3, "600.00");
			Trip trip1 = factory.createTrip(tripForm1);
			Trip trip2 = factory.createTrip(tripForm2);
			Trip trip3 = factory.createTrip(tripForm3);
			this.trips.add(trip1);
			this.trips.add(trip2);
			this.trips.add(trip3);
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