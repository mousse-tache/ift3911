package Commands;
import Utils.CommandMediators.*;
import Travel.Forms.TripForm;

public class TripCreationCommand extends AdminCreationCommand {

    public TripCreationCommand(TripForm form) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
       /* this.result = CreationMediator.createTrip(this.args);
        if (this.result){
            this.status = CommandStatus.success;
        }
        */
        return true;
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
           // return DeletionMediator.deleteTrip(this.result);
           return true;
        } else {
            return false;
        }
    }
}
