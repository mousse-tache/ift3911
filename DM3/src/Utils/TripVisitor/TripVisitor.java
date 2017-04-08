package Utils.TripVisitor;

import Travel.Trip.Trip;

public interface TripVisitor {

	String visit(Trip trip);

}