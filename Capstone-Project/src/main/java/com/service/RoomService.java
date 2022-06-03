package com.service;

import java.util.List;
//import com.model.Hotel;
import com.model.Room;

public interface RoomService {

	List<Room> findAll();

	void createRoom(Room room);

	void deleteRoom(Long roomId);

	
	void updateRoom(Room room);
	
//	List<Hotel> findAll1();
}
