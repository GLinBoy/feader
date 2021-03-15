package com.glinboy.feader.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glinboy.feader.model.FeedEntry;
import com.glinboy.feader.service.FeedEntryServiceApi;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping(path = "/entries")
@RequiredArgsConstructor
public class FeedEntryContrller {
	
	private final FeedEntryServiceApi feedEntryService;

	@GetMapping(path= "/{entry_id}")
	public String viewEntry(@PathVariable("entry_id") Long id, Model model) {
		FeedEntry entry  = feedEntryService.getSingleById(id);
		model.addAttribute("entry", entry);
		return "entry";
	}
}
