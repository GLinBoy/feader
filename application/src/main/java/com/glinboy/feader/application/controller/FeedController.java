package com.glinboy.feader.application.controller;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glinboy.feader.model.Feed;
import com.glinboy.feader.service.FeedServiceApi;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class FeedController {

	private final FeedServiceApi feedService;
	
	@RequestMapping(path="/feeds")
	public String sayHello(Model model, Pageable pageable) {
		Page<Feed> all = feedService.getAll(pageable);
		model.addAttribute("feeds", all.getContent());
		return "index";
	}
}
