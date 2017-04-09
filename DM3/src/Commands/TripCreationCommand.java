package Commands;

public class TripCreationCommand extends AdminCreationCommand {
    boolean execute(){
        this.result = CreationMediator.createTrip(this.args);
        if (this.result){
            this.status = CommandStatus.success;
        }
        return true;
    }
    boolean unexecute(){
        if (this.status == CommandStatus.success){
            return DeletionMediator.deleteTrip(this.result);
        } else {
            return false;
        }
    }
}
