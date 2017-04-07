package Utils.TripVisitor;

import Travel.Trip.Trip;

public class AdminTripVisitor implements TripVisitor {
	
	// YUL-YYZ:[AIRCAN]AC481(2014.11.28:06.00-2014.11.28:07:24)|PS(0/12)474.00|AM(5/16)355.50|EL(150/200)237.00 (exemple pour les vols d'avion).
	// Cette donnée représente le vol AC481 par AIRCAN partant de YUL le 28/11/2014 à 6h arrivant à YYZ le même jour à 7h24 ayant une classe 
	// Première étroite avec 0 sièges réservés sur 12 chacun coûtant 474$, une classe Affaire moyenne avec 5 sièges réservés sur 16 chacun coûtant
	// 355.50$ et une classe Économie large avec 150 sièges réservés sur 200 chacun coûtant 237$.
	public String visitTrip(Trip trip) {
		String result = new String();
		throw new UnsupportedOperationException();
	}
}