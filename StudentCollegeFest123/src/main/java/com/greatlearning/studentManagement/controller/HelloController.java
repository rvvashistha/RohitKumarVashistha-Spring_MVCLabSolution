package com.greatlearning.studentManagement.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HelloController {

	@RequestMapping("/register")
	public String showMainPage() {
		return "demo1";
	}
}
