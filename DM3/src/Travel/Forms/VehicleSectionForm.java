package Travel.Forms;

import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Sections.Row.RowType;

public class VehicleSectionForm {

	private char id;
	private int nbSpaces;
	private RowType disposition;

	/**
	 * 
	 * @param vs
	 */
	public VehicleSectionForm(BaseSection vs) {

		this.nbSpaces = vs.getTotalPassengerPlaces();
		
		//this.disposition = vs.get???
	}

	public char getId() {
		return this.id;
	}

	public void setId(char id) {
		this.id = id;
	}

	public int getNbSpaces() {
		return this.nbSpaces;
	}

	public void setNbSpaces(int nbSpaces) {
		this.nbSpaces = nbSpaces;
	}

	public RowType getDisposition() {
		return this.disposition;
	}

	public void setDisposition(RowType disposition) {
		this.disposition = disposition;
	}

}