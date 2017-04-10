package Commands;
import Travel.Forms.TravelFacilityForm;

public class TravelFacilityCreationCommand extends AdminCreationCommand {

    public TravelFacilityCreationCommand(TravelFacilityForm form) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
       /*
        this.result = CreationMediator.createFacility(this.args);
        if (this.result){
           this.status = CommandStatus.success;
        }
        */
        return true;

    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
            //return DeletionMediator.deleteFacility(this.result);
            return true;
        } else {
            return false;
        }
    }
}
