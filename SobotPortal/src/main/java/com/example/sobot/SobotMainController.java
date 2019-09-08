package com.example.sobot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SobotMainController {
	
	
	@RequestMapping("/home")
	public  String getHomePage()
	{
		return "index.html";
	}
	
	@RequestMapping("/signin")
	public String launchEds()
	{
		System.out.println("Launch");
		return "launchEds.html";

	}
	
	@RequestMapping("/signup")
	public String signup()
	{
		System.out.println("Launch");
		return "register.html";

	}
	
	@RequestMapping("/register")
	public String register()
	{
		System.out.println("Launch");
		return "register.html";

	}

}
