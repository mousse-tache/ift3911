package Travel.VehicleModels.Sections;

import java.util.ArrayList;
import java.util.List;

import Travel.VehicleModels.Places.Seat;

public class Row {

	public enum RowType {
		SMALL, COMFORT, MEDIUM, LARGE;

		public char toChar() {
			switch (this){
			case SMALL: return 'S';
			case COMFORT: return 'C';
			case MEDIUM: return 'M';
			case LARGE: return 'L';
			default: throw new IllegalArgumentException("Invalid Row Type: " + this);
			}
		}

		public int rowLength(){
			switch (this){
			case SMALL: return 3;
			case COMFORT: return 4;
			case MEDIUM: return 6;
			case LARGE: return 10;
			default: throw new IllegalArgumentException("Invalid Row Type: " + this);
			}
		}
	};

	SectionWithSeats section;
	private List<Seat> seats;
	private RowType rowType;
	private char row;
	
	Row(SectionWithSeats s, RowType rowType, char row){
		this.section = s;
		this.row = row;
		this.rowType = rowType;
		this.seats = new ArrayList<Seat>();
		for (int i=1; i<= rowType.rowLength(); i++){
			this.seats.add(new Seat(this.section, this.row, i));
		}
	}
	
	public char getRowChar() { return row; }

	public List<Seat> getSeats(){ return this.seats; }

	public RowType getType() { return rowType; }

	public int getSize() { return seats.size(); }
}