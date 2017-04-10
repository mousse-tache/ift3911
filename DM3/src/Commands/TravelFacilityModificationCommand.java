package Commands;

import Travel.Forms.TravelFacilityForm;

public class TravelFacilityModificationCommand extends AdminModificationCommand {

    public TravelFacilityModificationCommand(String ID, TravelFacilityForm newSpecifications) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        this.rollbackForm = ModificationMediator.createModificationForm(this.args.getID());
        return ModificationMediator.modifyFacility(this.args);//le résultat d'une modification est un booléen
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.success){
            return ModificationMediator.modifyFacility(this.rollbackForm);
        } else {
            return false;
        }
    }
}
