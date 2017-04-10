package Commands;

import Travel.Forms.TravelCompanyForm;

public class TravelCompanyCreationCommand extends AdminCreationCommand {

    public TravelCompanyCreationCommand(TravelCompanyForm form) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    boolean execute(){
        this.result = CreationMediator.createCompany(this.args);
        if (this.result){
            this.status = CommandStatus.success;
        }
        return true;
    }
    boolean unexecute(){
        if (this.status == CommandStatus.success){
            return DeletionMediator.deleteCompany(this.result);
        } else {
            return false;
        }
    }
}
