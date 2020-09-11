package com.sts.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/home")
	//@ResponseBody
	public String HomePage()
	{
		System.out.println("This is going to Home Page");
		return "Home_Page";
	}
}
