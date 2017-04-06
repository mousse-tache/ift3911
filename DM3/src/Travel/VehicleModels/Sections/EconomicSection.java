package Travel.VehicleModels.Sections;

import Travel.VehicleModels.Sections.Row.RowType;

public class EconomicSection extends SectionWithSeats {
	public EconomicSection(int nbRow, RowType rowType) {
		super(0.5, "F", nbRow, rowType);
	}
}