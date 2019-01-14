package com.glinboy.feader.application.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping(path = {"/", "/index", "/index.html"})
	String getHomePage() {
		return "index.html";
	}
}
