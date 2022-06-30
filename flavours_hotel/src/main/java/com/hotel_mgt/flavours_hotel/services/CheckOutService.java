package com.hotel_mgt.flavours_hotel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel_mgt.flavours_hotel.model.CheckOut;
import com.hotel_mgt.flavours_hotel.model.RoomBooking;
import com.hotel_mgt.flavours_hotel.model.Rooms;
import com.hotel_mgt.flavours_hotel.repo.BillRepo;
import com.hotel_mgt.flavours_hotel.repo.RoomBookingRepo;
import com.hotel_mgt.flavours_hotel.repo.RoomsRepo;

@Service
@Transactional
public class CheckOutService {
	@Autowired
	RoomsRepo roomsRepo;
	@Autowired
	RoomBookingRepo roomBookingRepo;
	@Autowired
	BillRepo billRepo;
	
	public void checkOut(CheckOut checkOut) {
		
		System.out.println(checkOut.getRoomNo());
		System.out.println(checkOut.getUserEmail());
		Rooms rooms=roomsRepo.findById(checkOut.getRoomNo()).orElse(null);
		RoomBooking roomBooking=roomBookingRepo.findById(checkOut.getRoomNo()).orElse(null);
		rooms.setRoomStatus("Available");
		roomsRepo.save(rooms);
		System.out.println("hi");
		billRepo.deleteByRoomBooking(roomBooking);
		System.out.println("hi");
		roomBookingRepo.deleteById(roomBooking.getRoomNo());
		System.out.println("hi");
		
	}

}
