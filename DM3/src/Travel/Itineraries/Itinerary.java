package Travel.Itineraries;

public abstract class Itinerary {

	protected string id;

	public abstract Stop getDeparture() {
		// TODO - implement Itinerary.getDeparture
		throw new UnsupportedOperationException();
	}

	public abstract Stop getArrival() {
		// TODO - implement Itinerary.getArrival
		throw new UnsupportedOperationException();
	}

	public abstract Time getTripTime() {
		// TODO - implement Itinerary.getTripTime
		throw new UnsupportedOperationException();
	}

	public abstract List<Stop<T>> getStops() {
		// TODO - implement Itinerary.getStops
		throw new UnsupportedOperationException();
	}

	public string getId() {
		return this.id;
	}

}