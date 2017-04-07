package Travel.VehicleModels.Sections;

import java.util.Set;

import Travel.VehicleModels.Places.PassengerSpace;

public abstract class BaseSection {

	protected Double priceRatio;
	String type;
	
	BaseSection(Double priceRatio, String type){
		this.priceRatio = priceRatio;
		this.type = type;
	}

	public abstract Set<PassengerSpace> getAllPassengerPlaces();

	public abstract int getTotalPassengerPlaces();

	public String typeToString(){
		return this.type;
	}

	public Double getPriceRatio() {
		return this.priceRatio;
	}
}