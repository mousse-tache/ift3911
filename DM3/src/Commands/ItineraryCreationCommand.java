package Commands;
import Utils.CommandMediators.DeletionMediator;

public class ItineraryCreationCommand extends AdminCreationCommand {
    public boolean execute(){
        //this.result = CreationMediator.createItinerary();
        if (this.result != null){
            this.status = CommandStatus.Success;
        }
        return true;
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
            return DeletionMediator.deleteItinerary(this.result);
        } else {
            return false;
        }
    }
}
