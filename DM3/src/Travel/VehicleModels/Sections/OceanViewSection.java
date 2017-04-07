package Travel.VehicleModels.Sections;

public class OceanViewSection extends SectionWithCabins {

	public static final String type = "O";

	public OceanViewSection(int nbCabins) {
		super(0.75, type, nbCabins, 2);
	}
}