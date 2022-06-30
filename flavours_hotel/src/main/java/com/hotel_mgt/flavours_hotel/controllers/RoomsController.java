package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.services.RoomsService;

@RestController
public class RoomsController {
	
	@Autowired
	RoomsService roomsService;
	@GetMapping(value={"/receptionist/availableRooms","/admin/availableRooms","/customer/availableRooms"})
	public ModelAndView availableRooms() {
		
		ModelAndView mv=new ModelAndView("/available-rooms.jsp");
		mv.addObject("listOfAvailableRooms",roomsService.getAvailableRooms());
		return mv;
		
	}

}
