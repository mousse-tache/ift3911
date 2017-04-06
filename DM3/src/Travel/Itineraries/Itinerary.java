package Travel.Itineraries;

import java.sql.Time;
import java.util.List;

public abstract class Itinerary {

	protected String id;

	public String getId() { return this.id; }

	public abstract Stop getDeparture();

	public abstract Stop getArrival();

	public abstract Time getTripTime();

	public abstract List<Stop> getStops();
}