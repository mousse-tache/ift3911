package Travel.Factories;

import Travel.Forms.VehicleSectionForm;
import Travel.VehicleModels.Sections.*;
import Travel.VehicleModels.Sections.Row.RowType;

public class VehicleSectionFactory {
	
	public static BaseSection createSection(VehicleSectionForm form){
		int nbCabins = form.getNbSpaces();
		int nbRow = form.getNbRows();
		RowType rowType = form.getDisposition();
		switch (form.getSectionType()){
		case FamilyDeluxeSection.type:
			return new FamilyDeluxeSection(nbCabins);
		case FamilySection.type:
			return new FamilySection(nbCabins);
		case InteriorSection.type:
			return new InteriorSection(nbCabins);
		case OceanViewSection.type:
			return new OceanViewSection(nbCabins);
		case SuiteSection.type:
			return new SuiteSection(nbCabins);
		case EconomicSection.type:
			return new EconomicSection(nbRow, rowType);
		case FirstClassSection.type:
			return new FirstClassSection(nbRow, rowType);
		case BusinessSection.type:
			return new BusinessSection(nbRow, rowType);
		case PremiumSection.type:
			return new PremiumSection(nbRow, rowType);
		default:
			return null;
		}
	}
}
