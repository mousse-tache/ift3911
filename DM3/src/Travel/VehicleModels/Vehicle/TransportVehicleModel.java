package Travel.VehicleModels.Vehicle;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

import Travel.VehicleModels.Places.PassengerSpace;
import Travel.VehicleModels.Sections.BaseSection;

public abstract class TransportVehicleModel {

	protected String ID;
	protected String modelName;
	protected Map<String, BaseSection> sections;

	TransportVehicleModel(String ID, String modelName, List<BaseSection> listSections){
		this.ID = ID;
		this.modelName = modelName;
		Map<String, BaseSection> sectionMap = new HashMap<String, BaseSection>();
		for (BaseSection s : listSections){
			if (sectionMap.containsKey(s.typeToString()))
				throw new IllegalArgumentException("Section " + s.typeToString() + " appears more than once");
			sectionMap.put(s.typeToString(), s);
		}
		this.sections = sectionMap;
	}

	public Set<PassengerSpace> getPassengerSpaces(String sectionString){
		return this.sections.get(sectionString).getAllPassengerPlaces();
	}

	public String getID() {
		return this.ID;
	}

	public String getModelName() {
		return this.modelName;
	}

	public Map<String, BaseSection> getSections() {
		return this.sections;
	}

	public Set<PassengerSpace> getAllPassengerSpaces() {
		Set<PassengerSpace> spaces = new HashSet<PassengerSpace>();
		sections.forEach( (k,v) -> spaces.addAll(v.getAllPassengerPlaces()));
		return spaces;
	}

}