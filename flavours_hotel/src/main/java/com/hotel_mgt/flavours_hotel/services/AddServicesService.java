package com.hotel_mgt.flavours_hotel.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel_mgt.flavours_hotel.model.AddServices;
import com.hotel_mgt.flavours_hotel.model.Bill;
import com.hotel_mgt.flavours_hotel.model.Customer;
import com.hotel_mgt.flavours_hotel.model.RoomBooking;
import com.hotel_mgt.flavours_hotel.model.Services;
import com.hotel_mgt.flavours_hotel.repo.BillRepo;
import com.hotel_mgt.flavours_hotel.repo.CustomerRepo;
import com.hotel_mgt.flavours_hotel.repo.RoomBookingRepo;
import com.hotel_mgt.flavours_hotel.repo.ServicesRepo;

@Service
public class AddServicesService {
	
	@Autowired
	BillRepo billRepo;
	@Autowired
	RoomBookingRepo roomBookingRepo;
	@Autowired
	ServicesRepo servicesRepo;
	@Autowired
	BillService billService;
	@Autowired
	CustomerRepo customerRepo;
	
	public boolean addServices(@RequestParam("addService") AddServices addServices) {
		
		RoomBooking roomBooking=roomBookingRepo.findByRoomNo(addServices.getRoomNo());
		Services services=servicesRepo.findByServiceName(addServices.getServiceName());
		if(Objects.nonNull(roomBooking)) {
		Customer customer=customerRepo.findByUserEmail(roomBooking.getEmail());
		if(Objects.nonNull(customer)&&Objects.nonNull(services)) {
		Bill bill=new Bill(roomBooking,roomBooking.getEmail(), customer.getUserName() ,services.getServiceName(),services.getPrice());
		billService.addBill(bill);
		return true;
		}
		}
		return false;
		
	}

}
