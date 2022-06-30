package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.model.Customer;
import com.hotel_mgt.flavours_hotel.model.ReceptionistLogIn;
import com.hotel_mgt.flavours_hotel.services.AddCustomerService;
import com.hotel_mgt.flavours_hotel.services.ReceptionistLogInService;

@RestController
public class AddReceptionistController {
	
	@Autowired
	ReceptionistLogInService receptionistLogInService;
	
	@GetMapping("/admin/addReceptionist")
	public ModelAndView addReceptionist() {
		ModelAndView mv=new ModelAndView("add-receptionist.jsp");
		mv.addObject("receptionistLogIn",new ReceptionistLogIn());
		return mv;
	}
	
	@PostMapping("/admin/addReceptionist")
	public ModelAndView addCustomer(@ModelAttribute("receptionistLogIn") ReceptionistLogIn receptionistLogIn) {
		ModelAndView mv=new ModelAndView("add-receptionist.jsp");
		if(receptionistLogInService.addReceptionist(receptionistLogIn))
			mv.addObject("success","Successfully Registered");
		else
			mv.addObject("failed","The Email is Already Exist");
		return mv;
		
		
	}

}
