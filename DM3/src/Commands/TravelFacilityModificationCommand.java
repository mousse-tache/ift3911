package Commands;

public class TravelFacilityModificationCommand extends AdminModificationCommand {
    public boolean execute(){
        this.rollbackForm = ModificationMediator.createModificationForm(this.args.getID());
        return ModificationMediator.modifyFacility(this.args);//le résultat d'une modification est un booléen
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyFacility(this.rollbackForm);
        } else {
            return false;
        }
    }
}
