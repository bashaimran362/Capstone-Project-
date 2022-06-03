/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.transaction.annotation.Transactional;

import com.model.Hotel;


public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	@Transactional
	void deleteByHotelName(String name);
}
