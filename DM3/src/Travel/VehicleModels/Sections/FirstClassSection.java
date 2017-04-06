package Travel.VehicleModels.Sections;

import Travel.VehicleModels.Sections.Row.RowType;

public class FirstClassSection extends SectionWithSeats {
	public FirstClassSection(int nbRow, RowType rowType) {
		super(1.0, "F", nbRow, rowType);
	}
}