package Commands;

public class ItineraryCreationCommand extends AdminCreationCommand {
    public boolean execute(){
        this.result = CreationMediator.createItinerary(this.args);
        if (this.result){
            this.status = CommandStatus.success;
        }
        return true;
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return DeletionMediator.deleteItinerary(this.result);
        } else {
            return false;
        }
    }
}
