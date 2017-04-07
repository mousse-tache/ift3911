package Travel.Forms;

import java.util.ArrayList;
import java.util.List;

import Travel.ConcreteVehicle;
import Travel.TravelCompany;
import Utils.Searcher.Searcher;

public class TravelCompanyForm extends BaseForm {

	private String companyID;
	private String name;
	private List<String> vehiclesID;

	public TravelCompanyForm(TravelCompany tc) { 
		this.name = tc.getName();
		this.companyID = tc.getID();
		this.vehiclesID = new ArrayList<String>();
		tc.getVehicles().forEach(v -> vehiclesID.add(v.getId()));
	}

	public String getName() { return this.name; }

	public void setName(String name) { this.name = name; }
	
	public TravelCompany getCompany() { return Searcher.getCompanyFromID(this.companyID); }
	public String getCompanyID() { return this.companyID; }

	public void setCompany(TravelCompany company) { this.companyID = company.getID(); }
	public void setCompany(String companyID) { this.companyID = companyID; }

	public List<String> getVehiclesID() { return vehiclesID; }
	public List<ConcreteVehicle> getVehicles() { 
		List<ConcreteVehicle> vehicles = new ArrayList<ConcreteVehicle>();
		// TODO check if ID exists
		vehiclesID.forEach(id -> vehicles.add(Searcher.getVehicleFromID(id)));
		return vehicles;
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