package com.ian.springmvc.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ian.springmvc.model.Customer;

@Controller
@RequestMapping("/jsr303")
public class JSR303ValidateController {

	@RequestMapping(value="/{formName}")
	public String loginForm(@PathVariable String formName, Model model){
		Customer customer = new Customer();
		model.addAttribute("customer", customer);
		return formName;
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String login(@Valid @ModelAttribute Customer customer, Errors errors, Model model){
		if (errors.hasErrors()) {
			return "jsr303_registerForm";
		}
		model.addAttribute("customer", customer);
		return "success2";
	}
}
