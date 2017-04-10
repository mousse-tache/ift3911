package Commands;
import Utils.CommandMediators.*;
import Travel.Forms.TravelCompanyForm;

public class TravelCompanyCreationCommand extends AdminCreationCommand {

    public TravelCompanyCreationCommand(TravelCompanyForm form) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        //this.result = CreationMediator.createCompany(this.args);
        //if (this.result){
        //    this.status = CommandStatus.success;
        //}
        return true;
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
            //return DeletionMediator.deleteCompany(this.result);
            return true;
        } else {
            return false;
        }
    }
}
