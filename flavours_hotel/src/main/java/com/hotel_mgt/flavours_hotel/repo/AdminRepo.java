package com.hotel_mgt.flavours_hotel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.AdminLogin;

@Repository
public interface AdminRepo extends CrudRepository<AdminLogin, String> {

	

}
