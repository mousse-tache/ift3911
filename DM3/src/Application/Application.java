package Application;

import java.util.Set;

import Sessions.Session;
import Travel.Trip.Trip;
import Travel.VehicleModels.Sections.FirstClassSection;
import UI.HomeFrame;
import Utils.Searcher.Searcher;
import Utils.TripVisitor.AdminVisitor;
import Utils.TripVisitor.ClientVisitor;
import Utils.TripVisitor.Visitor;

public class Application {

	private static Set<Session> sessions;
	private static HomeFrame mainFrame;

	public void init() {

	}
	
	public void tests(){
		LiveStorage.getInstance().populate();

		Trip trip = Searcher.getTripFromID("AC720");

		Visitor visitor = new AdminVisitor();
		String result = visitor.visit(trip);
		System.out.println(result);

		visitor = new ClientVisitor(FirstClassSection.type);
		result = visitor.visit(trip);
		System.out.println(result);

		visitor = new ClientVisitor("blargh");
		try {result = visitor.visit(trip); }
		catch (IllegalArgumentException e) {
			result = e.getMessage();
		}
		System.out.println(result);
	}

	public void showBaseGUI() {
		// TODO - implement Application.showBaseGUI
		throw new UnsupportedOperationException();
	}

	public Application(String args[]) {
		tests();
                mainFrame = new HomeFrame();
	}

	public static LiveStorage getStorage() {
		return LiveStorage.getInstance();
	}

}