package Utils.TripVisitor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Travel.Itineraries.Stop;
import Travel.Trip.Trip;
import Utils.DateUtils;
import Utils.MoneyUtils;

public class AdminVisitor implements Visitor {
	
	// YUL-YYZ:[AIRCAN]AC481(2014.11.28:06.00-2014.11.28:07:24)|PS(0/12)474.00|AM(5/16)355.50|EL(150/200)237.00 (exemple pour les vols d'avion).
	// Cette donnée représente le vol AC481 par AIRCAN partant de YUL le 28/11/2014 à 6h arrivant à YYZ le même jour à 7h24 ayant une classe 
	// Première étroite avec 0 sièges réservés sur 12 chacun coûtant 474$, une classe Affaire moyenne avec 5 sièges réservés sur 16 chacun coûtant
	// 355.50$ et une classe Économie large avec 150 sièges réservés sur 200 chacun coûtant 237$.
	public String visit(Trip trip) {
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

		//|PS(0/12)474.00|AM(5/16)355.50|EL(150/200)237.00
		trip.getVehicle().getSections().forEach((k, section) -> {
			String sectionType = section.typeToString();
			String price = MoneyUtils.doubleToString(trip.getBasePrice()*section.getPriceRatio());
			results.add("|" + sectionType
					+ "(" + trip.getNumberOfReservedSpacesInSection(sectionType) + "/"
					+ section.getTotalPassengerPlaces() + ")"
					+ price);
		});

		return String.join("", results);
	}
}