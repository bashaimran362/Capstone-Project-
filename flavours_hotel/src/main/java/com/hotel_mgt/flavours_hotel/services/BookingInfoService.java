package com.hotel_mgt.flavours_hotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel_mgt.flavours_hotel.model.RoomBooking;
import com.hotel_mgt.flavours_hotel.repo.RoomBookingRepo;

@Service
public class BookingInfoService {
	
	@Autowired
	RoomBookingRepo roomBookingRepo;
	public List<RoomBooking> getRoomBookingInfo() {
		
		List<RoomBooking> roomBooking=(List<RoomBooking>) roomBookingRepo.findAll();
		return roomBooking;
		
	}

}
