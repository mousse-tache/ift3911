package Commands;
import Travel.Forms.TripForm;

public class TripModificationCommand extends AdminModificationCommand {

    public TripModificationCommand(String ID, TripForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        /*
        this.rollbackForm = FormCreationMediator.createTripForm(this.args.getID());
        this.status = (this.rollbackForm && ModificationMediator.modifyTrip(this.args))?CommandStatus.success:CommandStatus.failure;
        */
        return (this.status == CommandStatus.Success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
            //return ModificationMediator.modifyTrip(this.rollbackForm);
            return true;
        } else {
            return false;
        }
    }
}
