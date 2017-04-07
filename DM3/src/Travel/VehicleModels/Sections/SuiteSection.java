package Travel.VehicleModels.Sections;

public class SuiteSection extends SectionWithCabins {

	public static final String type = "S";

	public SuiteSection(int nbCabins) {
		super(0.9, type, nbCabins, 5);
	}
}