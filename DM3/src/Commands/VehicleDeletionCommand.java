package Commands;

public class VehicleDeletionCommand extends AdminDeletionCommand {

    public VehicleDeletionCommand(String ID) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public boolean execute(){
        //crée un "rollbackForm", qui va permettre de recréer l'objet détruit.
       /* this.rollbackForm = FormCreationMediator.createVehicleForm(this.args.getID());
        this.status = (this.rollbackForm && DeletionMediator.deleteVehicle(this.args))? CommandStatus.success: CommandStatus.failure;
        */
        return (this.status == CommandStatus.Success);
    }
    public boolean unexecute(){
        if (this.status == CommandStatus.Success){
           // this.result = CreationMediator.createVehicle(this.rollbackForm);
           // return (this.result)?true:false;
           return true;
        } else {
            return false;
        }
    }
}
