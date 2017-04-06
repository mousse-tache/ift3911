package Sessions;

import Commands.*;

public class Session implements IGUISubject {

	protected Executor executor;

	public boolean undo() {
		// TODO - implement Session.undo
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param c
	 */
	public void executeCommand(Command c) {
		// TODO - implement Session.executeCommand
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param IGUIObserver
	 */
	public void attach(int IGUIObserver) {
		// TODO - implement Session.attach
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param IGUIObserver
	 */
	public void detach(int IGUIObserver) {
		// TODO - implement Session.detach
		throw new UnsupportedOperationException();
	}

	public void notifyAll() {
		// TODO - implement Session.notifyAll
		throw new UnsupportedOperationException();
	}

	public Executor getExecutor() {
		return this.executor;
	}

}