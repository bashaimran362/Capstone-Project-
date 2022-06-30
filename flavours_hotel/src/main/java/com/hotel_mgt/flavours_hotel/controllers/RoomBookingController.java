package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.model.RoomBooking;
import com.hotel_mgt.flavours_hotel.services.RoomBookingService;

@RestController
public class RoomBookingController {
	@Autowired
	RoomBookingService roomBookingService;
	
	@GetMapping(value={"/receptionist/bookRoom"})
	public ModelAndView bookRoom() {
		ModelAndView mv=new ModelAndView("book-room.jsp");
		mv.addObject("roomBooking",new RoomBooking());
		return mv;
	}
	
	@PostMapping(value={"/receptionist/bookRoom"})
	public ModelAndView bookRoom(@ModelAttribute("roomBooking") RoomBooking roomBooking) {
		ModelAndView mv=new ModelAndView("book-room.jsp");
		if(!roomBookingService.isCustomerExist(roomBooking.getEmail()))
			mv.addObject("failed","Customer is Not Registered");
		else if(roomBookingService.bookRoom(roomBooking)) {
			roomBookingService.saveBill(roomBooking);
			mv.addObject("success","Room Booked Successfully");
		}
		else
			mv.addObject("failed","This Room is not available");
		return mv;
		
	}

}
