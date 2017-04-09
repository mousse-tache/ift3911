package Sessions;

import UI.IGUIObserver;

public interface IGUISubject {

	void attach(IGUIObserver observer);

	void detach(IGUIObserver observer);

	void notifyObservers();

}