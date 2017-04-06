package Commands;

public class Command {

	public boolean execute() {
		// TODO - implement Command.execute
		throw new UnsupportedOperationException();
	}

	public boolean unexecute() {
		// TODO - implement Command.unexecute
		throw new UnsupportedOperationException();
	}

	public CommandStatus getStatus() {
		return this.status;
	}

	public void setStatus(CommandStatus status) {
		this.status = status;
	}

	public boolean canUndo() {
		// TODO - implement Command.canUndo
		throw new UnsupportedOperationException();
	}

	private CommandStatus status;

}