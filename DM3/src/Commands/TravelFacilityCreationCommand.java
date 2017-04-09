package Commands;

public class TravelFacilityCreationCommand extends AdminCreationCommand {
    boolean execute(){
        this.result = CreationMediator.createFacility(this.args);
        if (this.result){
            this.status = CommandStatus.success;
        }
        return true;
    }
    boolean unexecute(){
        if (this.status == CommandStatus.success){
            return DeletionMediator.deleteFacility(this.result);
        } else {
            return false;
        }
    }
}
