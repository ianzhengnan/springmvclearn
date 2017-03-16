package com.ian.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ian.springmvc.model.Data;

@Controller
@RequestMapping(value="/annotation")
public class AnnotationFormatController {

	@RequestMapping(value="/{formName}")
	public String loginForm(@PathVariable String formName){
		return formName;
	}
	
	@RequestMapping(value="/test", method=RequestMethod.POST)
	public String test(@ModelAttribute Data data, Model model){
		model.addAttribute("data", data);
		return "success1";
	}
}
