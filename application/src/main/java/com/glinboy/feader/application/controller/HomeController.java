package com.glinboy.feader.application.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glinboy.feader.service.FeedEntryServiceApi;
import com.glinboy.feader.service.FeedServiceApi;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {

	private final FeedServiceApi feedService;
	private final FeedEntryServiceApi feedEntryService;

	@RequestMapping(path = {"", "/", "/index", "/index.html"})
	String getHomePage(Model model, Pageable pageable) {
		model.addAttribute("feeds", feedService.getAll(pageable).getContent());
		model.addAttribute("entries", feedEntryService.getAll(pageable).getContent());
		return "index";
	}
}
