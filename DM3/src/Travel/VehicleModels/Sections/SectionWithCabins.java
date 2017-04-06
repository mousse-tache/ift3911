package Travel.VehicleModels.Sections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Travel.VehicleModels.Places.Cabin;
import Travel.VehicleModels.Places.PassengerSpace;

public abstract class SectionWithCabins extends BaseSection {

	List<Cabin> cabins;
	
	public Set<PassengerSpace> getAllPassengerPlaces(){
		Set<PassengerSpace> spaces = new HashSet<PassengerSpace>();
		for (Cabin c : cabins){
			spaces.add(c);
		}
		return spaces;
	}

	public int getTotalPassengerPlaces(){
		return cabins.size();
	}

}