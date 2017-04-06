package Travel.Trip;

import Utils.TripVisitor.*;
import java.util.*;
import Travel.*;
import Travel.Facilities.*;
import Travel.Itineraries.*;

public abstract class Trip implements IVisitable {

	List<ReservableForTrip> reservables;
	ConcreteVehicle vehicle;
	protected string id;
	protected Real basePrice;
	protected DateTime departureTime;
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

	public DateTime getArrivalTime() {
		// TODO - implement Trip.getArrivalTime
		throw new UnsupportedOperationException();
	}

	public string getId() {
		return this.id;
	}

	public Real getBasePrice() {
		return this.basePrice;
	}

	public TravelType getType() {
		return this.type;
	}

	public TravelCompany getCompany() {
		return this.company;
	}

}