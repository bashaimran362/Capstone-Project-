package com.hotel_mgt.flavours_hotel.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.hotel_mgt.flavours_hotel.services.BookingInfoService;
import com.hotel_mgt.flavours_hotel.services.RoomBookingService;

@RestController
public class BookingInfoController {
	@Autowired
	BookingInfoService bookingInfoService;
	@GetMapping(value={"/receptionist/bookingInfo","/admin/bookingInfo"})
	public ModelAndView bookingInfo() {
		ModelAndView mv=new ModelAndView("booking-info.jsp");
		mv.addObject("bookingInfo",bookingInfoService.getRoomBookingInfo());
		return mv;
	}

}
