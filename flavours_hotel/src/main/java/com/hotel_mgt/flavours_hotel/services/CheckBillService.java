package com.hotel_mgt.flavours_hotel.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.hotel_mgt.flavours_hotel.model.Bill;
import com.hotel_mgt.flavours_hotel.model.CheckBill;
import com.hotel_mgt.flavours_hotel.repo.BillRepo;

@Service
public class CheckBillService {
	
	@Autowired
	BillRepo billRepo;
	@Autowired
	BillService billService;
	
	public List<Bill> checkBill(@RequestParam("checkBill") CheckBill checkBill){
		List<Bill> bill=billService.getBillOfCustomer(checkBill.getCustomerEmail());
		return bill;
	}
	public List<Bill> checkBill(String emailId){
		List<Bill> bill=billService.getBillOfCustomer(emailId);
		return bill;
	}
	public float countTotalBill(List<Bill> bill) {
		float sum=0;
		for(Bill b:bill) {
			sum+=b.getPrice();
		}
		return sum;
	}

}
