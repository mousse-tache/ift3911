package Commands;

public class TravelCompanyDeletionCommand extends AdminDeletionCommand {

    public TravelCompanyDeletionCommand(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        //crée un "rollbackForm", qui va permettre de recréer l'objet détruit.
        //this.rollbackForm = FormCreationMediator.createCompanyForm(this.args.getID());
        //this.status = (this.rollbackForm && DeletionMediator.deleteCompany(this.args))? CommandStatus.success: CommandStatus.failure;
        return (this.status == CommandStatus.Success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
           // this.result = CreationMediator.createCompany(this.rollbackForm);
           // return (this.result)?true:false;
           return true;
        } else {
            return false;
        }
    }
}
