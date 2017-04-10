package Commands;
import Travel.Forms.TripForm;
import Utils.CommandMediators.*;

public class TripModificationCommand extends AdminModificationCommand {

    public TripModificationCommand(String ID, TripForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        this.rollbackForm = FormCreationMediator.createTripForm(this.args.getID());
        this.status = (this.rollbackForm && ModificationMediator.modifyTrip(this.args))?CommandStatus.success:CommandStatus.failure;
        return (this.status == CommandStatus.success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyTrip(this.rollbackForm);
        } else {
            return false;
        }
    }
}
