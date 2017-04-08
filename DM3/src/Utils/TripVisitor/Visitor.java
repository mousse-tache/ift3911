package Utils.TripVisitor;

import Travel.Trip.Trip;

public interface Visitor {

	String visit(Trip trip);

}