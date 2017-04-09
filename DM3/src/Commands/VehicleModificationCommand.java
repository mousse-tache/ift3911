package Commands;

public class VehicleModificationCommand extends AdminModificationCommand {
    boolean execute(){
        this.rollbackForm = ModificationMediator.createModificationForm(this.getID());
        return ModificationMediator.modifyVehicle(this.args);//le résultat d'une modification est un booléen
    }
    boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyVehicle(this.rollbackForm);
        } else {
            return false;
        }
    }

}
