package Travel.Facilities;

import Travel.TravelType;
import Travel.Forms.TravelFacilityForm;

public abstract class TravelFacility {

	protected String id;
	protected String location;
	protected String name;
	protected TravelType type;
	
	public TravelFacility(TravelFacilityForm tff){
		this.id = tff.getID();
		this.location = tff.getLocation();
		this.name = tff.getName();
		this.type = tff.getType();
	}

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