package com.busterblocks.controller;

import com.busterblocks.client.MaintainCustomerClient;
import com.busterblocks.dto.CustomerDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Collection;

@Controller
@SessionAttributes("customerDto")
public class MaintainCustomersController {

	private String viewName;
	private MaintainCustomerClient maintainCustomerClient;

	@RequestMapping(method = RequestMethod.GET)
	public String show(ModelMap model, HttpServletRequest httpServletRequest) {
		model.addAttribute("customerDto", new CustomerDto());
		return getViewName();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleSubmit(ModelMap model, HttpServletRequest httpServletRequest, @ModelAttribute("customerDto") CustomerDto customerDto) {
		if (WebUtils.hasSubmitParameter(httpServletRequest, "CLEAR")) {
			model.addAttribute("customerDto", new CustomerDto());

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "FIND")) {
			try {
				final CustomerDto matchingCustomerDto = getMaintainCustomerClient().retrieveCustomer(customerDto);
				if (matchingCustomerDto != null) {
					model.addAttribute("customerDto", matchingCustomerDto);
				} else {
					customerDto.setMessage("Could not find customer");
				}
			} catch (Exception e) {
				customerDto.setMessage(e.getMessage());
			}

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "ADD")) {
			try {
				getMaintainCustomerClient().createCustomer(customerDto);
				customerDto.setMessage("Customer successfully added");
			} catch (Exception e) {
				customerDto.setMessage(e.getMessage());
			}

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "UPDATE")) {
			try {
				getMaintainCustomerClient().updateCustomer(customerDto);
				customerDto.setMessage("Customer successfully updated");
			} catch (Exception e) {
				customerDto.setMessage(e.getMessage());
			}

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "DELETE")) {
			try {
				getMaintainCustomerClient().deleteCustomer(customerDto.getId());
				customerDto.setMessage("Customer successfully deleted");
			} catch (Exception e) {
				customerDto.setMessage(e.getMessage());
			}

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MAIN_MENU")) {
			return "redirect:./home.do";
		}

		return getViewName();
	}

	private MaintainCustomerClient getMaintainCustomerClient() {
		return maintainCustomerClient;
	}

	public void setMaintainCustomerClient(MaintainCustomerClient maintainCustomerClient) {
		this.maintainCustomerClient = maintainCustomerClient;
	}

	private String getViewName() {
		return viewName;
	}

	public void setViewName(String aViewName) {
		viewName = aViewName;
	}
}


