package Commands;
import Utils.CommandMediators.*;
import Travel.Forms.VehicleModelForm;

public class VehicleCreationCommand extends AdminCreationCommand {

    public VehicleCreationCommand(VehicleModelForm form) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        //this.result = CreationMediator.createVehicle(this.args);
        if (this.result != null){
            this.status = CommandStatus.Success;
        }
        return true;
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
            // return DeletionMediator.deleteVehicle(this.result);
            return true;
        } else {
            return false;
        }
    }
}
