package com.hotel_mgt.flavours_hotel.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel_mgt.flavours_hotel.model.Roles;
import com.hotel_mgt.flavours_hotel.repo.RolesRepo;

@Service
public class RolesService {
	
	@Autowired
	RolesRepo rolesRepo;
	
	public void addRole(String emailId, String role) {
		Roles roles=new Roles(emailId,role);
		rolesRepo.save(roles);
	}

}
