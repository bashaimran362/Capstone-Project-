package com.hotel_mgt.flavours_hotel.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.ReceptionistLogIn;

@Repository
public interface ReceptionistRepo extends CrudRepository<ReceptionistLogIn, String> {

}
