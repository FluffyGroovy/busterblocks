package com.busterblocks.controller;

import com.busterblocks.dto.LoginDto;
import com.busterblocks.dto.LoginStateDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes("loginStateDto")
public class LogInController {

	private String viewName;

	@RequestMapping(method = RequestMethod.GET)
	public String show(ModelMap model, HttpServletRequest httpServletRequest) {
		model.addAttribute("loginDto", new LoginDto());
		return getViewName();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleSubmit(ModelMap model, HttpServletRequest httpServletRequest, @ModelAttribute("loginDto") LoginDto loginDto) {
		String targetPage = null;
		if (WebUtils.hasSubmitParameter(httpServletRequest, "LOG_IN")) {
			if (SecurityMatrix.loginIsValid(loginDto)) {
				final LoginStateDto loginStateDto = (LoginStateDto) WebUtils.getSessionAttribute(httpServletRequest, "loginStateDto");
				loginStateDto.setLoggedIn(true);
				targetPage = loginStateDto.consumeTargetPage();
			} else {
				targetPage = "home";
			}
		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "GIVE_UP")) {
			targetPage = "home";
		}

		return "redirect:./" + targetPage + ".do";
	}

	private String getViewName() {
		return viewName;
	}

	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
}
