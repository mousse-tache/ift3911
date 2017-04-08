package Travel.Forms;

import java.util.ArrayList;
import java.util.List;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Travel.Trip.Trip;
import Utils.Searcher.Searcher;

public class TravelCompanyForm extends BaseForm {

	private String name;
	private List<String> vehiclesID;
	private List<String> tripsID;

	public TravelCompanyForm(TravelCompany tc) { 
		this.ID = tc.getID();
		this.name = tc.getName();
		this.vehiclesID = new ArrayList<String>();
		tc.getVehicles().forEach(v -> vehiclesID.add(v.getId()));
		this.tripsID = new ArrayList<String>();
		tc.getTrips().forEach(t -> tripsID.add(t.getId()));
	}

	public TravelCompanyForm(String companyID, String name) {
		this.ID = companyID;
		this.name = name;
		this.vehiclesID = new ArrayList<String>();
		this.tripsID = new ArrayList<String>();
	}

	public String getName() { return this.name; }

	public void setName(String name) { this.name = name; }
	
	public TravelCompany getCompany() { return Searcher.getCompanyFromID(this.ID); }
	public String getCompanyID() { return this.ID; }

	public void setCompany(TravelCompany company) { this.ID = company.getID(); }
	public void setCompany(String companyID) { this.ID = companyID; }

	public List<String> getVehiclesID() { return vehiclesID; }
	public List<ConcreteVehicle> getVehicles() { 
		List<ConcreteVehicle> vehicles = new ArrayList<ConcreteVehicle>();
		// TODO check if ID exists
		vehiclesID.forEach(id -> vehicles.add(Searcher.getVehicleFromID(id)));
		return vehicles;
	}

	public List<Trip> getTrips() {
		List<Trip> trips = new ArrayList<Trip>();
		// TODO check if ID exists
		tripsID.forEach(id -> trips.add(Searcher.getTripFromID(id)));
		return trips;
	}

	public void setVehiclesID(List<String> vehiclesID) { this.vehiclesID = vehiclesID; }
	public void setVehicles(List<ConcreteVehicle> vehicles) { 
		vehiclesID = new ArrayList<String>();
		vehicles.forEach(v -> vehiclesID.add(v.getId()));
	}

	public BaseForm createFromPrompt() {
		// TODO - implement TravelCompanyForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement TravelCompanyForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}



}