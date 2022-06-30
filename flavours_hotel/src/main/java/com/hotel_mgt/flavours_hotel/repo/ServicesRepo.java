package com.hotel_mgt.flavours_hotel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.Services;

@Repository
public interface ServicesRepo extends CrudRepository<Services, Integer> {
	
	Services findByServiceName(String serviceName);

}
