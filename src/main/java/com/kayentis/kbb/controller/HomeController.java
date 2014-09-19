package com.kayentis.kbb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/h")
	public String hello() {
		return "Home";
	}
}
