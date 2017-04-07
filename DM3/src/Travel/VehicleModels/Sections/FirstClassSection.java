package Travel.VehicleModels.Sections;

import Travel.VehicleModels.Sections.Row.RowType;

public class FirstClassSection extends SectionWithSeats {

	public static final String type = "FC";

	public FirstClassSection(int nbRow, RowType rowType) {
		super(1.0, "FC", nbRow, rowType);
	}
}