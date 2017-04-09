package Commands;

public class TravelCompanyCreationCommand extends AdminCreationCommand {
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
