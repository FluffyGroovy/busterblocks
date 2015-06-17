package com.busterblocks.customer.structure;

public final class Customer {

	private final String id;
	private final String firstName;
	private final String surname;
	private final String contactNumber;
	private final String idNumber;

	public Customer(final String id, final String firstName, final String surname, final String contactNumber, final String idNumber) {
		this.id = id;
		this.firstName = firstName;
		this.surname = surname;
		this.contactNumber = contactNumber;
		this.idNumber = idNumber;
	}

	public String getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getSurname() {
		return surname;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getIdNumber() {
		return idNumber;
	}
}
