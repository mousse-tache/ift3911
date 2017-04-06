package Travel.Forms;

import java.util.Date;

import Travel.TravelCompany;
import Travel.Trip.Trip;

public class TripForm extends BaseForm {

	private Double basePrice;
	private Date departureTime;
	private String itineraryID;
	private String vehicleID;
	private TravelCompany company;

	public Double getBasePrice() {
		return this.basePrice;
	}

	public void setBasePrice(Double basePrice) {
		this.basePrice = basePrice;
	}

	public Date getDepartureTime() {
		return this.departureTime;
	}

	public void setDepartureTime(Date departureTime) {
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
		this.basePrice = t.getBasePrice();
		this.departureTime = t.getArrivalTime();
		this.itineraryID = t.getItinerary().getId();
		this.vehicleID = t.getVehicle().getId();
		this.company = t.getCompany();

	}

	public BaseForm createFromPrompt() {
		// TODO - implement TripForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement TripForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}

	public TravelCompany getCompany() {
		return this.company;
	}

	public void setCompany(TravelCompany company) {
		this.company = company;
	}

}