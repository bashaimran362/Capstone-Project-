package com.hotel_mgt.flavours_hotel.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.Rooms;

@Repository
public interface RoomsRepo extends CrudRepository<Rooms, Integer> {
	
}
