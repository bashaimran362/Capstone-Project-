package com.hotel_mgt.flavours_hotel.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.BookingHistory;
import com.hotel_mgt.flavours_hotel.model.RoomBooking;

@Repository
public interface BookingHistoryRepo extends CrudRepository<BookingHistory, String> {

	RoomBooking findByRoomNo(int roomNo);

	List<BookingHistory> findByEmail(String userEmail);
}
