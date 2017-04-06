package Travel.VehicleModels.Places;

import Travel.VehicleModels.Sections.SectionWithCabins;

public class Cabin extends PassengerSpace {

	SectionWithCabins section;
	private Integer cabinNumber;

	Cabin(SectionWithCabins section, Integer cabinNumber){
		this.section = section;
		this.cabinNumber = cabinNumber;
	}
}
