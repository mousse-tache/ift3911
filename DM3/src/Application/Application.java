package Application;

import java.util.Set;

import Sessions.Session;
import UI.HomeFrame;

public class Application {

	private static LiveStorage liveStorage;
	private static Set<Session> sessions;
	private static HomeFrame mainFrame;

	public void init() {
		// TODO - implement Application.init
		throw new UnsupportedOperationException();
	}

	public void showBaseGUI() {
		// TODO - implement Application.showBaseGUI
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param args
	 */
	public Application(String args[]) {
		mainFrame = new HomeFrame();
	}

	public static LiveStorage getStorage() {
		// TODO - implement Application.getStorage
		return liveStorage;
	}

}