package com.busterblocks.customer.gateway;

import com.busterblocks.customer.persistence.manager.CustomerDaoManager;
import com.busterblocks.customer.structure.Customer;

public class CustomerComponent {

	private CustomerDaoManager customerDaoManager;

	public Customer retrieveCustomerByContactNumber(final String contactNumber) {
		return getCustomerDaoManager().retrieveCustomerByContactNumber(contactNumber);
	}

	public Customer retrieveCustomerByIdNumber(final String idNumber) {
		return getCustomerDaoManager().retrieveCustomerByIdNumber(idNumber);
	}

	public void createCustomer(final Customer customer) {
		getCustomerDaoManager().createCustomer(customer);
	}

	public void updateCustomer(final Customer customer) {
		getCustomerDaoManager().updateCustomer(customer);
	}

	public void deleteCustomer(final String customerId) {
		getCustomerDaoManager().deleteCustomer(customerId);
	}

	private CustomerDaoManager getCustomerDaoManager() {
		return customerDaoManager;
	}

	public void setCustomerDaoManager(CustomerDaoManager customerDaoManager) {
		this.customerDaoManager = customerDaoManager;
	}
}
