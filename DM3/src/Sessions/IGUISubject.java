package Sessions;

public interface IGUISubject {

	/**
	 * 
	 * @param IGUIObserver
	 */
	void attach(int IGUIObserver);

	/**
	 * 
	 * @param IGUIObserver
	 */
	void detach(int IGUIObserver);

	void notifyObservers();

}