package Commands;

public class ItineraryCreationCommand extends AdminCreationCommand {
    boolean execute(){
        this.result = CreationMediator.createTrip(this.args);
        if (this.result) {
            this.status = CommandStatus.success;
            return true;
        } else {
            this.status = CommandStatus.failure;
            return false;
        }
    }
    boolean unexecute(){
        if (this.status == CommandStatus.success){
            return DeletionMediator.deleteTrip(this.result);//this.result devrait être l'id du trip créé.
        } else {
            return false;
        }
    }
}
