package com.hotel_mgt.flavours_hotel.repo;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hotel_mgt.flavours_hotel.model.Roles;


@Repository
public interface RolesRepo extends  CrudRepository<Roles, String> {

}
