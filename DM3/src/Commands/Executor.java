package Commands;

import java.util.*;

public class Executor {

	private Stack<Command> history;
    
	/**
	 * 
	 * @param c
	 */
    public Executor(){
        this.history = new Stack();
    }
    
	public boolean execute(Command c) {
		// TODO - implement Executor.execute
		this.history.push(c);
        return c.execute();
	}

	public boolean undo() {
		// TODO - implement Executor.undo
		Command last = this.history.pop();
                return last.undo();
	}

	public boolean canUndo() {
		// TODO - implement Executor.canUndo
		return this.history.peek().canUndo();
	}
}
