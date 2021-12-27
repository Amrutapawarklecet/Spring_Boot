package com.boot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.boot.model.User;




@Controller
public class MvcController {

	@RequestMapping("/")
	public String home() {
		System.out.println("Going home...");
		return "index";
	}

	@GetMapping("/register1")
	public String showForm(Model model) {
		User user = new User();
		List<String> professionList = Arrays.asList("Developer", "Designer", "Tester");
		model.addAttribute("user", user);
		model.addAttribute("professionList", professionList);
		return "registerForm";
	}
	
	@PostMapping("/register")
	public String submitForm(@ModelAttribute("user") User user) {
	     
	    System.out.println(user);
	     
	    return "registerSuccess";
	}
}
