package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.model.RoomBooking;
import com.hotel_mgt.flavours_hotel.services.RoomBookingService;

@Controller
public class BookRoomController {
	@Autowired
	RoomBookingService roomBookingService;
	
	@GetMapping("/customer/bookRoom")
	public ModelAndView customerBookRoom(@RequestParam("emailId") String emailId) {
		ModelAndView mv=new ModelAndView("/customer/book-room.jsp");
		mv.addObject("roomBooking",new RoomBooking());
		mv.addObject("emailId", emailId);
		return mv;
	}
	
	@PostMapping("/customer/bookRoom")
	public ModelAndView customerBookRoom(@ModelAttribute("roomBooking") RoomBooking roomBooking, @RequestParam("emailId") String emailId) {
		ModelAndView mv=new ModelAndView("/customer/book-room.jsp");
		mv.addObject("emailId", emailId);
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
