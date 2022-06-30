package com.hotel_mgt.flavours_hotel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.Customer;

@Repository
public interface CustomerRepo extends CrudRepository<Customer, String> {
	
	Customer findByUserEmail(String userEmail);

}
