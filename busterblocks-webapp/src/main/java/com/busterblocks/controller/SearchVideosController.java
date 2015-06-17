package com.busterblocks.controller;

import com.busterblocks.client.VideoSearchClient;
import com.busterblocks.dto.MovieVideoDto;
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
@SessionAttributes({"videoDto","selectedVideo"})
public class SearchVideosController {

	private String viewName;
	private VideoSearchClient videoSearchClient;

	@RequestMapping(method = RequestMethod.GET)
	public String show(ModelMap model, HttpServletRequest httpServletRequest) {
		model.addAttribute("videoDto", new MovieVideoDto());
		model.addAttribute("selectedVideo", new MovieVideoDto());
		return getViewName();
	}

	@RequestMapping(method = RequestMethod.POST)
	public String handleSubmit(ModelMap model, HttpServletRequest httpServletRequest, @ModelAttribute("videoDto") MovieVideoDto videoDto, @ModelAttribute("selectedVideo") MovieVideoDto selectedVideoDto) {
		if (WebUtils.hasSubmitParameter(httpServletRequest, "CLEAR")) {
			model.addAttribute("videoDto", new MovieVideoDto());

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "SEARCH")) {
			final Collection<MovieVideoDto> searchResults = getVideoSearchClient().searchVideos(
					videoDto.getName(), videoDto.getGenre(), videoDto.getMainActors(), videoDto.getStatus());
			model.addAttribute("searchResults", searchResults);

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "MAIN_MENU")) {
			return "redirect:./home.do";

		} else if (WebUtils.hasSubmitParameter(httpServletRequest, "SELECTED_VIDEO")) {
			model.addAttribute("videoDto", selectedVideoDto);
		}

		return getViewName();
	}

	private VideoSearchClient getVideoSearchClient() {
		return videoSearchClient;
	}

	public void setVideoSearchClient(VideoSearchClient videoSearchClient) {
		this.videoSearchClient = videoSearchClient;
	}

	private String getViewName() {
		return viewName;
	}

	public void setViewName(String aViewName) {
		viewName = aViewName;
	}
}


