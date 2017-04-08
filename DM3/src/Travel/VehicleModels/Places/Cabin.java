package Travel.VehicleModels.Places;

import Travel.VehicleModels.Sections.SectionWithCabins;

public class Cabin extends PassengerSpace {

	private Integer cabinNumber;

	public Cabin(SectionWithCabins section, Integer cabinNumber){
		super(section);
		this.cabinNumber = cabinNumber;
	}

	@Override
	public String placeCode() {
		return cabinNumber.toString();
	}
}

