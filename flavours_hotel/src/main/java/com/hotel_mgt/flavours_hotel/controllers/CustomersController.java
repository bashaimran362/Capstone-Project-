package com.hotel_mgt.flavours_hotel.controllers;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.services.CustomerService;

@RestController
public class CustomersController {

	@Autowired
	CustomerService customerService;
	
	@GetMapping("/admin/showAllCustomers")
	public ModelAndView showAllCustomers() {
		
		ModelAndView mv=new ModelAndView("/admin/showAllCustomers.jsp");
		mv.addObject("allCustomers",customerService.showAllCustomers());
		return mv;
		
	}
	
	@PostMapping("/customer/profile")
	public ModelAndView customerProfile(@RequestParam("emailId") String emailId) {
		ModelAndView mv=new ModelAndView("/customer/profile.jsp");
		mv.addObject("customer",customerService.getCustomerProfile(emailId));
		return mv;
	}
	
}
