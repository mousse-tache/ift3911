package Commands;

public class TravelCompanyModificationCommand extends AdminModificationCommand {
    public boolean execute(){
        this.rollbackForm = ModificationMediator.createModificationForm(this.args.getID());
        return ModificationMediator.modifyCompany(this.args);//le résultat d'une modification est un booléen
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyCompany(this.rollbackForm);
        } else {
            return false;
        }
    }
}
