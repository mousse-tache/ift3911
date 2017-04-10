package Commands;
import Travel.Forms.TravelCompanyForm;
import Utils.CommandMediators.*;

public class TravelCompanyModificationCommand extends AdminModificationCommand {

    public TravelCompanyModificationCommand(String ID, TravelCompanyForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
       // this.rollbackForm = FormCreationMediator.createCompanyForm(this.args.getID());
       // this.status = (this.rollbackForm && ModificationMediator.modifyCompany(this.args))?CommandStatus.success:CommandStatus.failure;
        return (this.status == CommandStatus.Success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
            //return ModificationMediator.modifyCompany(this.rollbackForm);
            return true;
        } else {
            return false;
        }
    }
}
