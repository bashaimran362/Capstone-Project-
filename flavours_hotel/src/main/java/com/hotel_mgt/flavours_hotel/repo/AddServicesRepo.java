package com.hotel_mgt.flavours_hotel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.AddServices;

@Repository
public interface AddServicesRepo extends CrudRepository<AddServices, Integer> {

	
}
