package Commands;

public class ItineraryDeletionCommand extends AdminDeletionCommand {
    public boolean execute(){
        //crée un "rollbackForm", qui va permettre de recréer l'objet détruit.
        //this.rollbackForm = FormCreationMediator.createItineraryForm(this.args.getID());
        //this.status = (this.rollbackForm && DeletionMediator.deleteItinerary(this.args))? CommandStatus.Success: CommandStatus.Failure;
        return (this.status == CommandStatus.Success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
           // this.result = CreationMediator.createItinerary(this.rollbackForm);
           // return (this.result)?true:false;
           return false;
        } else {
            return false;
        }
    }
}
