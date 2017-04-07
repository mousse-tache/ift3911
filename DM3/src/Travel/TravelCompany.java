package Travel;

import java.util.List;

public class TravelCompany {

	List<ConcreteVehicle> vehicles;
	private String id;
	private String name;

	public String getID() {
		return id;
	}
	public String getName(){
		return name;
	}
	
	public List<ConcreteVehicle> getVehicles() {
		return vehicles;
	}
	
	public boolean addVehicle(ConcreteVehicle v) {
		if (vehicles.contains(v))
			return false;
		return vehicles.add(v);
	}
	
	public boolean removeVehicle(ConcreteVehicle v){
		return vehicles.remove(v);
	}
}