package Sessions;

import Commands.Command;
import Commands.Executor;

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
        //C'est moi ou ce bout-là est pas très pertinent?
	public void executeCommand(Command c) {
		this.executor.execute(c);
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

	public void notifyObservers() {
		// TODO - implement Session.notifyAll
		throw new UnsupportedOperationException();
	}

	public Executor getExecutor() {
		return this.executor;
	}

}