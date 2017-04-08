package Travel.VehicleModels.Places;

import Travel.VehicleModels.Sections.BaseSection;

public abstract class PassengerSpace {

	protected BaseSection section;
	
	public PassengerSpace(BaseSection section){
		this.section = section;
	}
	
	public Double getPriceRatio() {
		return this.section.getPriceRatio();
	}
	
	public String getSectionType(){
		return this.section.typeToString();
	}
	
	public abstract String placeCode();

}