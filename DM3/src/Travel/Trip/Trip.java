package Travel.Trip;

import java.time.Instant;
import java.util.Date;
import java.util.List;
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

	List<ReservableForTrip> reservables;

	ConcreteVehicle vehicle;
	protected String id;
	protected Double basePrice;
	protected Date departureTime;
	protected TravelType type;
	protected TravelCompany company;
	Itinerary itinerary;
	
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
		for (PassengerSpace p : vehicle.getAllPassengerSpaces()){
			ReservableForTrip res = new ReservableForTrip();
		}
	}
	
	public boolean hasReservations(){
		for (Reservable r : reservables){
			if (!r.isAvailable())
				return true;
		}
		return false;
	}

	public boolean reservablesCanBeCanceledOrModified() {
		Date now = Date.from(Instant.now());
		long timeBeforeTrip = this.departureTime.getTime() - now.getTime();
		return timeBeforeTrip > TimeUnit.MILLISECONDS.toDays(1);
	}

	public TravelFacility getDepartureLocation() {
		return this.itinerary.getDeparture().getLocation();
	}

	public Date getDepartureDateTime() {
		return this.departureTime;
	}

	public TravelFacility getArrivalLocation() {
		return this.itinerary.getArrival().getLocation();
	}

	public Date getArrivalTime() {
		long date = departureTime.getTime() + this.itinerary.getTripTime().getTime();
		return new Date(date);
	}

	public String getId() {
		return this.id;
	}

	public Double getBasePrice() {
		return this.basePrice;
	}

	public TravelType getType() {
		return this.type;
	}

	public TravelCompany getCompany() {
		return this.company;
	}

	public List<ReservableForTrip> getReservables() {
		return reservables;
	}
	
	@Override
	public void accept(TripVisitor v) {
		v.visitTrip(this);
	}
}