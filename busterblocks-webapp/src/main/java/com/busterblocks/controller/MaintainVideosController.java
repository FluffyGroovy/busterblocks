package com.busterblocks.controller;

import com.busterblocks.client.MaintainVideoClient;
import com.busterblocks.client.MaintainVideoItemClient;
import com.busterblocks.dto.CustomerDto;
import com.busterblocks.dto.MovieVideoDto;
import com.busterblocks.dto.VideoItemDto;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.HttpServletRequest;

@Controller
@SessionAttributes({"movieVideoDto", "videoItemDto"})
public class MaintainVideosController {

	private String viewName;
	private MaintainVideoClient maintainVideoClient;
	private MaintainVideoItemClient maintainVideoItemClient;

	@RequestMapping(method = RequestMethod.GET)
	public String show(ModelMap model, HttpServletRequest httpServletRequest) {
		model.addAttribute("movieVideoDto", new MovieVideoDto());
		model.addAttribute("videoItemDto", new VideoItemDto());
		return getViewName();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleSubmit(ModelMap model, HttpServletRequest httpServletRequest, @ModelAttribute("movieVideoDto") MovieVideoDto movieVideoDto, @ModelAttribute("videoItemDto") VideoItemDto videoItemDto) {
		if (WebUtils.hasSubmitParameter(httpServletRequest, "MOVIE_CLEAR")) {
			model.addAttribute("movieVideoDto", new MovieVideoDto());

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "VIDEO_CLEAR")) {
			model.addAttribute("videoItemDto", new VideoItemDto());

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MOVIE_FIND")) {

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "VIDEO_FIND")) {

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MOVIE_ADD")) {

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "VIDEO_ADD")) {

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MOVIE_UPDATE")) {

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "VIDEO_UPDATE")) {

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MOVIE_DELETE")) {

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "VIDEO_DELETE")) {

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MOVIE_MAIN_MENU") ||
				WebUtils.hasSubmitParameter(httpServletRequest, "VIDEO_MAIN_MENU")) {
			return "redirect:./home.do";
		}

		return getViewName();
	}

	private MaintainVideoClient getMaintainVideoClient() {
		return maintainVideoClient;
	}

	public void setMaintainVideoClient(MaintainVideoClient maintainVideoClient) {
		this.maintainVideoClient = maintainVideoClient;
	}

	private MaintainVideoItemClient getMaintainVideoItemClient() {
		return maintainVideoItemClient;
	}

	public void setMaintainVideoItemClient(MaintainVideoItemClient maintainVideoItemClient) {
		this.maintainVideoItemClient = maintainVideoItemClient;
	}

	private String getViewName() {
		return viewName;
	}

	public void setViewName(String aViewName) {
		viewName = aViewName;
	}
}


