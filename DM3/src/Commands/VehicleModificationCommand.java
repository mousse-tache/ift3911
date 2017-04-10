package Commands;

import Travel.Forms.VehicleModelForm;

public class VehicleModificationCommand extends AdminModificationCommand {

    public VehicleModificationCommand(String ID, VehicleModelForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        this.rollbackForm = ModificationMediator.createModificationForm(this.args.getID());
        return ModificationMediator.modifyVehicle(this.args);//le résultat d'une modification est un booléen
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyVehicle(this.rollbackForm);
        } else {
            return false;
        }
    }
}
