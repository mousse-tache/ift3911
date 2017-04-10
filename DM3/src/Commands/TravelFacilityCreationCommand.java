package Commands;

import Travel.Forms.TravelFacilityForm;

public class TravelFacilityCreationCommand extends AdminCreationCommand {

    public TravelFacilityCreationCommand(TravelFacilityForm form) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    boolean execute(){
        this.result = CreationMediator.createFacility(this.args);
        if (this.result){
            this.status = CommandStatus.success;
        }
        return true;
    }
    boolean unexecute(){
        if (this.status == CommandStatus.success){
            return DeletionMediator.deleteFacility(this.result);
        } else {
            return false;
        }
    }
}
