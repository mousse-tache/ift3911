package Travel.VehicleModels.Sections;

import Travel.VehicleModels.Sections.Row.RowType;

public class EconomicSection extends SectionWithSeats {

	public static final String type = "E";

	public EconomicSection(int nbRow, RowType rowType) {
		super(0.5, "E", nbRow, rowType);
	}
}