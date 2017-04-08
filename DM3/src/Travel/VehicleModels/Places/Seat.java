package Travel.VehicleModels.Places;

import Travel.VehicleModels.Sections.SectionWithSeats;

public class Seat extends PassengerSpace {

	private char row;
	private int collumn;

	public Seat(SectionWithSeats section, char row, int collumn) {
		super(section);
		this.row = row;
		this.collumn = collumn;
	}
	
	public char getRow() {
		return row;
	}

	public int getCollumn() {
		return collumn;
	}

	@Override
	public String placeCode() {
		return this.row + Integer.toString(collumn);
	}
}