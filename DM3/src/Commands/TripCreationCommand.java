package Commands;

import Travel.Forms.TripForm;

public class TripCreationCommand extends AdminCreationCommand {

    public TripCreationCommand(TripForm form) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    boolean execute(){
        this.result = CreationMediator.createTrip(this.args);
        if (this.result){
            this.status = CommandStatus.success;
        }
        return true;
    }
    boolean unexecute(){
        if (this.status == CommandStatus.success){
            return DeletionMediator.deleteTrip(this.result);
        } else {
            return false;
        }
    }
}
