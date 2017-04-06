package Travel.VehicleModels.Sections;

import Travel.VehicleModels.Sections.Row.RowType;

public class PremiumSection extends SectionWithSeats {
	public PremiumSection(int nbRow, RowType rowType) {
		super(0.6, "P", nbRow, rowType);
	}
}