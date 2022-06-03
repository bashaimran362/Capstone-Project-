

package com.service.impl;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//import com.dao.HotelRepository;
import com.dao.RoomRepository;
//import com.model.Hotel;
import com.model.Room;
import com.service.RoomService;



@Service
public class RoomServiceImpl implements RoomService{
	
	@Autowired
	private RoomRepository repos;
	
//	@Autowired
//	private HotelRepository repos1;


	@Override
	public List<Room> findAll() {
		System.out.println("Inside findAll() method of RoomServiceImpl");
		return repos.findAll();
	}

	@Override
	public void createRoom(Room room) {
		System.out.println("Inside createHotel() method of RoomServiceImpl");
		repos.save(room);
	}

	@Override
	public void deleteRoom(Long roomId) {
		System.out.println("Inside deleteHotel() method of RoomServiceImpl");
		repos.deleteById(roomId);
	}

	@Override
	public void updateRoom(Room room) {
		
		System.out.println("Inside updateHotel() method of RoomServiceImpl");
		//repos.deleteById(room.getId());
		repos.save(room);
	}
	
//	@Override
//	public List<Hotel> findAll1() {
//		System.out.println("Inside findAll() method of HotelServiceImpl");
//		return repos1.findAll();
//	}
}
