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
		if (nbRow > 52) 
			throw new IllegalArgumentException("We currently only allow rows in range [a-zA-Z]: " + nbRow + " is too many");
		this.rows = new ArrayList<Row>();
		for (int rowNumber=0;rowNumber<nbRow;rowNumber++){
			this.rows.add(new Row(this, rowType, getRowChar(rowNumber)));
		}
	}

	// TODO char aren't the way to go with this, we only accept 52 values...
	// Returns character from integer where 0 -> a
	private char getRowChar(int rowNumber) {
		return (char)((int)'a' + rowNumber);
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
		return this.rows.get(0).getType();
	}

	public String typeAndDispositionString(){
		return this.type + this.getRowType().toChar();
	}

	public int getRowAmmount(){
		return this.rows.size();
	}

	public int getTotalPassengerPlaces(){
		int total = 0;
		for (Row r : this.rows){
			total += r.getSize();
		}
		return total;
	}
	
}