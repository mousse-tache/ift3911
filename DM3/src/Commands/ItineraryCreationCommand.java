package Commands;
import Utils.CommandMediators.*;
import Utils.CommandMediators.CreationMediator;

public class ItineraryCreationCommand extends AdminCreationCommand {
    public boolean execute(){
        this.result = CreationMediator.createItinerary(this.args);
        if (this.result){
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
