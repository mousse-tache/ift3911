package Sessions.Client;

public class ClientPaymentInfo {

	Client client;
	private String cardNumber;
	private String billableAdress;
	private String name;

	public String getCardNumber() {
		return this.cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getBillableAdress() {
		return this.billableAdress;
	}

	public void setBillableAdress(String billableAdress) {
		this.billableAdress = billableAdress;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

}