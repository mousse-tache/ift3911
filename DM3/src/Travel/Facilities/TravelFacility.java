package Travel.Facilities;

import Travel.TravelType;

public abstract class TravelFacility {

	protected String id;
	protected String location;
	protected String name;
	protected TravelType type;

	public String getId() {
		return this.id;
	}

	public String getLocation() {
		return this.location;
	}

	public String getName() {
		return this.name;
	}

	public TravelType getType() {
		return this.type;
	}

}