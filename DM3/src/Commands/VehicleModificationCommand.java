package Commands;

public class VehicleModificationCommand extends AdminModificationCommand {
    public boolean execute(){
        this.rollbackForm = ModificationMediator.createModificationForm(this.getID());
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
