package com.hotel_mgt.flavours_hotel.model;

import org.springframework.stereotype.Component;

@Component
public class CheckBill {
	
	private String customerEmail;

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	public CheckBill(String customerEmail) {
		super();
		this.customerEmail = customerEmail;
	}

	public CheckBill() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
