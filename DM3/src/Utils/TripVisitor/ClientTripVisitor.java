package Utils.TripVisitor;

import Travel.Trip.Trip;

public class ClientTripVisitor implements TripVisitor {

	// YUL-YYZ:[AIRCAN]AC481(2014.11.28:06.00-2014.11.28:07:24)|237.00|E50 (exemple pour les vols d'avion). 
	// Cette donnée représente le vol AC481 par AIRCAN partant de YUL le 28/11/2014 à 6h arrivant à YYZ le 
	// même jour à 7h24 ayant 50 sièges disponibles en classe Économie au prix de 237$.
	public String visit(Trip trip) {
		String result = new String();
		throw new UnsupportedOperationException();
	}
}