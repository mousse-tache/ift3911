package Commands;
import Travel.Forms.TravelFacilityForm;
import Utils.CommandMediators.*;

public class TravelFacilityModificationCommand extends AdminModificationCommand {

    public TravelFacilityModificationCommand(String ID, TravelFacilityForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        /*
        this.rollbackForm = FormCreationMediator.createFacilityForm(this.args.getID());
        this.status = (this.rollbackForm && ModificationMediator.modifyFacility(this.args))?CommandStatus.success:CommandStatus.failure;
        */
        return (this.status == CommandStatus.Success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
           // return ModificationMediator.modifyFacility(this.rollbackForm);
           return true;
        } else {
            return false;
        }
    }
}
