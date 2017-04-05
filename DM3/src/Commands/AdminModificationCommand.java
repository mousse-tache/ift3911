package Commands;

public abstract class AdminModificationCommand<T> extends AdminCommand {

	private T oldObject;
	private T newObject;

}