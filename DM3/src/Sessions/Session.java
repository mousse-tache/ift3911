package Sessions;

import java.util.HashSet;
import java.util.Set;

import Commands.Command;
import Commands.Executor;
import UI.IGUIObserver;

public class Session implements IGUISubject {

	private Executor executor;
	private String userID;
	private Set<IGUIObserver> observers;
	
	public Session(String userID) {
		this.executor = new Executor();
		this.observers = new HashSet<IGUIObserver>();
		this.userID = userID;
	}

	public boolean undo() {
		return this.executor.undo();
	}

	public void executeCommand(Command c) {
		this.executor.execute(c);
	}
        
	@Override
	public void attach(IGUIObserver observer) {
		// Mostly for debug, shouldn't add the same observer twice
		if (this.observers.contains(observer))
			throw new IllegalArgumentException("Trying to add an observer which is already existant for this subject");
		this.observers.add(observer);
	}

	@Override
	public void detach(IGUIObserver observer) {
		// Mostly for debug, shouldn't delete an observer that doesn't exist
		if(!this.observers.remove(observer))
			throw new IllegalArgumentException("Trying to detach an observer which is not attached to this subject");
	}

	@Override
	public void notifyObservers() {
		this.observers.forEach(o -> o.notify());
	}
}