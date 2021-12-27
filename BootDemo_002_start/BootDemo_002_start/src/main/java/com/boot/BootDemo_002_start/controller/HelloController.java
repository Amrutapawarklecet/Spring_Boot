package com.boot.BootDemo_002_start.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(value="/")
	public String hello() {
		return" Hey Samidha!";
	}
}
