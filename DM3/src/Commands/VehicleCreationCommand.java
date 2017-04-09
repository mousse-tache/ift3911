package Commands;

public class VehicleCreationCommand extends AdminCreationCommand {
    public boolean execute(){
        this.result = CreationMediator.createVehicle(this.args);
        if (this.result){
            this.status = CommandStatus.success;
        }
        return true;
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return DeletionMediator.deleteVehicle(this.result);
        } else {
            return false;
        }
    }
}
