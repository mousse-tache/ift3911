package Travel.VehicleModels.Sections;

public class FamilyDeluxeSection extends SectionWithCabins {

	public static final String type = "D";

	public FamilyDeluxeSection(int nbCabins) {
		super(1.0, type, nbCabins, 6);
	}
}