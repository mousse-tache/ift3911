package Travel.Forms;

import Travel.*;
import Travel.Trip.*;

public class TripForm extends BaseForm {

	private Real basePrice;
	private DateTime departureTime;
	private String itineraryID;
	private String vehicleID;
	private TravelCompany company;

	public Real getBasePrice() {
		return this.basePrice;
	}

	public void setBasePrice(Real basePrice) {
		this.basePrice = basePrice;
	}

	public DateTime getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(DateTime departureTime) {
		this.departureTime = departureTime;
	}

	public String getItineraryID() {
		return this.itineraryID;
	}

	public void setItineraryID(String itineraryID) {
		this.itineraryID = itineraryID;
	}

	public String getVehicleID() {
		return this.vehicleID;
	}

	public void setVehicleID(String vehicleID) {
		this.vehicleID = vehicleID;
	}

	/**
	 * 
	 * @param t
	 */
	public TripForm(Trip t) {
		// TODO - implement TripForm.TripForm
		throw new UnsupportedOperationException();
	}

	public BaseForm createFromPrompt() {
		// TODO - implement TripForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement TripForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}

}