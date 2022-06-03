package com.dao;

//import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;
//import org.springframework.web.bind.annotation.GetMapping;

//import com.model.Hotel;
import com.model.Room;


public interface RoomRepository extends JpaRepository<Room, Long> {
	
	@Transactional
	void deleteByRoomNo(String number);
	
	
}
