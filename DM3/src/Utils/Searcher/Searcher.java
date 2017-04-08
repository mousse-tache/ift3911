package Utils.Searcher;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Application.Application;
import Reservation.Reservable;
import Travel.ConcreteVehicle;
import Travel.ReservableForTrip;
import Travel.TravelCompany;
import Travel.Facilities.TravelFacility;
import Travel.Itineraries.Itinerary;
import Travel.Trip.Trip;
import Travel.VehicleModels.Vehicle.TransportVehicleModel;
import Utils.DateUtils;

public class Searcher {

	// TODO ? Add TravelType to research
	public static List<Trip> getTripsFromLocationToLocationAtDate(TravelFacility from, TravelFacility to, Date date) {
		List<Trip> allTrips = Application.getStorage().getTrips();
		List<Trip> filtered = new ArrayList<Trip>();
		
		for(Trip t : allTrips){
			if(	t.getDepartureLocation().getId() == from.getId()
				&& t.getArrivalLocation().getId() == to.getId()
				&& DateUtils.isSameDay(t.getDepartureDateTime(),date))
					filtered.add(t);
		}
		return filtered;
	}

	public static Trip getTripFromID(String tripID) {
		for(Trip t : Application.getStorage().getTrips()){
			if (t.getId().equals(tripID)){
				return t;
			}
		}
		return null;
	}

	//NOTE : use sectionType from one of the section classes (e.g : PremiumSection.type)
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

	public static ConcreteVehicle getVehicleFromID(String vehicleID) {
		for(TravelCompany c : Application.getStorage().getCompanies()){
			for(ConcreteVehicle v : c.getVehicles()){
				if (v.getId().equals(vehicleID)){
					return v;
				}
			}
		}
		return null;
	}

	public static Itinerary getItineraryFromID(String itineraryID) {
		for(Itinerary i : Application.getStorage().getItineraries()){
			if(i.getId().equals(itineraryID)){
				return i;
			}
		}
		return null;
	}

	public static TravelFacility getTravelFacilityFromID(String ID) {
		for(TravelFacility tf : Application.getStorage().getTravelFacilities()){
			if(tf.getId().equals(ID)){
				return tf;
			}
		}
		return null;
	}

	public static TransportVehicleModel getVehicleModelFromID(String ID) {
		for(TransportVehicleModel tvm : Application.getStorage().getVehicleModels()){
			if(tvm.getID().equals(ID)){
				return tvm;
			}
		}
		return null;
	}

	public static TravelCompany getCompanyFromID(String id) {
		for(TravelCompany tc : Application.getStorage().getCompanies()){
			if(tc.getID().equals(id)){
				return tc;
			}
		}
		return null;
	}
}