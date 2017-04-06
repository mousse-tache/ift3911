package Travel.VehicleModels.Sections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Travel.VehicleModels.Places.Cabin;
import Travel.VehicleModels.Places.PassengerSpace;

public abstract class SectionWithCabins extends BaseSection {

	List<Cabin> cabins;
	int capacity;

	SectionWithCabins(Double priceRatio, String type, int nbCabins, int capacity) {
		super(priceRatio, type);
		this.capacity = capacity;
		this.cabins = new ArrayList<Cabin>();
		for (int i=1; i<=nbCabins;i++){
			cabins.add(new Cabin(this, i));
		}
	}
	
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