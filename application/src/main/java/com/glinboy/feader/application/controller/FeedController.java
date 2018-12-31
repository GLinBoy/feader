package com.glinboy.feader.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class FeedController {
	
	@RequestMapping(path="/feeds")
	@ResponseBody
	public String sayHello() {
		return "Hello World!";
	}
}
