package Commands;

public class ItineraryDeletionCommand extends AdminDeletionCommand {
    public boolean execute(){
        //crée un "rollbackForm", qui va permettre de recréer l'objet détruit.
        this.rollbackForm = creationMediator.createCreationForm(this.args.getID());
        this.status = DeletionMediator.deleteItinerary(this.args)? CommandStatus.success: CommandStatus.failure;
        return (this.status == CommandStatus.success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            this.result = CreationMediator.createItinerary(this.rollbackForm);
            return (this.result)?true:false;
        } else {
            return false;
        }
    }
}
