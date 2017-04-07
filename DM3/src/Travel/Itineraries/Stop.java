package Travel.Itineraries;

import Travel.Facilities.TravelFacility;

public class Stop {

	private TravelFacility location;
	private long timeFromDeparture;

	public Stop(TravelFacility tf, long time) {
		this.location = tf;
		this.timeFromDeparture = time;
	}

	public TravelFacility getLocation() {
		return this.location;
	}

	public void setLocation(TravelFacility location) {
		this.location = location;
	}

	public long getTimeFromDeparture() {
		return this.timeFromDeparture;
	}

	public void setTimeFromDeparture(long timeFromDeparture) {
		this.timeFromDeparture = timeFromDeparture;
	}

}