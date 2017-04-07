package Travel.Forms;

import Travel.TravelCompany;

public class TravelCompanyForm extends BaseForm {

	private String name;

	public TravelCompanyForm(TravelCompany tc) {
		this.name = tc.getName();
	}

	public BaseForm createFromPrompt() {
		// TODO - implement TravelCompanyForm.createFromPrompt
		throw new UnsupportedOperationException();
	}

	public void modifyFromPrompt() {
		// TODO - implement TravelCompanyForm.modifyFromPrompt
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}