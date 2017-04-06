package Travel.Trip;

import Utils.TripVisitor.*;
import java.util.*;
import Travel.*;
import Travel.Facilities.*;

public abstract class Trip implements IVisitable {

	List<ReservableForTrip> reservables;
	ConcreteVehicle vehicle;
	protected string id;
	protected Real basePrice;
	protected DateTime departureTime;
	protected TravelType type;
	protected TravelCompany company;

	public boolean canBeCanceledOrModified() {
		// TODO - implement Trip.canBeCanceledOrModified
		throw new UnsupportedOperationException();
	}

	public DateTime getDepartureTime() {
		return this.departureTime;
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

}