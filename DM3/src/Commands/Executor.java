package Commands;

import java.util.Stack;

public class Executor {

	private Stack<Command> history;
	
	public Executor(){
		this.history = new Stack<Command>();
	}

	/**
	 * execute command and add it to history
	 * @param c
	 */
	public boolean execute(Command c) {
		// Only push unexecutable commands on stack
		if(c.canUndo())
			this.history.push(c);
        // TODO - faire quelquechose avec le résultat du execute
        c.execute();
        return true;
	}

	/**
	 * Undo last command
	 */
	public boolean undo() {
		// TODO - implement Executor.undo
		if (!this.canUndo())
			return false;
		// Unexecute returns a boolean ?
		return this.history.pop().unexecute();
	}

	/**
	 * verifies if there is a unexecutable command on stack
	 */
	public boolean canUndo() {
		if (this.history.isEmpty())
			return false;
		if (!this.history.peek().canUndo())
			throw new IllegalArgumentException("There shouldn't be a command that is not unexecutable on stack!");
        return true;
	}

}
