package com.apache13.poc.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.apache13.poc.mvc.dto.Message;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home(Model model) {		
		model.addAttribute("message", new Message("Hello ..."));
		return "index";
	}
}
