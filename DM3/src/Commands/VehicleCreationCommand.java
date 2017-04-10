package Commands;
import Utils.CommandMediators.*;
import Travel.Forms.VehicleModelForm;

public class VehicleCreationCommand extends AdminCreationCommand {

    public VehicleCreationCommand(VehicleModelForm form) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
