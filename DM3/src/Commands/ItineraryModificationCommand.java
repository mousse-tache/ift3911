package Commands;

public class ItineraryModificationCommand extends AdminModificationCommand {
    public boolean execute(){
        //this.rollbackForm = FormCreationMediator.createItineraryForm(this.args.getID());
        //this.status = (this.rollbackForm && ModificationMediator.modifyItinerary())?CommandStatus.Success:CommandStatus.Failure;
        return (this.status == CommandStatus.Success);

    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
            //return ModificationMediator.modifyItinerary(this.rollbackForm);
            return false;
        } else {
            return false;
        }
    }
}
