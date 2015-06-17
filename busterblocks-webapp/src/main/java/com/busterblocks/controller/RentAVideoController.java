package com.busterblocks.controller;

import com.busterblocks.client.RentAVideoClient;
import com.busterblocks.client.ReturnAVideoClient;
import com.busterblocks.dto.VideoRentalDto;
import com.busterblocks.dto.VideoReturnDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes({"videoRentalDto", "videoReturnDto"})
public class RentAVideoController {

	private String viewName;
	private RentAVideoClient rentAVideoClient;
	private ReturnAVideoClient returnAVideoClient;

	@RequestMapping(method = RequestMethod.GET)
	public String show(ModelMap model, HttpServletRequest httpServletRequest) {
		model.addAttribute("videoRentalDto", new VideoRentalDto());
		model.addAttribute("videoReturnDto", new VideoReturnDto());
		return getViewName();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleSubmit(ModelMap model, HttpServletRequest httpServletRequest,
							   @ModelAttribute("videoRentalDto") VideoRentalDto videoRentalDto, @ModelAttribute("videoReturnDto") VideoReturnDto videoReturnDto) {
		if (WebUtils.hasSubmitParameter(httpServletRequest, "RENT_CLEAR")) {
			model.addAttribute("videoRentalDto", new VideoRentalDto());

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "RETURN_CLEAR")) {
			model.addAttribute("videoReturnDto", new VideoReturnDto());

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "RENT")) {
			try {
				getRentAVideoClient().rentAVideo(videoRentalDto.getRentSerialNumber(), videoRentalDto.getCustomerId(), videoRentalDto.getDateDue());
				videoRentalDto.setMessage("Video successfully rented");
			} catch (Exception e) {
				videoRentalDto.setMessage(e.getMessage());
			}

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "RETURN")) {
			try {
				getReturnAVideoClient().returnAVideo(videoReturnDto.getReturnSerialNumber(), videoReturnDto.getComments());
				videoReturnDto.setMessage("Video successfully returned");
			} catch (Exception e) {
				videoReturnDto.setMessage(e.getMessage());
			}

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "RENT_MAIN_MENU") ||
				WebUtils.hasSubmitParameter(httpServletRequest, "RETURN_MAIN_MENU")) {
			return "redirect:./home.do";
		}

		return getViewName();
	}

	private RentAVideoClient getRentAVideoClient() {
		return rentAVideoClient;
	}

	public void setRentAVideoClient(RentAVideoClient rentAVideoClient) {
		this.rentAVideoClient = rentAVideoClient;
	}

	private ReturnAVideoClient getReturnAVideoClient() {
		return returnAVideoClient;
	}

	public void setReturnAVideoClient(ReturnAVideoClient returnAVideoClient) {
		this.returnAVideoClient = returnAVideoClient;
	}

	private String getViewName() {
		return viewName;
	}

	public void setViewName(String aViewName) {
		viewName = aViewName;
	}
}
