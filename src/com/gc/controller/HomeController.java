package com.gc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * @author: Antonella Solomon
 *
 */

@Controller
public class HomeController {
	
	@RequestMapping(value= {"/", "index"})
	public ModelAndView homePage() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Beekel Farms Kennel</h3>";
		return new ModelAndView("index", "message", message);
	}

	@RequestMapping("/pricing")
	
	public ModelAndView helloWorld() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Beekel Farms Kennel</h3>";
		return new ModelAndView("pricing", "message", message);
	}
	
	@RequestMapping("/customerProfile")
	public ModelAndView addCustomer() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Beekel Farms Kennel</h3>";
		return new ModelAndView("customerProfile", "message", message);
	}
	
	@RequestMapping("/reserve")
	public ModelAndView reservation() {

		String message = "<br><div style='text-align:center;'>"
				+ "<h3>Beekel Farms Kennel</h3>";
		return new ModelAndView("reserve", "message", message);
	}
	
	
	
	
}
