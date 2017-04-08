package Travel.Forms;

import Travel.VehicleModels.Sections.BaseSection;
import Travel.VehicleModels.Sections.Row.RowType;
import Travel.VehicleModels.Sections.SectionWithSeats;

public class VehicleSectionForm {

	private int nbSpaces;
	private String sectionType;
	private RowType rowType;
	private int nbRows;

	public VehicleSectionForm(BaseSection vs) {
		this.nbSpaces = vs.getTotalPassengerPlaces();
		this.setSectionType(vs.typeToString());
		if (vs instanceof SectionWithSeats){
			this.rowType = ((SectionWithSeats) vs).getRowType();
			this.setNbRows(((SectionWithSeats) vs).getRowAmmount());
		}
	}

	private VehicleSectionForm() { }
	
	public static VehicleSectionForm createPlaneSection(String sectionType, RowType rowType, int nbRows){
		VehicleSectionForm vsf = new VehicleSectionForm();
//		vsf.nbSpaces = 0;
		vsf.sectionType = sectionType;
		vsf.nbRows = nbRows;
		vsf.rowType = rowType;
		return vsf;
	}

	public static VehicleSectionForm createCruiseSection(String sectionType, int nbSpaces){
		VehicleSectionForm vsf = new VehicleSectionForm();
		vsf.nbSpaces = nbSpaces;
		vsf.sectionType = sectionType;
		return vsf;
	}
	public int getNbSpaces() { return this.nbSpaces; }

	public void setNbSpaces(int nbSpaces) { this.nbSpaces = nbSpaces; }

	public RowType getDisposition() { return this.rowType; }

	public void setDisposition(RowType disposition) { this.rowType = disposition; }

	public String getSectionType() { return sectionType; }

	public void setSectionType(String sectionType) { this.sectionType = sectionType; }

	public int getNbRows() { return nbRows; }

	public void setNbRows(int nbRows) { this.nbRows = nbRows; }


}