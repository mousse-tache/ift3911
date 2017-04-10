package Commands;
import Utils.CommandMediators.*;
import Travel.Forms.*;

public class ItineraryModificationCommand extends AdminModificationCommand {
    public boolean execute(){
        this.rollbackForm = FormCreationMediator.createItineraryForm(this.args.getID());
        this.status = (this.rollbackForm && ModificationMediator.modifyItinerary(this.args))?CommandStatus.success:CommandStatus.failure;
        return (this.status == CommandStatus.success);

    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyItinerary(this.rollbackForm);
        } else {
            return false;
        }
    }
}
