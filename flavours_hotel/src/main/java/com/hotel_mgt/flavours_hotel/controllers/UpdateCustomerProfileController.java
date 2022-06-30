package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.services.CustomerService;

@Controller
public class UpdateCustomerProfileController {
	
	@Autowired
	CustomerService customerService;
	
	@PostMapping("/customer/updateCustomerProfile")
	public ModelAndView updateCustomerProfile(@RequestParam("userName") String userName,@RequestParam("mobileNumber") long mobileNumber, @RequestParam("userEmail") String userEmail,@RequestParam("address") String address ) {
		
		ModelAndView mv= new ModelAndView("/customer/profile.jsp");
		
			mv.addObject("success","Details Updated Successfully");
			mv.addObject("customer",customerService.updateCustomerProfile(userName,mobileNumber,userEmail,address));
		return mv;
		
	}

}
