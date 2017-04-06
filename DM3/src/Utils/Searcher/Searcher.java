package Utils.Searcher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Application.Application;
import Reservation.Reservable;
import Travel.ReservableForTrip;
import Travel.Facilities.TravelFacility;
import Travel.Trip.Trip;
import Utils.DateUtils;

public class Searcher {

	public static List<Trip> getTripsFromLocationToLocationAtDate(TravelFacility from, TravelFacility to, Date date) {
		List<Trip> allTrips = Application.getStorage().getTrips();
		List<Trip> filtered = new ArrayList<Trip>();
		
		for(Trip t : allTrips){
			if(	t.getDepartureLocation().getId() == from.getId() &&
				t.getArrivalLocation().getId() == to.getId() &&
				DateUtils.isSameDay(t.getDepartureDateTime(),date)
				) filtered.add(t);
		}
		return filtered;
	}

	public static Trip findTripFromID(String tripID) {
		List<Trip> allTrips = Application.getStorage().getTrips();
		for(Trip t : allTrips){
			if (t.getId().equals(tripID)){
				return t;
			}
		}
		return null;
	}

	//TODO : getAvailableReservablesForTrip -> sectionType should be easier to use
	public static List<Reservable> getAvailableReservablesForTrip(Trip trip, String sectionType) {
		List<Reservable> filtered = new ArrayList<Reservable>();
		for (Reservable r : trip.getReservables()){
			if (!(r instanceof ReservableForTrip))
				continue;
			if(((ReservableForTrip)r).getPassengerSpace().getSectionType().equals(sectionType) && r.isAvailable())
				filtered.add(r);
		}
		return filtered;
	}

}