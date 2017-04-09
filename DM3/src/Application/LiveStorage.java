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
import Travel.VehicleModels.Sections.FamilyDeluxeSection;
import Travel.VehicleModels.Sections.FamilySection;
import Travel.VehicleModels.Sections.FirstClassSection;
import Travel.VehicleModels.Sections.InteriorSection;
import Travel.VehicleModels.Sections.OceanViewSection;
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
		
		// 3 AIRPORTS
		TravelFacilityForm travelFacilityForm1 = new TravelFacilityForm(TravelType.Plane, "YUL", "Montreal", "Aeroport Pierre-Elliott Trudeau");
		TravelFacilityForm travelFacilityForm2 = new TravelFacilityForm(TravelType.Plane, "JFK", "New York", "John F. Kennedy International Airport");
		TravelFacilityForm travelFacilityForm3 = new TravelFacilityForm(TravelType.Plane, "ORY", "Paris", "Aeroport de Paris-Charles-de-Gaulle");
		TravelFacility aeroportMontreal = factory.createFacility(travelFacilityForm1);
		TravelFacility aeroportNewYork = factory.createFacility(travelFacilityForm2);
		TravelFacility aeroportParis = factory.createFacility(travelFacilityForm3);
		this.travelFacilities.add(aeroportMontreal);
		this.travelFacilities.add(aeroportNewYork);
		this.travelFacilities.add(aeroportParis);
		
		// THREE VEHICLE SECTIONS
		List<VehicleSectionForm> sectionForms = new ArrayList<VehicleSectionForm>();
		sectionForms.add(VehicleSectionForm.createSectionWithSeats(FirstClassSection.type, RowType.COMFORT, 10));
		sectionForms.add(VehicleSectionForm.createSectionWithSeats(BusinessSection.type, RowType.MEDIUM, 15));
		sectionForms.add(VehicleSectionForm.createSectionWithSeats(EconomicSection.type, RowType.LARGE, 25));
		
		// A VEHICLEMODEL
		VehicleModelForm vehicleModelForm = new VehicleModelForm(TravelType.Plane, "AB123", "AIRBUS123", sectionForms);
		TransportVehicleModel airbusModel = factory.createVehicleModel(vehicleModelForm);
		this.vehicleModels.add(airbusModel);
		
		// A VEHICLE
		ConcreteVehicleForm concreteVehicleForm = new ConcreteVehicleForm(airbusModel.getType(), "6354",airbusModel.getID(), airCanada.getID()); 
		ConcreteVehicle airbus = factory.createConcreteVehicule(concreteVehicleForm);

		// AN ITINERARY FROM MONTREAL TO NEW YORK IN 2 HOURS
		String[] locationIDs1 = {"YUL", "JFK"};
		Long[] times1 = { (long) 0 , (long) (1000*60*60*2) };
		ItineraryForm itineraryForm = new ItineraryForm(airbus.getType(), "AC123", Arrays.asList(locationIDs1), Arrays.asList(times1));
		Itinerary flightMontrealNewYork = factory.createItinerary(itineraryForm);
		this.itineraries.add(flightMontrealNewYork);
		
		// AN ITINERARY FROM PARIS TO MONTREAL IN 7 HOURS
		String[] locationIDs2 = {"ORY", "YUL"};
		Long[] times2 = { (long) 0 , (long) (1000*60*60*7) };
		ItineraryForm itineraryForm2 = new ItineraryForm(airbus.getType(), "AC425", Arrays.asList(locationIDs2), Arrays.asList(times2));
		Itinerary flightParisMontreal = factory.createItinerary(itineraryForm2);
		this.itineraries.add(flightParisMontreal);

		// AN ITINERARY FROM NEW YORK TO MONTREAL IN 2 HOURS
		String[] locationIDs3 = {"JFK", "YUL"};
		Long[] times3 = { (long) 0 , (long) (1000*60*60*2) };
		ItineraryForm itineraryForm3 = new ItineraryForm(airbus.getType(), "AC425", Arrays.asList(locationIDs3), Arrays.asList(times3));
		Itinerary flightNewYorkMontreal = factory.createItinerary(itineraryForm3);
		this.itineraries.add(flightNewYorkMontreal);

		// 3 TRIPS
		try { 
			String tripDate1 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 436534));
			String tripDate2 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 4534));
			String tripDate3 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 43645325));
			TripForm tripForm1 = new TripForm(flightMontrealNewYork.getType(), "AC520",airCanada.getID(), airbus.getId(), flightMontrealNewYork.getId(), tripDate1, "600.00");
			TripForm tripForm2 = new TripForm(flightParisMontreal.getType(), "AC620",airCanada.getID(), airbus.getId(), flightParisMontreal.getId(), tripDate2, "900.00");
			TripForm tripForm3 = new TripForm(flightNewYorkMontreal.getType(), "AC720",airCanada.getID(), airbus.getId(), flightNewYorkMontreal.getId(), tripDate3, "600.00");
			Trip trip1 = factory.createTrip(tripForm1);
			this.trips.add(trip1);
			Trip trip2 = factory.createTrip(tripForm2);
			this.trips.add(trip2);
			Trip trip3 = factory.createTrip(tripForm3);
			this.trips.add(trip3);
		} catch (ParseException e) { e.printStackTrace(); }
		
	}

	// Basic populate of LiveStorage for testing purposes
	public void populateCruiseTravels() {
		TravelFactory factory = TravelFactory.getInstance(TravelType.Cruise);

		// A COMPANY
		TravelCompanyForm travelCompanyForm = new TravelCompanyForm("WATCAN", "Water Ways Canada");
		TravelCompany waterWaysCanada = factory.createCompany(travelCompanyForm);
		this.companies.add(waterWaysCanada);
		
		// 3 PORTS
		TravelFacilityForm travelFacilityForm1 = new TravelFacilityForm(TravelType.Cruise, "WUL", "Montreal", "Port de Montreal");
		TravelFacility portMontreal = factory.createFacility(travelFacilityForm1);
		this.travelFacilities.add(portMontreal);
		TravelFacilityForm travelFacilityForm2 = new TravelFacilityForm(TravelType.Cruise, "WFK", "New York", "Port of New York");
		TravelFacility portNewYork = factory.createFacility(travelFacilityForm2);
		this.travelFacilities.add(portNewYork);
		TravelFacilityForm travelFacilityForm3 = new TravelFacilityForm(TravelType.Cruise, "WRY", "Paris", "Port de Paris");
		TravelFacility portParis = factory.createFacility(travelFacilityForm3);
		this.travelFacilities.add(portParis);
		
		// THREE VEHICLE SECTIONS
		List<VehicleSectionForm> sectionForms = new ArrayList<VehicleSectionForm>();
		sectionForms.add(VehicleSectionForm.createSectionWithCabins(FamilySection.type, 30));
		sectionForms.add(VehicleSectionForm.createSectionWithCabins(FamilyDeluxeSection.type, 10));
		sectionForms.add(VehicleSectionForm.createSectionWithCabins(InteriorSection.type, 60));
		sectionForms.add(VehicleSectionForm.createSectionWithCabins(OceanViewSection.type, 60));
		
		// A VEHICLEMODEL
		VehicleModelForm vehicleModelForm = new VehicleModelForm(TravelType.Cruise, "WB123", "WATER BUS 123", sectionForms);
		TransportVehicleModel waterbusModel = factory.createVehicleModel(vehicleModelForm);
		this.vehicleModels.add(waterbusModel);
		
		// A VEHICLE
		ConcreteVehicleForm concreteVehicleForm = new ConcreteVehicleForm(waterbusModel.getType(), "6254",waterbusModel.getID(), waterWaysCanada.getID()); 
		ConcreteVehicle waterbus = factory.createConcreteVehicule(concreteVehicleForm);

		// AN ITINERARY FROM MONTREAL TO NEW YORK TO PARIS TO MONTREAL IN 2 WEEKS (of course)
		String[] locationIDs1 = {"WUL", "WFK", "WRY", "WUL"};
		Long[] times1 = { (long) 0 , (long) (1000*60*60*24*3), (long) (1000*60*60*24*8), (long) (1000*60*60*24*14) };
		ItineraryForm itineraryForm = new ItineraryForm(waterbus.getType(), "WC123", Arrays.asList(locationIDs1), Arrays.asList(times1));
		Itinerary cruiseMontrealNewYorkParis = factory.createItinerary(itineraryForm);
		this.itineraries.add(cruiseMontrealNewYorkParis);

		// 2 TRIPS
		try { 
			String tripDate1 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 0));
			TripForm tripForm1 = new TripForm(cruiseMontrealNewYorkParis.getType(), "WC520",waterWaysCanada.getID(), waterbus.getId(), cruiseMontrealNewYorkParis.getId(), tripDate1, "600.00");
			Trip trip1 = factory.createTrip(tripForm1);
			this.trips.add(trip1);
			String tripDate2 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 1000*60*60*24*14));
			TripForm tripForm2 = new TripForm(cruiseMontrealNewYorkParis.getType(), "WC720",waterWaysCanada.getID(), waterbus.getId(), cruiseMontrealNewYorkParis.getId(), tripDate2, "900.00");
			Trip trip2 = factory.createTrip(tripForm2);
			this.trips.add(trip2);
		} catch (ParseException e) { e.printStackTrace(); }
		
	}	
	
	// Basic populate of LiveStorage for testing purposes
	public void populateTrainTravels() {
		TravelFactory factory = TravelFactory.getInstance(TravelType.Train);

		// A COMPANY
		TravelCompanyForm travelCompanyForm = new TravelCompanyForm("CANPAC", "Canadien pacific");
		TravelCompany canadienPacific = factory.createCompany(travelCompanyForm);
		this.companies.add(canadienPacific);
		
		// 3 TRAIN STATIONS
		TravelFacilityForm travelFacilityForm1 = new TravelFacilityForm(TravelType.Train, "TUL", "Montreal", "Station ferroviere de Montreal");
		TravelFacility trainStationMontreal = factory.createFacility(travelFacilityForm1);
		this.travelFacilities.add(trainStationMontreal);
		TravelFacilityForm travelFacilityForm2 = new TravelFacilityForm(TravelType.Train, "TFK", "New York", "Train Station of New York");
		TravelFacility trainStationNewYork = factory.createFacility(travelFacilityForm2);
		this.travelFacilities.add(trainStationNewYork);
		TravelFacilityForm travelFacilityForm3 = new TravelFacilityForm(TravelType.Train, "TQC", "Quebec", "Station Ferroviere de Quebec");
		TravelFacility trainStationQuebec = factory.createFacility(travelFacilityForm3);
		this.travelFacilities.add(trainStationQuebec);
		
		// THREE VEHICLE SECTIONS
		List<VehicleSectionForm> sectionForms = new ArrayList<VehicleSectionForm>();
		sectionForms.add(VehicleSectionForm.createSectionWithSeats(FirstClassSection.type, RowType.COMFORT, 10));
		sectionForms.add(VehicleSectionForm.createSectionWithSeats(BusinessSection.type, RowType.MEDIUM, 15));
		sectionForms.add(VehicleSectionForm.createSectionWithSeats(EconomicSection.type, RowType.LARGE, 25));
		
		// A VEHICLEMODEL
		VehicleModelForm vehicleModelForm = new VehicleModelForm(TravelType.Train, "TB123", "TRAIN BUS 123", sectionForms);
		TransportVehicleModel trainbusModel = factory.createVehicleModel(vehicleModelForm);
		this.vehicleModels.add(trainbusModel);
		
		// A VEHICLE
		ConcreteVehicleForm concreteVehicleForm = new ConcreteVehicleForm(trainbusModel.getType(), "6257",trainbusModel.getID(), canadienPacific.getID()); 
		ConcreteVehicle trainbus = factory.createConcreteVehicule(concreteVehicleForm);

		// AN ITINERARY FROM MONTREAL TO NEW YORK TO PARIS TO MONTREAL IN 1 day
		String[] locationIDs1 = {"TQC", "TUL", "TFK"};
		Long[] times1 = { (long) 0 , (long) (1000*60*60*12), (long) (1000*60*60*24) };
		ItineraryForm itineraryForm = new ItineraryForm(trainbus.getType(), "TC123", Arrays.asList(locationIDs1), Arrays.asList(times1));
		Itinerary pathQuebecMontrealNewYork = factory.createItinerary(itineraryForm);
		this.itineraries.add(pathQuebecMontrealNewYork);

		// 2 TRIPS
		try { 
			String tripDate1 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 0));
			TripForm tripForm1 = new TripForm(pathQuebecMontrealNewYork.getType(), "TC520",canadienPacific.getID(), trainbus.getId(), pathQuebecMontrealNewYork.getId(), tripDate1, "600.00");
			Trip trip1 = factory.createTrip(tripForm1);
			this.trips.add(trip1);
			String tripDate2 = DateUtils.toString(DateUtils.addTimestampToDate(Date.from(Instant.now()), 1000*60*60*24*14));
			TripForm tripForm2 = new TripForm(pathQuebecMontrealNewYork.getType(), "TC720",canadienPacific.getID(), trainbus.getId(), pathQuebecMontrealNewYork.getId(), tripDate2, "900.00");
			Trip trip2 = factory.createTrip(tripForm2);
			this.trips.add(trip2);
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