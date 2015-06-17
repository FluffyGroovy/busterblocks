package com.busterblocks.customer.persistence.manager;

import com.busterblocks.customer.persistence.table.manager.CustomerDtoDaoManager;
import com.busterblocks.customer.structure.Customer;

public class CustomerDaoManager {

	private CustomerDtoDaoManager customerDtoDaoManager;

	public Customer retrieveCustomerByContactNumber(final String contactNumber) {
		return getCustomerDtoDaoManager().retrieveCustomerByContactNumber(contactNumber);
	}

	public Customer retrieveCustomerByIdNumber(final String idNumber) {
		return getCustomerDtoDaoManager().retrieveCustomerByIdNumber(idNumber);
	}

	public void createCustomer(final Customer customer) {
		getCustomerDtoDaoManager().createCustomer(customer);
	}

	public void updateCustomer(final Customer customer) {
		getCustomerDtoDaoManager().updateCustomer(customer);
	}

	public void deleteCustomer(final String customerId) {
		getCustomerDtoDaoManager().deleteCustomer(customerId);
	}

	private CustomerDtoDaoManager getCustomerDtoDaoManager() {
		return customerDtoDaoManager;
	}

	public void setCustomerDtoDaoManager(CustomerDtoDaoManager customerDtoDaoManager) {
		this.customerDtoDaoManager = customerDtoDaoManager;
	}
}
