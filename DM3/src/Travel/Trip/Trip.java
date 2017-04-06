package Travel.Trip;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import Travel.ConcreteVehicle;
import Travel.ReservableForTrip;
import Travel.TravelCompany;
import Travel.TravelType;
import Travel.Facilities.TravelFacility;
import Travel.Forms.TripForm;
import Travel.Itineraries.Itinerary;
import Utils.TripVisitor.IVisitable;

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
		this.itinerary = form.getItineraryID();
	}

	public boolean canBeCanceledOrModified() {
		Date now = Date.from(Instant.now());
		long timeBeforeTrip = this.departureTime.getTime() - now.getTime();
		return timeBeforeTrip > TimeUnit.MILLISECONDS.toDays(1);
	}

	public TravelFacility getDepartureLocation() {
		return this.itinerary.getDeparture().getLocation();
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

}