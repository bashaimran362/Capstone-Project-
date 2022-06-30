package com.hotel_mgt.flavours_hotel.repo;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.Bill;
import com.hotel_mgt.flavours_hotel.model.RoomBooking;


@Repository
public interface BillRepo extends CrudRepository<Bill, Integer> {
	
	List<Bill> findByCustomerEmail(String customerEmail);
	void deleteByRoomBooking(RoomBooking roomBooking);

}
