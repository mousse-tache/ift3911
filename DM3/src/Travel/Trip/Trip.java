package Travel.Trip;

import java.util.Date;
import java.util.List;

import Travel.ConcreteVehicle;
import Travel.ReservableForTrip;
import Travel.TravelCompany;
import Travel.TravelType;
import Travel.Facilities.TravelFacility;
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

	public boolean canBeCanceledOrModified() {
		// TODO - implement Trip.canBeCanceledOrModified
		throw new UnsupportedOperationException();
	}

	public TravelFacility getDepartureLocation() {
		// TODO - implement Trip.getDepartureLocation
		throw new UnsupportedOperationException();
	}

	public TravelFacility getArrivalLocation() {
		// TODO - implement Trip.getArrivalLocation
		throw new UnsupportedOperationException();
	}

	public Date getArrivalTime() {
		// TODO - implement Trip.getArrivalTime
		throw new UnsupportedOperationException();
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