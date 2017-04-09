package Commands;

public class TripModificationCommand extends AdminModificationCommand {
    public boolean execute(){
        this.rollbackForm = ModificationMediator.createModificationForm(this.args.getID());
        return ModificationMediator.modifyTrip(this.args);//le résultat d'une modification est un booléen
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyTrip(this.rollbackForm);
        } else {
            return false;
        }
    }
}
