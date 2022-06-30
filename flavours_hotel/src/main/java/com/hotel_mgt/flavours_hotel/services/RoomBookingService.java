package com.hotel_mgt.flavours_hotel.services;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel_mgt.flavours_hotel.model.Bill;
import com.hotel_mgt.flavours_hotel.model.Customer;
import com.hotel_mgt.flavours_hotel.model.RoomBooking;
import com.hotel_mgt.flavours_hotel.model.Rooms;
import com.hotel_mgt.flavours_hotel.repo.BookingHistoryRepo;
import com.hotel_mgt.flavours_hotel.repo.CustomerRepo;
import com.hotel_mgt.flavours_hotel.repo.RoomBookingRepo;
import com.hotel_mgt.flavours_hotel.repo.RoomsRepo;
import com.hotel_mgt.flavours_hotel.repo.ServicesRepo;

@Service
public class RoomBookingService {
	
	@Autowired
	RoomBookingRepo roomBookingRepo;
	@Autowired
	RoomsRepo roomsRepo;
	@Autowired
	CustomerRepo customerRepo;
	@Autowired
	BillService billService;
	@Autowired
	ServicesRepo servicesRepo;
	@Autowired
	BookingHistoryService bookingHsitoryService;
	
	public boolean bookRoom(@RequestParam("roomBooking") RoomBooking roomBooking) {
		Rooms rooms=roomsRepo.findById(roomBooking.getRoomNo()).orElse(null);
		if(Objects.nonNull(rooms)&&rooms.getRoomStatus().equals("Available")) {
			roomBookingRepo.save(roomBooking);
			rooms.setRoomStatus("Booked");
			roomsRepo.save(rooms);
			return true;
		}
		else
			return false;
		
	}
	public boolean isCustomerExist(String email) {
		Customer customer=customerRepo.findById(email).orElse(null);
		if(Objects.nonNull(customer))
			return true;
		else
			return false;
	}
	public void saveBill(RoomBooking roomBooking) {
		Customer customer=customerRepo.findById(roomBooking.getEmail()).orElse(null);
		Rooms rooms=roomsRepo.findById(roomBooking.getRoomNo()).orElse(null);
		Bill bill=new Bill(roomBooking,roomBooking.getEmail(),customer.getUserName(),roomBooking.getTypeOfRoom(),rooms.getPrice());
		billService.addBill(bill);
		String service =roomBooking.getServices();
		if(Objects.nonNull(service) && !service.equals("Select")) {
			Bill bill2=new Bill(roomBooking,roomBooking.getEmail(),customer.getUserName(),service,servicesRepo.findByServiceName(service).getPrice());
			billService.addBill(bill2);
			bookingHsitoryService.add(roomBooking,rooms.getPrice());
		}
	}
}
