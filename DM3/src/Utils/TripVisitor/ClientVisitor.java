package Utils.TripVisitor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Travel.Itineraries.Stop;
import Travel.Trip.Trip;
import Travel.VehicleModels.Sections.BaseSection;
import Utils.DateUtils;
import Utils.MoneyUtils;

public class ClientVisitor implements Visitor {
	
	private String sectionType;
	
	// Note that you should use the class static type string for this
	// e.g. : new ClientTripVisitor(EconomicSection.type)
	public ClientVisitor(String sectionType){
		this.sectionType = sectionType;
	}

	// YUL-YYZ:[AIRCAN]AC481(2014.11.28:06.00-2014.11.28:07:24)|237.00|E50 (exemple pour les vols d'avion). 
	// Cette donnée représente le vol AC481 par AIRCAN partant de YUL le 28/11/2014 à 6h arrivant à YYZ le 
	// même jour à 7h24 ayant 50 sièges disponibles en classe Économie au prix de 237$.
	public String visit(Trip trip) throws IllegalArgumentException {
		List<String> results = new ArrayList<String>();
		List<String> temp;
		List<Stop> stops = trip.getItinerary().getStops();
		//YUL-YYZ:
		temp = new ArrayList<String>();
		stops.forEach(s -> temp.add(s.getLocation().getId()));
		results.add(String.join("-", temp));
		
		//[AIRCAN]AC481
		results.add("[" + trip.getCompany().getID() + "]" + trip.getId());

		//(2014.11.28:06.00-2014.11.28:07:24)              
		temp.clear();
		Date startDate = trip.getDepartureDateTime();
		stops.forEach(s -> temp.add(DateUtils.toString(
					DateUtils.addTimestampToDate(startDate, s.getTimeFromDeparture()))));
		results.add("(" + String.join("-", temp) + ")");

		//|237.00|E50
		BaseSection section = trip.getVehicle().getSections().get(sectionType);
		if (section == null)
			throw new IllegalArgumentException("Section " + sectionType + " does not exist for this trip");
		String price = MoneyUtils.doubleToString(trip.getBasePrice()*section.getPriceRatio());
		String sectionType = section.typeToString();
		int availablePlaces = section.getTotalPassengerPlaces() - trip.getNumberOfReservedSpacesInSection(sectionType);
		results.add("|" + price + "|" + sectionType + availablePlaces);

		return String.join("", results);
	}
}