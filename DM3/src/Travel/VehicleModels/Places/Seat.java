package Travel.VehicleModels.Places;

public class Seat extends PassengerSpace {

	private char row;
	private int collumn;

	public Seat(char row, int collumn) {
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