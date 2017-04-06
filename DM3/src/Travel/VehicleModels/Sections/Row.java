package Travel.VehicleModels.Sections;

import java.util.ArrayList;
import java.util.List;

import Travel.VehicleModels.Places.Seat;

public class Row {

	public enum RowType {
		SMALL,
		COMFORT,
		MEDIUM,
		LARGE;
	};

	SectionWithSeats section;
	private List<Seat> seats;
	private RowType rowType;
	private char row;
	
	Row(SectionWithSeats s, RowType rowType, char row){
		this.section = s;
		this.row = row;

		int colAmt;
		switch (rowType){
			case SMALL: colAmt = 3; break;
			case COMFORT: colAmt = 4; break;
			case MEDIUM: colAmt = 6; break;
			case LARGE: colAmt = 10; break;
			default: throw new IllegalArgumentException("Invalid Row Type given to row creation");
		}
		
		this.seats = new ArrayList<Seat>();
		for (int i=1; i<= colAmt; i++){
			this.seats.add(new Seat(this.row, i));
		}
	}
	
	public String typeToString(){
		switch (rowType){
			case SMALL: return "S";
			case COMFORT: return "C";
			case MEDIUM: return "M";
			case LARGE: return "L";
			default: return null;
		}
	}
	
	public char getRowChar() { return row; }

	public List<Seat> getSeats(){
		return this.seats;
	}

	public RowType getType() {
		return rowType;
	}

	public int getSize() {
		return seats.size();
	}
}