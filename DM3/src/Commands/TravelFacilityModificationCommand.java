package Commands;
import Travel.Forms.TravelFacilityForm;
import Utils.CommandMediators.*;

public class TravelFacilityModificationCommand extends AdminModificationCommand {

    public TravelFacilityModificationCommand(String ID, TravelFacilityForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        this.rollbackForm = FormCreationMediator.createFacilityForm(this.args.getID());
        this.status = (this.rollbackForm && ModificationMediator.modifyFacility(this.args))?CommandStatus.success:CommandStatus.failure;
        return (this.status == CommandStatus.success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyFacility(this.rollbackForm);
        } else {
            return false;
        }
    }
}
