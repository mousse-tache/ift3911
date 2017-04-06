package Travel.Itineraries;

public class Stop<T> {

	private T location;
	private Time timeFromDeparture;

	public T getLocation() {
		return this.location;
	}

	public void setLocation(T location) {
		this.location = location;
	}

	public Time getTimeFromDeparture() {
		return this.timeFromDeparture;
	}

	public void setTimeFromDeparture(Time timeFromDeparture) {
		this.timeFromDeparture = timeFromDeparture;
	}

}