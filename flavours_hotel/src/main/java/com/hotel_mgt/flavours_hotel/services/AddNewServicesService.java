package com.hotel_mgt.flavours_hotel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel_mgt.flavours_hotel.model.Services;
import com.hotel_mgt.flavours_hotel.repo.ServicesRepo;

@Service
public class AddNewServicesService {

	@Autowired
	ServicesRepo servicesRepo;
	public boolean addNewService(Services services) {
		if(services!=null) {
		servicesRepo.save(services);
		return true;
		}
		else
			return false;
		
	}
	
}
