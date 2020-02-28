package com.apache13.poc.rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.apache13.poc.rest.dto.Message;

@RestController
@RequestMapping("/api")
public class HomeController {

	@GetMapping("/message")
	public Message home() {
		return new Message("Hello ...");
	}
}
