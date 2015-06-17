package com.busterblocks.customer.persistence.table.manager;

import com.busterblocks.customer.persistence.table.dao.CustomerDtoDAO;
import com.busterblocks.customer.persistence.table.dto.CustomerDto;
import com.busterblocks.customer.persistence.table.dto.CustomerDtoExample;
import com.busterblocks.customer.structure.Customer;
import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDto;
import com.busterblocks.rental.persistence.table.dto.LastVideoRentalViewDtoExample;
import com.busterblocks.util.GenericSequenceDtoDaoManager;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;

public class CustomerDtoDaoManager {

	private CustomerDtoDAO customerDtoDAO;
	private GenericSequenceDtoDaoManager genericSequenceDtoDaoManager;

	public Customer retrieveCustomerByContactNumber(final String contactNumber) {
		final CustomerDtoExample customerDtoExample = new CustomerDtoExample();
		final CustomerDtoExample.Criteria criteria = customerDtoExample.createCriteria();
		criteria.andCONTACT_NUMBEREqualTo(contactNumber);
		final Collection<CustomerDto> result = getCustomerDtoDAO().selectByExample(customerDtoExample);
		final Collection<Customer> customers = transform(result);
		if (customers.size() > 1) {
			throw new RuntimeException("Too many customers found");
		}
		if (customers.isEmpty()) {
			return null;
		}
		return customers.iterator().next();
	}

	public Customer retrieveCustomerByIdNumber(final String idNumber) {
		final CustomerDtoExample customerDtoExample = new CustomerDtoExample();
		final CustomerDtoExample.Criteria criteria = customerDtoExample.createCriteria();
		criteria.andID_NUMBEREqualTo(idNumber);
		final Collection<CustomerDto> result = getCustomerDtoDAO().selectByExample(customerDtoExample);
		final Collection<Customer> customers = transform(result);
		if (customers.size() > 1) {
			throw new RuntimeException("Too many customers found");
		}
		if (customers.isEmpty()) {
			return null;
		}
		return customers.iterator().next();
	}

	public void createCustomer(final Customer customer) {
		final CustomerDto customerDto = transform(customer);
		final Long customerId = getGenericSequenceDtoDaoManager().generateNewSequenceId();
		customerDto.setCUSTOMER_ID(new BigDecimal(customerId));
		getCustomerDtoDAO().insert(customerDto);
	}

	public void updateCustomer(final Customer customer) {
		final CustomerDto customerDto = transform(customer);
		getCustomerDtoDAO().updateByPrimaryKey(customerDto);
	}

	public void deleteCustomer(final String customerId) {
		getCustomerDtoDAO().deleteByPrimaryKey(new BigDecimal(customerId));
	}

	private Collection<Customer> transform(final Collection<CustomerDto> customerDtos) {
		final Collection<Customer> customers = new ArrayList<>();
		for (final CustomerDto customerDto : customerDtos) {
			final Customer customer = new Customer(
					customerDto.getCUSTOMER_ID().toString(),
					customerDto.getFIRST_NAME(),
					customerDto.getSURNAME(),
					customerDto.getCONTACT_NUMBER(),
					customerDto.getID_NUMBER()
			);
			customers.add(customer);
		}
		return customers;
	}

	private CustomerDto transform(final Customer customer) {
		final CustomerDto customerDto = new CustomerDto();
		customerDto.setCUSTOMER_ID((customer.getId() != null)? new BigDecimal(customer.getId()) : null);
		customerDto.setFIRST_NAME(customer.getFirstName());
		customerDto.setSURNAME(customer.getSurname());
		customerDto.setCONTACT_NUMBER(customer.getContactNumber());
		customerDto.setID_NUMBER(customer.getIdNumber());
		return customerDto;
	}

	private CustomerDtoDAO getCustomerDtoDAO() {
		return customerDtoDAO;
	}

	public void setCustomerDtoDAO(CustomerDtoDAO customerDtoDAO) {
		this.customerDtoDAO = customerDtoDAO;
	}

	private GenericSequenceDtoDaoManager getGenericSequenceDtoDaoManager() {
		return genericSequenceDtoDaoManager;
	}

	public void setGenericSequenceDtoDaoManager(GenericSequenceDtoDaoManager genericSequenceDtoDaoManager) {
		this.genericSequenceDtoDaoManager = genericSequenceDtoDaoManager;
	}
}
