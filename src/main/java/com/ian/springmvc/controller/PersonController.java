package com.ian.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ian.springmvc.model.Person;

@Controller
@RequestMapping(value="/convert")
public class PersonController {

	@RequestMapping(value="/{formName}")
	public String loginForm(@PathVariable String formName){
		return formName;
	}
	
	@RequestMapping(value="/register", method=RequestMethod.POST)
	public String register(@ModelAttribute Person person, Model model){
		model.addAttribute("person", person);
		return "success";
	}
}
