package Travel.Forms;

import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Sections.RowType;

public class VehicleSectionForm {

	private char id;
	private int nbSpaces;
	private RowType disposition;

	/**
	 * 
	 * @param vs
	 */
	public VehicleSectionForm(BaseSection vs) {
		// TODO - implement VehicleSectionForm.VehicleSectionForm
		throw new UnsupportedOperationException();
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