package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.model.AddServices;
import com.hotel_mgt.flavours_hotel.model.Services;
import com.hotel_mgt.flavours_hotel.services.AddNewServicesService;
import com.hotel_mgt.flavours_hotel.services.AddServicesService;
import com.hotel_mgt.flavours_hotel.services.BillService;


@RestController
public class AddNewServicesController {

	@Autowired
	AddNewServicesService addNewServicesService;
	
	@GetMapping("/admin/addNewServices")
	public ModelAndView addServices() {
		ModelAndView mv=new ModelAndView("add-new-services.jsp");
		mv.addObject("Services",new Services());
		return mv;
	}
	@PostMapping("/admin/addNewServices")
	public ModelAndView addServices(@ModelAttribute("Services") Services services ) {
		ModelAndView mv=new ModelAndView("add-new-services.jsp");
		if(addNewServicesService.addNewService(services))
			mv.addObject("success","Service Added Successfully");
		else
			mv.addObject("failed","Failed to add service");
		return mv;
	}
	
}
