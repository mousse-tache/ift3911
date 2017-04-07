package Travel.Forms;

import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Sections.Row.RowType;
import Travel.VehicleModels.Sections.SectionWithSeats;

public class VehicleSectionForm {

	private int nbSpaces;
	private String sectionType;
	private RowType disposition;
	private int nbRows;

	public VehicleSectionForm(BaseSection vs) {
		this.nbSpaces = vs.getTotalPassengerPlaces();
		this.setSectionType(vs.typeToString());
		if (vs instanceof SectionWithSeats){
			this.disposition = ((SectionWithSeats) vs).getRowType();
			this.setNbRows(((SectionWithSeats) vs).getRowAmmount());
		}
	}

	public int getNbSpaces() { return this.nbSpaces; }

	public void setNbSpaces(int nbSpaces) { this.nbSpaces = nbSpaces; }

	public RowType getDisposition() { return this.disposition; }

	public void setDisposition(RowType disposition) { this.disposition = disposition; }

	public String getSectionType() { return sectionType; }

	public void setSectionType(String sectionType) { this.sectionType = sectionType; }

	public int getNbRows() { return nbRows; }

	public void setNbRows(int nbRows) { this.nbRows = nbRows; }


}