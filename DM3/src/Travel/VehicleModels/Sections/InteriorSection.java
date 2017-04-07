package Travel.VehicleModels.Sections;

public class InteriorSection extends SectionWithCabins {

	public static final String type = "I";

	public InteriorSection(int nbCabins) {
		super(0.5, type, nbCabins, 4);
	}
}