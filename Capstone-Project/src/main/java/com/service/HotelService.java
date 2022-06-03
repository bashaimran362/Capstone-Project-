/**
 * 
 */
package com.service;

import java.util.List;


import com.model.Hotel;


public interface HotelService {
	
	List<Hotel> findAll();
	
	void createHotel(Hotel hotel);

	void deleteHotel(Long hotelId);
	
	void updateHotel(Hotel hotel);
}
