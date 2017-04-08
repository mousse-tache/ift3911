package Travel.Trip;

import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import Reservation.Reservable;
import Travel.ConcreteVehicle;
import Travel.ReservableForTrip;
import Travel.TravelCompany;
import Travel.TravelType;
import Travel.Facilities.TravelFacility;
import Travel.Forms.TripForm;
import Travel.Itineraries.Itinerary;
import Travel.VehicleModels.Places.PassengerSpace;
import Utils.Searcher.Searcher;
import Utils.TripVisitor.IVisitable;
import Utils.TripVisitor.TripVisitor;

public abstract class Trip implements IVisitable {

	Set<ReservableForTrip> reservables;

	ConcreteVehicle vehicle;
	protected String id;
	protected Double basePrice;
	protected Date departureTime;
	protected TravelType type;
	protected TravelCompany company;
	protected Itinerary itinerary;
	
	public Trip(TripForm form){
		this.id = form.getID();
		this.basePrice = form.getBasePrice();
		this.departureTime = form.getDepartureTime();
		this.type = form.getType();
		this.company = form.getCompany();
		this.vehicle = Searcher.getVehicleFromID(form.getVehicleID());
		this.itinerary = Searcher.getItineraryFromID(form.getItineraryID());
		assignReservables();
	}
	
	private void assignReservables(){
		reservables = new HashSet<ReservableForTrip>();
		for (PassengerSpace p : vehicle.getAllPassengerSpaces()){
			ReservableForTrip res = new ReservableForTrip(this, p, basePrice);
			reservables.add(res);
		}
	}
	
	public boolean hasReservations(){
		for (Reservable r : reservables)
			if (!r.isAvailable()) return true;
		return false;
	}
	
	public int getNumberOfReservedSpaces(){
		int amt = 0;
		for (Reservable r : reservables)
			if (!r.isAvailable()) amt++;
		return amt;
	}

	public boolean hasReservationsInSection(String sectionType){
		for (ReservableForTrip r : reservables)
			if (r.getPassengerSpace().getSectionType().equals(sectionType) && !r.isAvailable()) 
				return true;
		return false;
	}
	
	public int getNumberOfReservedSpacesInSection(String sectionType){
		int amt = 0;
		for (ReservableForTrip r : reservables)
			if (r.getPassengerSpace().getSectionType().equals(sectionType) && !r.isAvailable()) 
				amt++;
		return amt;
	}

	public boolean reservablesCanBeCanceledOrModified() {
		Date now = Date.from(Instant.now());
		long timeBeforeTrip = this.departureTime.getTime() - now.getTime();
		return timeBeforeTrip > TimeUnit.MILLISECONDS.toDays(1);
	}
	

	public Itinerary getItinerary(){ return this.itinerary; }

	public TravelFacility getDepartureLocation() { return this.getItinerary().getDeparture().getLocation(); }

	public Date getDepartureDateTime() { return this.departureTime; }

	public TravelFacility getArrivalLocation() { return this.getItinerary().getArrival().getLocation(); }
	
	public Date getArrivalTime() {
		long date = departureTime.getTime() + this.getItinerary().getTripTime();
		return new Date(date);
	}

	public String getId() { return this.id; }

	public Double getBasePrice() { return this.basePrice; }

	public ConcreteVehicle getVehicle(){ return vehicle; }
	
	public TravelType getType() { return this.type; }

	public TravelCompany getCompany() { return this.company; }

	public Set<ReservableForTrip> getReservables() { return reservables; }
	
	@Override
	public String accept(TripVisitor v) { return v.visit(this); }
}