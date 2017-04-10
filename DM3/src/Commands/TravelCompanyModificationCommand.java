package Commands;

import Travel.Forms.TravelCompanyForm;

public class TravelCompanyModificationCommand extends AdminModificationCommand {

    public TravelCompanyModificationCommand(String ID, TravelCompanyForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
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
