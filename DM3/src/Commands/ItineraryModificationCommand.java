package Commands;

public class ItineraryModificationCommand extends AdminModificationCommand {
    public boolean execute(){
        this.rollbackForm = ModificationMediator.createModificationForm(this.args.getID());
        return ModificationMediator.modifyItinerary(this.args);//le résultat d'une modification est un booléen
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyItinerary(this.rollbackForm);
        } else {
            return false;
        }
    }
}
