package Travel.Forms;

import java.util.ArrayList;
import java.util.List;

import Travel.ConcreteVehicle;
import Travel.TravelType;
import Travel.Trip.Trip;


public class ConcreteVehicleForm extends BaseForm {

	private String modelID;
	private String ownerID;
	private List<String> tripsID;

	public ConcreteVehicleForm(ConcreteVehicle cv) {
		this.ID = cv.getId();
		this.type = cv.getType();
		this.modelID = cv.getModel().getID();
		this.ownerID = cv.getOwnerID();
		setTripsID(cv.getTrips());
	}

	public ConcreteVehicleForm(TravelType type, String vehicleID, String modelID, String ownerID) {
		this.ID = vehicleID;
		this.type = type;
		this.modelID = modelID;
		this.ownerID = ownerID; 
		this.tripsID = new ArrayList<String>();
	}

	public void setTripsID(List<Trip> trips) {
		this.tripsID = new ArrayList<String>();
		trips.forEach(t -> tripsID.add(t.getId()));
	}

	public String getModelID() { return this.modelID; }

	public void setModelID(String modelID) { this.modelID = modelID; }

	public String getOwnerID() { return this.ownerID; }

	public void setOwnerID(String ownerID) { this.ownerID = ownerID; }

	public List<String> getTripsID() { return tripsID; }

	public BaseForm createFromPrompt() {
		// TODO - implement ConcreteVehicleForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement ConcreteVehicleForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}
}
