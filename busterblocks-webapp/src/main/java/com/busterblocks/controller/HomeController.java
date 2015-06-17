package com.busterblocks.controller;

import com.busterblocks.dto.LoginDto;
import com.busterblocks.dto.LoginStateDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("loginStateDto")
public class HomeController {

	private String viewName;

	@RequestMapping(method = RequestMethod.GET)
	public String show(ModelMap model, HttpServletRequest httpServletRequest) {
		LoginStateDto loginStateDto = (LoginStateDto) WebUtils.getSessionAttribute(httpServletRequest, "loginStateDto");
		if (loginStateDto == null) {
			loginStateDto = new LoginStateDto();
		}
		model.addAttribute("loginStateDto", loginStateDto);
		return getViewName();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleSubmit(ModelMap model, HttpServletRequest httpServletRequest) {
		String targetPage = null;
		if (WebUtils.hasSubmitParameter(httpServletRequest, "SEARCH_VIDEOS")) {
			targetPage = "searchVideos";
		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "RENT_A_VIDEO")) {
			targetPage = "rentAVideo";
		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MAINTAIN_MOVIES")) {
			targetPage = "maintainMovies";
		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MAINTAIN_VIDEOS")) {
			targetPage = "maintainVideos";
		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MAINTAIN_CUSTOMERS")) {
			targetPage = "maintainCustomers";
		}

		if (targetPage != null) {
			final boolean pageRequiresLogin = SecurityMatrix.requiresLogin(targetPage);
			if (pageRequiresLogin) {
				final LoginStateDto loginStateDto = (LoginStateDto) WebUtils.getSessionAttribute(httpServletRequest, "loginStateDto");
				if ((loginStateDto == null) || !loginStateDto.isLoggedIn()) {
					loginStateDto.setTargetPage(targetPage);
					targetPage = "logIn";
				}
			}

			return "redirect:./" + targetPage + ".do";
		}

		return getViewName();
	}

	private String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
}
