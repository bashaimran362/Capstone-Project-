package com.hotel_mgt.flavours_hotel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.RoomBooking;

@Repository
public interface RoomBookingRepo extends CrudRepository<RoomBooking, Integer> {

	RoomBooking findByRoomNo(int roomNo);
}
