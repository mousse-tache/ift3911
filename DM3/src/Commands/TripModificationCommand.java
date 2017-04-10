package Commands;

import Travel.Forms.TripForm;

public class TripModificationCommand extends AdminModificationCommand {

    public TripModificationCommand(String ID, TripForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        this.rollbackForm = ModificationMediator.createModificationForm(this.args.getID());
        return ModificationMediator.modifyTrip(this.args);//le résultat d'une modification est un booléen
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyTrip(this.rollbackForm);
        } else {
            return false;
        }
    }
}
