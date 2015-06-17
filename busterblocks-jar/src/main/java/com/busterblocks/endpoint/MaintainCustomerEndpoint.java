package com.busterblocks.endpoint;

import busterblocks.integration.jaxb.MaintainCommand;
import busterblocks.integration.jaxb.MaintainCustomerRequest;
import busterblocks.integration.jaxb.MaintainCustomerResponse;
import busterblocks.integration.jaxb.ServiceCustomer;
import busterblocks.integration.jaxb.ServiceMovie;
import busterblocks.integration.jaxb.ServiceVideo;
import com.busterblocks.customer.gateway.CustomerComponent;
import com.busterblocks.customer.structure.Customer;
import com.busterblocks.video.structure.Actor;
import org.apache.log4j.Logger;
import org.joda.time.format.DateTimeFormat;
import org.springframework.oxm.Marshaller;
import org.springframework.util.StopWatch;
import org.springframework.ws.server.endpoint.AbstractMarshallingPayloadEndpoint;

public class MaintainCustomerEndpoint extends AbstractMarshallingPayloadEndpoint {

	private CustomerComponent customerComponent;

	private Logger logger = Logger.getLogger(this.getClass());

	public MaintainCustomerEndpoint(Marshaller marshaller) {
		super(marshaller);
	}

	@Override
	protected Object invokeInternal(Object object) {
		final StopWatch stopwatch = new StopWatch();
		stopwatch.start();
		final MaintainCustomerRequest request = (MaintainCustomerRequest) object;
		final String customerId = request.getCustomer().getId();
		final String firstName = request.getCustomer().getFirstName();
		final String surname = request.getCustomer().getSurname();
		final String contactNumber = request.getCustomer().getContactNumber();
		final String idNumber = request.getCustomer().getIdNumber();
		final String methodSignature = String.format("for customerId=%s, firstName=%s, surname=%s, contactNumber=%s, idNumber=%s", customerId, firstName, surname, contactNumber, idNumber);
		if (request != null) {
			logger.info(String.format("ENTER, " + methodSignature));
		}
		final MaintainCustomerResponse response = new MaintainCustomerResponse();

		try {
			if (MaintainCommand.RETRIEVE.equals(request.getCommand())) {
				retrieveCustomer(response, contactNumber, idNumber);
			} else if (MaintainCommand.CREATE.equals(request.getCommand())) {
				createCustomer(firstName, surname, contactNumber, idNumber);
			} else if (MaintainCommand.UPDATE.equals(request.getCommand())) {
				updateCustomer(customerId, firstName, surname, contactNumber, idNumber);
			} else if (MaintainCommand.DELETE.equals(request.getCommand())) {
				deleteCustomer(customerId);
			}
			response.setResultCode(1);
		} catch (Exception e) {
			logger.error(String.format("FAILED, " + methodSignature), e);
			response.setResultCode(0);
			response.setErrorMessage(e.getMessage());
		}
		response.setSchemaVersion(request.getSchemaVersion());
		logger.info("EXIT, " + methodSignature + ", time taken = " + stopwatch.getTotalTimeSeconds() + " s");
		return response;
	}

	private void retrieveCustomer(final MaintainCustomerResponse response, final String contactNumber, final String idNumber) {
		if ((contactNumber == null) && (idNumber == null)) {
			throw new RuntimeException("Must have either contact number or id number");
		}
		final Customer matchingCustomer;
		if (contactNumber != null) {
			matchingCustomer = getCustomerComponent().retrieveCustomerByContactNumber(contactNumber);
		} else {
			matchingCustomer = getCustomerComponent().retrieveCustomerByIdNumber(idNumber);
		}
		populateResponse(response, matchingCustomer);
	}

	private void createCustomer(final String firstName, final String surname, final String contactNumber, final String idNumber) {
		if ((firstName == null) || (surname == null)) {
			throw new RuntimeException("Must have first name and surname");
		}
		if ((contactNumber == null) && (idNumber == null)) {
			throw new RuntimeException("Must have either contact number or id number");
		}
		final Customer customer = new Customer(null, firstName, surname, contactNumber, idNumber);
		getCustomerComponent().createCustomer(customer);
	}

	private void updateCustomer(final String customerId, final String firstName, final String surname, final String contactNumber, final String idNumber) {
		if ((customerId == null) || (firstName == null) || (surname == null)) {
			throw new RuntimeException("Must have customer id, first name and surname");
		}
		if ((contactNumber == null) && (idNumber == null)) {
			throw new RuntimeException("Must have either contact number or id number");
		}
		final Customer customer = new Customer(customerId, firstName, surname, contactNumber, idNumber);
		getCustomerComponent().updateCustomer(customer);
	}

	private void deleteCustomer(final String customerId) {
		if (customerId == null) {
			throw new RuntimeException("Must have customer id");
		}
		getCustomerComponent().deleteCustomer(customerId);
	}

	private void populateResponse(final MaintainCustomerResponse response, final Customer customer) {
		if (customer != null) {
			final ServiceCustomer serviceCustomer = new ServiceCustomer();
			serviceCustomer.setId(customer.getId());
			serviceCustomer.setFirstName(customer.getFirstName());
			serviceCustomer.setSurname(customer.getSurname());
			serviceCustomer.setContactNumber(customer.getContactNumber());
			serviceCustomer.setIdNumber(customer.getIdNumber());
			response.getCustomer().add(serviceCustomer);
		}
	}

	private CustomerComponent getCustomerComponent() {
		return customerComponent;
	}

	public void setCustomerComponent(CustomerComponent customerComponent) {
		this.customerComponent = customerComponent;
	}
}
