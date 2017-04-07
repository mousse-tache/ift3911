package Travel.VehicleModels.Sections;

public class FamilySection extends SectionWithCabins {

	public static final String type = "F";

	public FamilySection(int nbCabins) {
		super(0.9, type, nbCabins, 6);
	}
}