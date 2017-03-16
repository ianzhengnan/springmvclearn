package com.ian.springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.DataBinder;
import org.springframework.validation.Errors;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.ian.springmvc.model.User;

@Controller
@RequestMapping(value = "/user")
public class UserController {
	
	private static List<User> users;
	
	public UserController() {
		super();
		users = new ArrayList<User>();
	}
	
	@RequestMapping("")//会匹配 /user 和 /user/
	public String allUsers(Model model){
		
		model.addAttribute("users", users);
		return "users";
	}
	
	@RequestMapping(value="/{loginname}") // 会匹配 /user/{loginname}
	public String getUser(Model model, @PathVariable String loginname){
		
		for (User user : users) {
			if (user.getLoginname().equals(loginname)) {
				model.addAttribute("user", user);
			}
		}
		return "user";
	}
	
	@RequestMapping(value="/register", method=RequestMethod.GET)
	public String registerForm(Model model){
		User user = new User();
		model.addAttribute("user", user);
		return "registerForm";
	}
	
	@InitBinder
	public void initBunder(DataBinder binder){
		binder.setValidator(new UserValidator());
	}
	
	@RequestMapping(value = "/register", method=RequestMethod.POST)
	public String register(
//			@RequestParam("loginname") String loginname,
//			@RequestParam("password") String password,
//			@RequestParam("username") String username,
			@Validated User user,
			Errors errors,
			Model model){

		if(errors.hasFieldErrors()){
			return "registerForm";
		}
		
//		User user = new User();
//		user.setLoginname(loginname);
//		user.setPassword(password);
//		user.setUsername(username);
		users.add(user);
		model.addAttribute("user", user);
		return "loginForm";
	}
	
	@RequestMapping("/login")
	public String login(
			@RequestParam(value="loginname", required=false) String loginname,
			@RequestParam(value="password", required=false) String password,
			Model model){
		
		for (User user : users) {
			if (user.getLoginname().equals(loginname)
					&& user.getPassword().equals(password)) {
				model.addAttribute("user", user);
				return "welcome";
			}
		}
		return "loginForm";
	}
}
