package com.hotel_mgt.flavours_hotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel_mgt.flavours_hotel.model.Rooms;
import com.hotel_mgt.flavours_hotel.repo.RoomsRepo;

@Service
public class RoomsService {

	@Autowired
	RoomsRepo roomsRepo;
	public List<Rooms> getAvailableRooms() {
		List<Rooms> rooms=(List<Rooms>) roomsRepo.findAll();
		return rooms;
		
	}
	
}
