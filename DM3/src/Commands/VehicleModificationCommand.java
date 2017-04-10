package Commands;
import Travel.Forms.VehicleModelForm;
import Utils.CommandMediators.*;
public class VehicleModificationCommand extends AdminModificationCommand {

    public VehicleModificationCommand(String ID, VehicleModelForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        this.rollbackForm = FormCreationMediator.createVehicleForm(this.args.getID());
        this.status = (this.rollbackForm && ModificationMediator.modifyVehicle(this.args))?CommandStatus.success:CommandStatus.failure;
        return (this.status == CommandStatus.success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyVehicle(this.rollbackForm);
        } else {
            return false;
        }
    }
}
