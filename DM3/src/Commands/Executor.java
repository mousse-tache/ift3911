package Commands;

import java.util.List;

public class Executor {

	private List<Command> history;

	/**
	 * execute command and add it to history
	 * @param c
	 */
	public boolean execute(Command c) {
        this.history.add(c);
        // TODO - faire quelquechose avec le résultat du execute
        c.execute();
        return true;
	}

	/**
	 * Undo last command
	 */
	public boolean undo() {
		// TODO - implement Executor.undo
		Command last = this.history.last();
        if (last.canUndo()){
            if (last.unexecute()){
                this.history.pop();
                return true;
            } else {
                return false;
            }
        }
	}

	/**
	 * verifies if last command is undoable
	 */
	public boolean canUndo() {
		// TODO - implement Executor.canUndo
		Command last = this.history.pop();
        return last.canUndo();
	}

}
