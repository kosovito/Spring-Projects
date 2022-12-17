package com.bolsadeideas.springboot.web.app.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		//return "redirect:/app/index";
		//return "redirect:https://www.google.com";
		//con forward no se cambia la url y se mantienen los parámetros
		return "forward:/app/index";
	}
}
