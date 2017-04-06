package Sessions.Client;

import Sessions.*;
import Reservation.*;

public class Client extends User {

	ClientPaymentInfo clientPaymentInfo;
	private String name;
	private String surname;
	private String email;
	private String phone;
	private Date birthdate;
	private String passport_number;
	private Date passport_expiration;
	private List<Reservation> reservations;

	public void modifyInfo() {
		// TODO - implement Client.modifyInfo
		throw new UnsupportedOperationException();
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return this.surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Date getBirthdate() {
		return this.birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public String getPassport_number() {
		return this.passport_number;
	}

	public void setPassport_number(String passport_number) {
		this.passport_number = passport_number;
	}

	public Date getPassport_expiration() {
		return this.passport_expiration;
	}

	public void setPassport_expiration(Date passport_expiration) {
		this.passport_expiration = passport_expiration;
	}

	public List<Reservation> getReservations() {
		return this.reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

}