package com.glinboy.feader.application.controller;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glinboy.feader.service.CategoryServiceApi;
import com.glinboy.feader.service.FeedEntryServiceApi;
import com.glinboy.feader.service.FeedServiceApi;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class HomeController {

	private final CategoryServiceApi categoryService;
	private final FeedServiceApi feedService;
	private final FeedEntryServiceApi feedEntryService;

	@RequestMapping(path = {"", "/", "/index", "/index.html"})
	public String getHomePage(Model model, Pageable pageable) {
		model.addAttribute("categories", categoryService.getAll(pageable).getContent());
		model.addAttribute("entries", feedEntryService.getAll(pageable).getContent());
		return "index";
	}
	
	@RequestMapping(path = "/add", headers = "x-requested-with=XMLHttpRequest")
	public String getAddFragment() {
		return "AddNewFeed";
	}
}
