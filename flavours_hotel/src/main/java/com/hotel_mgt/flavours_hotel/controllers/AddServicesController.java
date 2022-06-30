package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.model.AddServices;
import com.hotel_mgt.flavours_hotel.services.AddServicesService;
import com.hotel_mgt.flavours_hotel.services.BillService;


@RestController
public class AddServicesController {

	@Autowired
	AddServicesService addServicesService;
	
	@GetMapping("/receptionist/addServices")
	public ModelAndView addServices() {
		ModelAndView mv=new ModelAndView("add-services.jsp");
		mv.addObject("addServices",new AddServices());
		return mv;
	}
	@PostMapping("/receptionist/addServices")
	public ModelAndView addServices(@ModelAttribute("addServices") AddServices addServices ) {
		ModelAndView mv=new ModelAndView("add-services.jsp");
		if(addServicesService.addServices(addServices))
			mv.addObject("success","Service Added Successfully");
		else
			mv.addObject("failed","Failed to add service");
		return mv;
	}
	
}
