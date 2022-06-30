package com.hotel_mgt.flavours_hotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel_mgt.flavours_hotel.model.Bill;
import com.hotel_mgt.flavours_hotel.repo.BillRepo;

@Service
public class BillService {
	
	@Autowired
	private BillRepo billRepo;
	
	public void addBill(Bill bill) {
		
		billRepo.save(bill);
		
	}
	public List<Bill> getBillOfCustomer(String customerEmail){
		
		List<Bill> bill=(List<Bill>)billRepo.findByCustomerEmail(customerEmail);
		return bill;
		
	}

}
