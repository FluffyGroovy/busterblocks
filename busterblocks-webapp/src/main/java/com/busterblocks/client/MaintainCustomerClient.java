package com.busterblocks.client;

import busterblocks.integration.jaxb.MaintainCommand;
import busterblocks.integration.jaxb.MaintainCustomerRequest;
import busterblocks.integration.jaxb.MaintainCustomerResponse;
import busterblocks.integration.jaxb.ServiceCustomer;
import com.busterblocks.dto.CustomerDto;

import java.util.ArrayList;
import java.util.Collection;

public class MaintainCustomerClient extends BaseClient {

	public CustomerDto retrieveCustomer(final CustomerDto customerDto) {
		final MaintainCustomerRequest request = new MaintainCustomerRequest();
		request.setSchemaVersion(1.0f);
		request.setCommand(MaintainCommand.RETRIEVE);
		final ServiceCustomer serviceCustomer = new ServiceCustomer();
		if ((customerDto.getContactNumber() != null) && !customerDto.getContactNumber().trim().isEmpty()) {
			serviceCustomer.setContactNumber(customerDto.getContactNumber());
		}
		if ((customerDto.getIdNumber() != null) && !customerDto.getIdNumber().trim().isEmpty()) {
			serviceCustomer.setIdNumber(customerDto.getIdNumber());
		}
		request.setCustomer(serviceCustomer);

		final MaintainCustomerResponse response = (MaintainCustomerResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}

		final Collection<CustomerDto> customerDtos = transform(response);
		if (customerDtos.size() > 1) {
			throw new RuntimeException("Too many customers found");
		}
		if (customerDtos.isEmpty()) {
			return null;
		}
		return customerDtos.iterator().next();
	}

	public void createCustomer(final CustomerDto customerDto) {
		final MaintainCustomerRequest request = new MaintainCustomerRequest();
		request.setSchemaVersion(1.0f);
		request.setCommand(MaintainCommand.CREATE);
		final ServiceCustomer serviceCustomer = new ServiceCustomer();
		if ((customerDto.getFirstName() != null) && !customerDto.getFirstName().trim().isEmpty()) {
			serviceCustomer.setFirstName(customerDto.getFirstName());
		}
		if ((customerDto.getSurname() != null) && !customerDto.getSurname().trim().isEmpty()) {
			serviceCustomer.setSurname(customerDto.getSurname());
		}
		if ((customerDto.getContactNumber() != null) && !customerDto.getContactNumber().trim().isEmpty()) {
			serviceCustomer.setContactNumber(customerDto.getContactNumber());
		}
		if ((customerDto.getIdNumber() != null) && !customerDto.getIdNumber().trim().isEmpty()) {
			serviceCustomer.setIdNumber(customerDto.getIdNumber());
		}
		request.setCustomer(serviceCustomer);

		final MaintainCustomerResponse response = (MaintainCustomerResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}
	}

	public void updateCustomer(final CustomerDto customerDto) {
		final MaintainCustomerRequest request = new MaintainCustomerRequest();
		request.setSchemaVersion(1.0f);
		request.setCommand(MaintainCommand.UPDATE);
		final ServiceCustomer serviceCustomer = new ServiceCustomer();
		if ((customerDto.getId() != null) && !customerDto.getId().trim().isEmpty()) {
			serviceCustomer.setId(customerDto.getId());
		}
		if ((customerDto.getFirstName() != null) && !customerDto.getFirstName().trim().isEmpty()) {
			serviceCustomer.setFirstName(customerDto.getFirstName());
		}
		if ((customerDto.getSurname() != null) && !customerDto.getSurname().trim().isEmpty()) {
			serviceCustomer.setSurname(customerDto.getSurname());
		}
		if ((customerDto.getContactNumber() != null) && !customerDto.getContactNumber().trim().isEmpty()) {
			serviceCustomer.setContactNumber(customerDto.getContactNumber());
		}
		if ((customerDto.getIdNumber() != null) && !customerDto.getIdNumber().trim().isEmpty()) {
			serviceCustomer.setIdNumber(customerDto.getIdNumber());
		}
		request.setCustomer(serviceCustomer);

		final MaintainCustomerResponse response = (MaintainCustomerResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}
	}

	public void deleteCustomer(final String customerId) {
		final MaintainCustomerRequest request = new MaintainCustomerRequest();
		request.setSchemaVersion(1.0f);
		request.setCommand(MaintainCommand.DELETE);
		final ServiceCustomer serviceCustomer = new ServiceCustomer();
		if ((customerId != null) && !customerId.trim().isEmpty()) {
			serviceCustomer.setId(customerId);
		}
		request.setCustomer(serviceCustomer);

		final MaintainCustomerResponse response = (MaintainCustomerResponse) getService().marshalSendAndReceive(request);

		if (response.getResultCode() != 1) {
			throw new RuntimeException(response.getErrorMessage());
		}
	}

	private Collection<CustomerDto> transform(final MaintainCustomerResponse response) {
		final Collection<CustomerDto> customerDtos = new ArrayList<>();
		if (response != null) {
			for (final ServiceCustomer serviceCustomer : response.getCustomer()) {
				final CustomerDto customerDto = new CustomerDto();
				customerDto.setId(serviceCustomer.getId());
				customerDto.setFirstName(serviceCustomer.getFirstName());
				customerDto.setSurname(serviceCustomer.getSurname());
				customerDto.setContactNumber(serviceCustomer.getContactNumber());
				customerDto.setIdNumber(serviceCustomer.getIdNumber());
				customerDtos.add(customerDto);
			}
		}
		return customerDtos;
	}

}
