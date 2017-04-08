package Application;

import java.util.Set;

import Sessions.Session;
import Travel.Trip.Trip;
import UI.HomeFrame;
import Utils.Searcher.Searcher;
import Utils.TripVisitor.AdminTripVisitor;

public class Application {

	private static Set<Session> sessions;
	private static HomeFrame mainFrame;

	public void init() {

	}
	
	public void tests(){
		LiveStorage.getInstance().populate();
		Trip trip = Searcher.getTripFromID("AC720");
		AdminTripVisitor visitor = new AdminTripVisitor();
		String result = visitor.visit(trip);
		System.out.println(result);
	}

	public void showBaseGUI() {
		// TODO - implement Application.showBaseGUI
		throw new UnsupportedOperationException();
	}

	public Application(String args[]) {
//		mainFrame = new HomeFrame();
		tests();
	}

	public static LiveStorage getStorage() {
		return LiveStorage.getInstance();
	}

}