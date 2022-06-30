package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.services.CustomerService;
import com.hotel_mgt.flavours_hotel.services.ReceptionistLogInService;

@RestController
public class ShowAllReceptionistsController {
	
	@Autowired
	ReceptionistLogInService receptionistLogInService;
	
	@GetMapping("/admin/showAllReceptionists")
	public ModelAndView showAllCustomers() {
		
		ModelAndView mv=new ModelAndView("/admin/showAllReceptionists.jsp");
		mv.addObject("allReceptionists",receptionistLogInService.showAllReceptionists());
		return mv;
		
	}

}
