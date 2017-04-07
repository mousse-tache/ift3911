package Travel.VehicleModels.Sections;

import Travel.VehicleModels.Sections.Row.RowType;

public class BusinessSection extends SectionWithSeats {

	public static final String type = "B";

	public BusinessSection(int nbRow, RowType rowType) {
		super(0.75, "B", nbRow, rowType);
	}
}