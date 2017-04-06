package Travel.VehicleModels.Sections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Travel.VehicleModels.Places.PassengerSpace;
import Travel.VehicleModels.Places.Seat;

public abstract class SectionWithSeats extends BaseSection {

	List<Row> rows;

	public Set<PassengerSpace> getAllPassengerPlaces(){
		Set<PassengerSpace> spaces = new HashSet<PassengerSpace>();
		for (Row r : rows){
			for (Seat s : r.getSeats()){
				spaces.add(s);
			}
		}
		return spaces;
	}

	public int getTotalPassengerPlaces(){
		int total = 0;
		for (Row r : rows){
			total += r.getSize();
		}
		return total;
	}
}