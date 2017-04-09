package Commands;

import java.util.Stack;

public class Executor {

	private Stack<Command> history;
	
	public Executor(){
		this.history = new Stack<Command>();
	}

	/**
	 * execute command and add it to history
	 * @param command
	 */
	public boolean execute(Command command) {
		// Only push unexecutable commands on stack
		if(command.canUndo())
			this.history.push(command);
        // TODO - faire quelquechose avec le résultat du execute
        command.execute();
        return true;
	}

	/**
	 * Undo last command
	 */
	public boolean undo() {
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
