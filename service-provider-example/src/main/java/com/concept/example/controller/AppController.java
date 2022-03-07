package com.concept.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.saml2.provider.service.authentication.Saml2AuthenticatedPrincipal;

@Controller
public class AppController {

	@GetMapping("/")
	public String index(@AuthenticationPrincipal Saml2AuthenticatedPrincipal principal, Model model) {
		model.addAttribute("name", principal.getName());
		return "index";
	}
	
	@GetMapping("/back")
	public String back() {
		return "redirect:https://d-936776d5e7.awsapps.com/start";
	}
	
	
}
