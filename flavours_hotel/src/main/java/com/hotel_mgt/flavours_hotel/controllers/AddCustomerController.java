package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.model.Customer;
import com.hotel_mgt.flavours_hotel.services.AddCustomerService;

@RestController
public class AddCustomerController {
	
	@Autowired
	AddCustomerService addCustomerService;
	
	@GetMapping(value={"/receptionist/addCustomer","/admin/addCustomer","/customer/register"})
	public ModelAndView addCustomer() {
		ModelAndView mv=new ModelAndView("add-customer.jsp");
		mv.addObject("customer",new Customer());
		return mv;
	}
	
	@PostMapping(value={"/receptionist/addCustomer","/admin/addCustomer","/customer/register"})
	public ModelAndView addCustomer(@ModelAttribute("customer") Customer customer) {
		ModelAndView mv=new ModelAndView("add-customer.jsp");
		if(addCustomerService.addCustomer(customer))
			mv.addObject("success","Successfully Registered");
		else
			mv.addObject("failed","The Email is Already Exist");
		return mv;
		
		
	}

}
