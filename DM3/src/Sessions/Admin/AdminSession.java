package Sessions.Admin;

import Commands.*;
import Sessions.Session;
import Travel.Forms.*;

public class AdminSession extends Session {

	public AdminSession(String userID) {
		super(userID);
	}

	public boolean createTrip(TripForm form) {
		Command command = new TripCreationCommand(form);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean modifyTrip(String ID, TripForm newSpecifications) {
		Command command = new TripModificationCommand(ID, newSpecifications);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean deleteTrip(String ID) {
		Command command = new TripDeletionCommand(ID);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean createTravelFacility(TravelFacilityForm form) {
		Command command = new TravelFacilityCreationCommand(form);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean modifyTravelFacility(String ID, TravelFacilityForm newSpecifications) {
		Command command = new TripModificationCommand(ID, newSpecifications);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean deleteTravelFacility(String ID) {
		Command command = new TravelFacilityDeletionCommand(ID);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean createCompany(TravelCompanyForm form) {
		Command command = new TravelFacilityCreationCommand(form);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean modifyCompany(String ID, TravelCompanyForm newSpecifications) {
		Command command = new TravelCompanyModificationCommand(ID, newSpecifications);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean deleteCompany(String ID) {
		Command command = new TravelCompanyDeletionCommand(ID);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean createVehicleModel(VehicleModelForm form) {
		Command command = new VehicleCreationCommand(form);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean modifyVehicleModel(String ID, VehicleModelForm newSpecifications) {
		Command command = new VehicleModificationCommand(ID, newSpecifications);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean deleteVehicleModel(String ID) {
		Command command = new VehicleDeletionCommand(ID);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean createConcreteVehicle(ConcreteVehicleForm form) {
		Command command = new ConcreteVehicleCreationCommand(form);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean modifyConcreteVehicle(String ID, ConcreteVehicleForm newSpecifications) {
		Command command = new ConcreteVehicleModificationCommand(ID, newSpecifications);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

	public boolean deleteConcreteVehicle(String ID) {
		Command command = new ConcreteVehicleDeletionCommand(ID);
		this.executeCommand(command);
		return (command.getStatus() == CommandStatus.Success);
	}

}