package Commands;

import java.util.List;

public class Executor {

	private List<Command> history;

	/**
	 * 
	 * @param c
	 */
	public boolean execute(Command c) {
		// TODO - implement Executor.execute
                history.add(c);
                c.execute();
                return true;
	}

	public boolean undo() {
		// TODO - implement Executor.undo
		throw new UnsupportedOperationException();
	}

	public boolean canUndo() {
		// TODO - implement Executor.canUndo
		throw new UnsupportedOperationException();
	}

}