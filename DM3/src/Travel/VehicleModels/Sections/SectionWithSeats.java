package Travel.VehicleModels.Sections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import Travel.VehicleModels.Places.PassengerSpace;
import Travel.VehicleModels.Places.Seat;
import Travel.VehicleModels.Sections.Row.RowType;

public abstract class SectionWithSeats extends BaseSection {

	List<Row> rows;

	private void createRows(RowType rowType, int nbRow) {
		if (nbRow > 26) throw new IllegalArgumentException("We currently don't allow row numbers to be past 'z'");
		this.rows = new ArrayList<Row>();
		for (char row='a';row<=nbRow;row++){
			rows.add(new Row(this, rowType, row));
		}
	}

	SectionWithSeats(Double priceRatio, String sectionType, int nbRow, RowType rowType) {
		super(priceRatio, sectionType);
		createRows(rowType,nbRow);
	}

	public Set<PassengerSpace> getAllPassengerPlaces(){
		Set<PassengerSpace> spaces = new HashSet<PassengerSpace>();
		for (Row r : rows){
			for (Seat s : r.getSeats()){
				spaces.add(s);
			}
		}
		return spaces;
	}
	
	public RowType getRowType(){
		return rows.get(0).getType();
	}

	public String typeToString(){
		return this.type + rows.get(0).typeToString();
	}

	public int getRowAmmount(){
		return rows.size();
	}

	public int getTotalPassengerPlaces(){
		int total = 0;
		for (Row r : rows){
			total += r.getSize();
		}
		return total;
	}
	
}