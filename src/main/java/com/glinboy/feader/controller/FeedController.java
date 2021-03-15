package com.glinboy.feader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glinboy.feader.model.Feed;
import com.glinboy.feader.service.FeedServiceApi;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(path = "/feeds")
@RequiredArgsConstructor
public class FeedController {

	private final FeedServiceApi feedService;

	@GetMapping(path = "/{feed_id}")
	public String viewFeed(@PathVariable("feed_id") Long id, Model model) {
		Feed feed = feedService.getSingleById(id);
		model.addAttribute("feed", feed);
		model.addAttribute("entries", feed.getEntries());
		return "fragments/content";
	}
}
